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
	private ArrayList meineKarten = new ArrayList(); // Array oder ArrayListe???
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

	// liefert Summe der Karten
	public int getSumme() {
		return summe;
	}

	// Neues Deck anlegen??

	// Karten in die ArrayList hinzufügen
	public void addKarten(Hand k) {
		meineKarten.add(k);

	}

	// Karten aus der ArrayList entfernen
	public void removeKarten() {
		meineKarten.clear();
	}
}
