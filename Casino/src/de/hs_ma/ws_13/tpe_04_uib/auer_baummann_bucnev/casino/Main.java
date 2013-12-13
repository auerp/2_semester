package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;
import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Tische.Dealer;

public class Main {

	public static void main(String[] args) {

		// Spielerlisten
		ArrayList spielerTisch1 = new ArrayList();
		ArrayList alleTische = new ArrayList();

		KartenDeck kartenDeck = new KartenDeck();
		//kartenDeck.hinzufuegen();
		//System.out.println(kartenDeck);
		//kartenDeck.mischeKarten();
		//System.out.println(kartenDeck);
		// Karte karte = new Karte();
		// karte.getFarbe();
		// Karte karte = new Karte(EnumKarten.ACHT,EnumKartenTypen.KARO);
		// karte.kartenHinzufuegen();
		// System.out.println("zahl");

		// Spieler
		Spieler spieler1 = new Spieler("Lutz", 1000, null);
		Spieler spieler2 = new Spieler("Peter", 2000, );
		
		
		System.out.println("Spieler:" + spieler1.getId());
		System.out.println("Spieler:" + spieler2.getId());
		// Spieler spieler3 = new Spieler("Gustav", "03", 500);
		// Spieler spieler4 = new Spieler("Lutzi", "04", 7000);

		// Spieler der Spielerliste hinzufügen
		// spielerTisch1.add(spieler1);
		// spielerTisch1.add(spieler2);
		// spielerTisch1.add(spieler3);
		// spielerTisch1.add(spieler4);

		// Tische anlegen
		//Tische tisch1 = new Tische(0, spielerTisch1);

		// Tische der Liste hinzufügen
		//alleTische.add(tisch1);

		// Casino anlegen
		//Casino casino1 = new Casino(0, alleTische);
	}
}
