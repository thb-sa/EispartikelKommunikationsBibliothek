package datenKlassen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * Diese Klasse erzeugt eine Verbindung mit einem Server
 */
public class Kommunikator {
    private String host;
    private final static int PORT = 7000;

    /**
     * Erstellen einer neuen Instance
     *
     * @param host Der Host des Servers
     *
     */
    public Kommunikator(String host) {
        this.host = host;
    }

    /**
     * Diese Methode erstellt einen neue Socket Verbindung, die nach neuen Stationen schaut.
     *
     * @param listener
     * @throws IOException
     */
    public void setNeueStationListener(NeueStationenListener listener) throws IOException {
        Socket socket;
        try {
            socket = new Socket(host, PORT);
            ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                Station station = (Station) stream.readObject();
                listener.neueStation(station);

                if (station == null) {
                    break;
                }
            }
            socket.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
