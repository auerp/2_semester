package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import java.util.ArrayList;

/**
 * Klasse zur Erzeugung eines Schurken Syndikats
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class SchurkenSyndikat implements Koerperschaftssteuer {

	/**
	 * Variable um den Namen eines Schurken festzulegen
	 */
	String name;

	/**
	 * Liste, um die Schurken in einem Syndikat verwalten zu koennen
	 */
	static ArrayList<Schurken> listSchurkenSyndikat = new ArrayList<Schurken>();

	/**
	 * Konstruktor um ein Schurken Syndikat anzulegen
	 * 
	 * @param name
	 *            Name des Schurken Syndikats
	 * @param ArrayList
	 *            Liste von Schurken, die in diesem Syndikat aktiv sind
	 */
	public SchurkenSyndikat(String name, ArrayList<Schurken> schurken) {
		this.name = name;
		Finanzamt.KoeperschaftssteuerPflicht(this);
		listSchurkenSyndikat = schurken;

	}

	/**
	 * Methode um Schurken einer Liste hinzuzufügen
	 * 
	 * @param schurke
	 */
	public static void addSchurke(Schurken schurke) {
		listSchurkenSyndikat.add(schurke);

	}

	/**
	 * Methode zur Berechnung der Koerperschaftssteuer
	 * 
	 * @return liefert den errechneten Betrag der Koerperschaftssteuer zurück
	 */
	public int berechneKoerperschaftssteuer() {

		int summeEinkommen = 0;
		for (Schurken schurk : listSchurkenSyndikat) {
			summeEinkommen += schurk.getEinkommen();
		}
		if (summeEinkommen <= 0) {
			return 0;
		} else {
			return ((summeEinkommen / 100) * Konstanten.LINEARERSTEUERSATZ_KOERPER);
		}
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "SchurkenSyndikat{" + "listSchurkenSyndikat="
				+ listSchurkenSyndikat + '}';
	}
}