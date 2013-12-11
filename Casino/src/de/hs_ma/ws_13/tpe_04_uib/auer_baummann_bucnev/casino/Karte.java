package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import enum_klassen.EnumKartenTypen;
import enum_klassen.EnumKarten;

public class Karte {

	private EnumKarten wert; // Werte der Karten
	private EnumKartenTypen farbe; // Zeichen bzw. Farbe der Karten

	// private String deck[][] = new String[4][13];

	/**
	 * Konstruktor zur Erzeugung der Karte
	 * 
	 * @param wert
	 *            Wert den die KArte enthaelt
	 * @param typ
	 *            Farbe den die Karte enthaelt
	 */
	public Karte(EnumKarten wert, EnumKartenTypen farbe) {
		this.wert = wert;
		this.farbe = farbe;
	}

	/**
	 * Methode die die Farbe der Karte liefert
	 * 
	 * @return typ liefert die Farbe der Karte zurueck
	 */
	public EnumKartenTypen getFarbe() {
		return farbe;
	}

	/**
	 * Methode die den Wert der Karte liefert
	 * 
	 * @return wert liefert den Wert der Karte zurueck
	 */
	public EnumKarten getWert() {
		return wert;
	}

	/**
	 * Methode, ...
	 */
	public String toString() {
		return "Karte [wert=" + wert + ", farbe=" + farbe + "]";
	}
}
