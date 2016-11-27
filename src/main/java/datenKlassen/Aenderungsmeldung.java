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
	private int abweichung;
	private int relativeAbweichung;

	public Aenderungsmeldung(String staionID, String datum, int abweichung,
			int relativeAbweichung) {
		this.stationID = staionID;
		this.datum = datum;
		this.abweichung = abweichung;
		this.relativeAbweichung = relativeAbweichung;
	}

	public String getStationID() {
		return stationID;
	}

	public String getDatum() {
		return datum;
	}

	public int getAbweichung() {
		return abweichung;
	}

	public int getRelativeAbweichung() {
		return relativeAbweichung;
	}
}
