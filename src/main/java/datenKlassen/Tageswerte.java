package datenKlassen;

import java.io.Serializable;

/**
 * Diese Klasse wird genutzt um die aktuellen Werte und die aktuellen
 * Differenzen fuer einen Tag zu speichern.
 * 
 * @author Mario Kaulmann
 * 
 */
public class Tageswerte implements Serializable {

	/*
	 * Aktueller Wert an dem Tag
	 */
	private int aktuellerWert;
	/*
	 * Differenz zwischen aktuellen Wert und dem Vorgabewert an dem Tag
	 */
	private int abweichung;

	public Tageswerte(int aktuellerWert, int abweichung) {
		this.aktuellerWert = aktuellerWert;
		this.abweichung = abweichung;
	}

	public int getAktuellerWert() {
		return aktuellerWert;
	}

	public int getAbweichung() {
		return abweichung;
	}

}
