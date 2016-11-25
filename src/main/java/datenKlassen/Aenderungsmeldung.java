package datenKlassen;

import java.io.Serializable;

/**
 * Diese Klasse gibt Auskunft ueber eine Aenderung bei einer Station.
 * 
 * @author Mario Kaulmann
 *
 */
public class Aenderungsmeldung implements Serializable{
	private String stationID;
	private String datum;
	private int abweichung;
	
	public Aenderungsmeldung(String staionID, String datum, int abweichung){
		this.stationID = staionID;
		this.datum = datum;
		this.abweichung = abweichung;
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
}
