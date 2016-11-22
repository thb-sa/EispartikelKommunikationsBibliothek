package datenKlassen;


import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;

/**
 * Dieses Objekt bildet eine Aenderung einer Station ab.
 * 
 * @author Mario Kaulmann
 * 
 */
@Data
public class StationAenderung implements Serializable{
	/*
	 * Der Name / ID der betroffenen Station.
	 */
	@NonNull
	private String name;
	/*
	 * Datum an dem sich der wert geaendert hat.
	 */
	@NonNull
	private String datum;
	/*
	 * Wert fuer das entsprechende Datum.
	 */
	@NonNull
	private int wert;
}
