package datenKlassen;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Diese Klasse erzeugt eine Verbindung mit einem Server, bei der nur Daten
 * empfangen werden koennen.
 */
public class EinwegClientkommunikator<Ankommendes_Objekt extends Serializable>
		extends Thread {
	/*
	 * Verbindung zum Server
	 */
	protected Socket verbindung;
	/*
	 * Port fuer die Kommunikation
	 */
	public final static int EINWEGKOMMUNIKATION = 7000;
	/*
	 * Listener fuer neue Objekte, die vom selben Typ sein muessen, wie die die
	 * dem EinwegClientKommunikator uebergeben wurden.
	 */
	protected NeuesObjektListener<Ankommendes_Objekt> listener;

	/**
	 * Der Konstruktor erstellet eine neue Instanz des
	 * EinwegClientKommunikators. Da es sich um eine Klasse handelt, die von
	 * Thread abgeleitet wird, muss das entsprechende Objhekt gestartet werden.
	 * Um die Synchronisation muss sich selbst gekuemmert werden.
	 * 
	 * @param host
	 *            IP des Servers
	 * @throws IOException
	 * @throws UnknownHostException
	 * 
	 */
	public EinwegClientkommunikator(String host,
			NeuesObjektListener<Ankommendes_Objekt> listener, int port)
			throws UnknownHostException, IOException {
		verbindung = new Socket(host, port);
		this.listener = listener;
	}

	/**
	 * Diese Methode erstellt einen neue Socket Verbindung, die nach neuen
	 * Stationen schaut.
	 */
	public void run() {
		try {
			ObjectInputStream stream;
			try {
				stream = new ObjectInputStream(verbindung.getInputStream());
				while (true) {
					@SuppressWarnings("unchecked")
					Ankommendes_Objekt austausch = (Ankommendes_Objekt) stream
							.readObject();
					listener.neuesAustauschobjekt(austausch);
					if (austausch == null) {
						break;
					}
				}
				verbindung.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
