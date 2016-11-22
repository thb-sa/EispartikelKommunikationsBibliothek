package datenKlassen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Kommunikator {
    private String host;
    private final static int PORT = 7000;

    public Kommunikator(String host) {
        this.host = host;
    }

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
