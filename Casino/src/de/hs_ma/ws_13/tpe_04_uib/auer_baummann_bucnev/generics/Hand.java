package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
//import enum_klassen.EnumKarten;
//import enum_klassen.EnumKartenTypen;

public class Hand<K> {

	private int summe;
	// private ArrayList<EnumKartenTypen> enumKartenTypen = new
	// ArrayList<EnumKartenTypen>();
	// private ArrayList<EnumKarten> enumKarten = new ArrayList<EnumKarten>();
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

	// private int getKartenAnzahl(){
	// return kartenAnzahl;
	// }

	/**
	 * Methode um die Summe aller Karten zu ermitteln
	 * 
	 * @return summe liefert die Summer aller Karten zurueck
	 */
	public int getSumme() {
		return summe;
	}

	// Neues Deck anlegen??

	/**
	 * Methode, um die Karten der ArrayList (Hand) hinzuzufuegen
	 * 
	 * @param k
	 */
	// Karten in die ArrayList hinzufügen
	public void addKarte(Karte k) {
		kartenHand.add(k);

	}

	/**
	 * Methode, um die Karten aus der ArrayList (Hand) zu entfernen
	 */
	// Karten aus der ArrayList entfernen
	public void removeKarten() {
		kartenHand.clear();
	}
}
