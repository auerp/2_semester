package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

import enum_klassen.EnumKartenTypen;
import enum_klassen.EnumKarten;
import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Tische.Dealer;

public class Main {

	public static void main(String[] args) {

		// Spielerlisten
		ArrayList spielerTisch1 = new ArrayList();
		ArrayList alleTische = new ArrayList();

		KartenDeck deck = new KartenDeck();
		deck.hinzufuegen();
		System.out.println(deck);
		deck.mischeKarten();
		System.out.println(deck);
		// Karte karte = new Karte();
		// karte.getFarbe();
		// Karte karte = new Karte(EnumKarten.ACHT,EnumKartenTypen.KARO);
		// karte.kartenHinzufuegen();
		// System.out.println("zahl");

		// Spieler
		// Spieler spieler1 = new Spieler("Lutz", "01", 1000);
		// Spieler spieler2 = new Spieler("Peter", "02", 2000);
		// Spieler spieler3 = new Spieler("Gustav", "03", 500);
		// Spieler spieler4 = new Spieler("Lutzi", "04", 7000);

		// Spieler der Spielerliste hinzuf�gen
		// spielerTisch1.add(spieler1);
		// spielerTisch1.add(spieler2);
		// spielerTisch1.add(spieler3);
		// spielerTisch1.add(spieler4);

		// Tische anlegen
		Tische tisch1 = new Tische(0, spielerTisch1);

		// Tische der Liste hinzuf�gen
		alleTische.add(tisch1);

		// Casino anlegen
		Casino casino1 = new Casino(0, alleTische);
	}
}