package datenKlassen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Kommunikator {
    private String host;
    private int port;

    public Kommunikator(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void setNeueStationListener(NeueStationenListener listener) {
        Socket socket;
        try {
            socket = new Socket(host, port);
            ObjectInputStream stream = new ObjectInputStream(socket.getInputStream());
            while(true) {
                Station station = (Station) stream.readObject();
                listener.neueStation(station);

                if (station == null) {
                    break;
                }
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
