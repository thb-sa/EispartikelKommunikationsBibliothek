package funktionaleKlassen;

import java.io.IOException;
import java.io.Serializable;

/**
 * Dieses Interface dient dem Versenden von Objekten.
 * 
 * @author arbeit
 * 
 */
public interface VersendeObjektListener<Austauschobjekt extends Serializable> {
	/**
	 * Diese Methode dient dem Versenden von Objekten.
	 * 
	 * @param austauschobjekt
	 *            , das versendet werden soll.
	 * @throws IOException 
	 */
	public void versende(Austauschobjekt austauschobjekt) throws IOException;
	/**
	 * Methode zum Schliessen des Listeners.
	 * @throws IOException 
	 */
	public void schliesseVersendeObjektListener() throws IOException;

}
