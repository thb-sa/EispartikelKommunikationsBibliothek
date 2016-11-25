package funktionaleKlassen;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.UnknownHostException;

/**
 * Diese Klasse dient der Kommunikation in beide Richtung. Vom Client zum Server
 * und zurueck.
 * 
 * @author Mario Kaulmann
 * 
 * @param <Ankommendes_Objekt>, was empfangen wird
 * @param <Versende_Objekt>, was gesendet werden soll
 */
public class ZweiwegeClientkommunikator<Ankommendes_Objekt extends Serializable, Versende_Objekt extends Serializable>
		extends EinwegClientkommunikator<Ankommendes_Objekt> implements
		VersendeObjektListener<Versende_Objekt> {

	private ObjectOutputStream out;

	public static final int ZWEIWEGEKOMMUNIKATION = 7001;

	public ZweiwegeClientkommunikator(String host,
			NeuesObjektListener<Ankommendes_Objekt> listener, int port)
			throws UnknownHostException, IOException {
		super(host, listener, port);
		out = new ObjectOutputStream(verbindung.getOutputStream());
	}

	@Override
	public void versende(Versende_Objekt austauschobjekt) throws IOException {
		out.writeObject(austauschobjekt);
	}

	@Override
	public void schliesseVersendeObjektListener() throws IOException {
		verbindung.close();
	}
}
