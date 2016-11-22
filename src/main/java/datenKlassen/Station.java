package datenKlassen;


import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Diese Klasse bildet eine Eispartikelmessstation im System ab.
 * 
 * @author Mario Kaulmann
 * 
 */
@Data
public class Station implements Serializable {
	/*
	 * Dieser Wert ist der eindeutige identifizierer einer Station im System
	 */
	@NonNull
	private String stationID;
	/*
	 * Dieser Wert gibt an, wie hoch die Konzentration von Eispartikeln in der
	 * Luft sein soll
	 */
	@NonNull
	private int vorgabewert;
	/*
	 * Diese Hashmap enthaelt alle einem Datum zugeordneten aktuellen Werte der
	 * Eispartikelkonzentrationen.
	 */
	private ConcurrentHashMap<String, Integer> aktuelleWerte = new ConcurrentHashMap<String, Integer>();
}
