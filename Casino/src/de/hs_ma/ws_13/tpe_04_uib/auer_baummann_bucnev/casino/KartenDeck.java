package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.Stack;

public class KartenDeck extends Stack<Karte> {

	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor zur Erzeugung eines Kartendeck
	 */
	public KartenDeck() {
		deckErstellen(); // Aufruf der Methode deckErstellen(), damit ein
							// Kartendeck erzeugt wird
	}

	/**
	 * Methode, um ein Kartendeck zu erstellen
	 */
	public void deckErstellen() {
		for (Karte.EnumKartenWert wert : Karte.EnumKartenWert.values()) {
			for (Karte.EnumKartenFarbe farbe : Karte.EnumKartenFarbe.values()) {
				add(new Karte(wert, farbe)); // Fuegt Karte hinzu
			}
		}
	}

	
	
}
