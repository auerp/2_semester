package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

public class Hand {

	private int summe;
	private ArrayList<Karte> kartenHand = new ArrayList<Karte>();

	// // Konstruktor
	// public Hand(String name, int summe) {
	// this.summe = summe;
	// }

	/**
	 * Methode um die Summe aller Karten zu ermitteln
	 * 
	 * @return summe liefert die Summer aller Karten zurueck
	 */
	public int getSumme() {
		for (Karte karte : kartenHand) {
			summe = summe + karte.getWert();
		}
		return summe;
	}

	/**
	 * Methode, um die Karten der ArrayList (Hand) hinzuzufuegen
	 * 
	 * @param k
	 *            karte
	 */
	public void addKarte(Karte k) {
		if (kartenHand.size() < 3) {
			this.kartenHand.add(k);
		}
	}

	/**
	 * Methode, um die Karten aus der ArrayList (Hand) zu entfernen
	 */
	public void removeKarten() {
		kartenHand.clear();
	}
}
