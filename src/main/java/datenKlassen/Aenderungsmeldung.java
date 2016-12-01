package datenKlassen;

import java.io.Serializable;

/**
 * Diese Klasse gibt Auskunft ueber eine Aenderung bei einer Station.
 * 
 * @author Mario Kaulmann
 * 
 */
public class Aenderungsmeldung implements Serializable {
	private String stationID;
	private String datum;
	private Tageswerte tageswerte;

	public Aenderungsmeldung(String staionID, String datum, int wert, int abweichung,
							 int relativeAbweichung, Tageswerte.Darstellung darstellung) {
		this.stationID = staionID;
		this.datum = datum;
		this.tageswerte = new Tageswerte(wert, abweichung, relativeAbweichung, darstellung);
	}

	public String getStationID() {
		return stationID;
	}

	public String getDatum() {
		return datum;
	}

	public Tageswerte getTageswerte(){
		return tageswerte;
	}
}
