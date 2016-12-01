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

	public enum Darstellung { NORMAL, HOCH, NIEDRIG };

	/*
	 * Aktueller Wert an dem Tag
	 */
	private int aktuellerWert;
	/*
	 * Differenz zwischen aktuellen Wert und dem Vorgabewert an dem Tag
	 */
	private int abweichung;
	/*
	 * relative Abweichung
	 */
	private int relativeAbweichung;

	/*
	 * Als was der Wert in der GUI dargestellt werden soll
	 */
	private Darstellung darstellung;

	public Tageswerte(int aktuellerWert, int abweichung, int relativeAbweichung, Darstellung darstellung) {
		this.aktuellerWert = aktuellerWert;
		this.abweichung = abweichung;
		this.relativeAbweichung = relativeAbweichung;
		this.darstellung = darstellung;
	}

	public int getAktuellerWert() {
		return aktuellerWert;
	}

	public int getAbweichung() {
		return abweichung;
	}

	public int getRelativeAbweichung() {
		return relativeAbweichung;
	}

	public Darstellung getDarstellung() {
		return darstellung;
	}
}
