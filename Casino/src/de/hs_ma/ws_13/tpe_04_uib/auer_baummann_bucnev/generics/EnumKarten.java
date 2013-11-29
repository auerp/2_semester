package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Enumklasse zur Erzeugung der Karten mit deren Werten
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 18.11.2013
 * 
 */
public enum EnumKarten {

	ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9), ZEHN(
			10), BUBE(10), DAME(10), KOENIG(10), AS(11);

	private int wert;

	// Konstruktor
	private EnumKarten(int wert) {
		this.wert = wert;
	}

	// liefert die Werte der ENUM zurück
	private int getWert() {
		return wert;
	}

}
