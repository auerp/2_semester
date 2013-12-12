package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;
//import enum_klassen.EnumKarten;
//import enum_klassen.EnumKartenTypen;

public class Hand {

	private int summe;
	private Spieler spieler;
	private ArrayList<Karte> kartenHand = new ArrayList<Karte>(); // Array oder
																	// ArrayListe???

	// Liste bzw. Array
	// danach leeren

	// boolean blackJack = true;

	// Konstruktor
	public Hand(String name, int summe) {
		this.summe = summe;
	}

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
	public void addKarte(Karte k) { // ISt diese Methode so korrekt und
									// vollstaendig??
		kartenHand.add(k);

	}

	/**
	 * Methode, um die Karten aus der ArrayList (Hand) zu entfernen
	 */
	public void removeKarten() {
		kartenHand.clear();
	}
}
