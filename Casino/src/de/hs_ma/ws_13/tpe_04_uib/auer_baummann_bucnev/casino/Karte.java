package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import enum_klassen.EnumKartenTypen;
import enum_klassen.EnumKarten;

public class Karte {

	private int wert; // Werte der Karten
	private String farbe; // Zeichen bzw. Farbe der Karten

	// Innere Enum Klasse
	public enum EnumKartenWert {

		ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(
				9), ZEHN(10), BUBE(10), DAME(10), KOENIG(10), AS(11);
	}

	// Innere Enum Klasse
	public enum EnumKartenFarbe {

		PIK, KREUZ, KARO, HERZ;
	}

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
