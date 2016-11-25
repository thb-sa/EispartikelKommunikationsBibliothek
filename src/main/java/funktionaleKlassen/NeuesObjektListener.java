package funktionaleKlassen;

import java.io.Serializable;

/**
 * Dieses Interface soll fuer verschiedene Objekte anwendbar sein und ist daher
 * generisch.
 * 
 * 
 * @param <Austauschobjekt>
 */
public interface NeuesObjektListener<Austauschobjekt extends Serializable> {
	/**
	 * Diese Methode wird verwendet, um das weitere Bearbeiten eines empfangenen
	 * Objekts zu ermoeglichen.
	 * 
	 * @param austauschobjekt
	 */
	void neuesAustauschobjekt(Austauschobjekt austauschobjekt);
}
