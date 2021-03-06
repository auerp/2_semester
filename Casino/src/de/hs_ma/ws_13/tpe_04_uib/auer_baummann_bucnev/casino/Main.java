package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Tische.Dealer;
import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Tische.Pot;

public class Main {

	public static void main(String[] args) {

		// Casino erzeugen
		Casino casino = new Casino(10, 2500000);

		// Dealer erzeugen
		Tische tisch1 = new Tische(casino);
		Tische.Dealer dealer1 = tisch1.new Dealer("Hans", 80000);
		Tische tisch2 = new Tische(casino);
		Tische.Dealer dealer2 = tisch2.new Dealer("Achmet", 300000);
		// Pot pot1 = new Pot();
		Tische.Pot pot1 = tisch1.new Pot();

		// Kartendeck erzeugen
		KartenDeck kartenDeck = new KartenDeck();

		// Spieler erzeugen
		Spieler spieler1 = new Spieler("Lutz", 1000, casino);
		Spieler spieler2 = new Spieler("Peter", 2000, casino);
		Spieler spieler3 = new Spieler("Gustav", 500, casino);
		Spieler spieler4 = new Spieler("Dieter", 7000, casino);
		Spieler spieler5 = new Spieler("Daniel", 7000, casino);
		Spieler spieler6 = new Spieler("Paul", 7000, casino);
		Spieler spieler7 = new Spieler("Olga", 7000, casino);
		Spieler spieler8 = new Spieler("Ivan", 7000, casino);
		Spieler spieler9 = new Spieler("Michael", 7000, casino);
		Spieler spieler10 = new Spieler("Volker", 7000, casino);
		Spieler spieler11 = new Spieler("Bernhard", 7000, casino);
		Spieler spieler12 = new Spieler("Brunhilde", 7000, casino);
		Spieler spieler13 = new Spieler("Nadine", 7000, casino);
		Spieler spieler14 = new Spieler("Denise", 7000, casino);
		Spieler spieler15 = new Spieler("Detlef", 7000, casino);
		Spieler spieler16 = new Spieler("Dieter", 7000, casino);
		Spieler spieler17 = new Spieler("Axel", 7000, casino);
		Spieler spieler18 = new Spieler("Roman", 7000, casino);
		Spieler spieler19 = new Spieler("Tobias", 7000, casino);
		Spieler spieler20 = new Spieler("Patric", 7000, casino);
		Spieler spieler21 = new Spieler("Laura", 7000, casino);
		Spieler spieler22 = new Spieler("Patricia", 7000, casino);
		Spieler spieler23 = new Spieler("Michelle", 7000, casino);

		// Spieler tische zuweisen
		// Tisch 1
		tisch1.addSpieler(spieler1);
		tisch1.addSpieler(spieler2);
		tisch1.addSpieler(spieler3);
		tisch1.addSpieler(spieler4);
		tisch1.addSpieler(spieler5);
		// Tisch2
		tisch2.addSpieler(spieler6);
		tisch2.addSpieler(spieler7);
		tisch2.addSpieler(spieler8);
		tisch2.addSpieler(spieler9);
		tisch2.addSpieler(spieler10);

		// // Ausgabe Spieler
		// System.out.println(spieler1);
		// System.out.println(spieler2);
		// System.out.println(spieler3);
		// System.out.println(spieler4);

		// Ausgabe Casino
		// System.out.println(casino);

		// Ausgabe Dealer
		// System.out.println(dealer1);

		// Ausgabe Kartendeck
		// System.out.println(kartenDeck);

		// Asugabe Tische
		// System.out.println(tisch1);
		// System.out.println(tisch2);

		// System.out.println(casino.spielerTischZuweisen());

		// dealer1.einsammelnKarten();

		System.out
				.println("***************************************************************************");
		System.out.println("Herzlich Willkommen im Casino Royal \n");
		// System.out.println();
		// System.out.println(casino);
		// System.out.println();
		// System.out.println("Folgende Tische sind vorhanden:");
		// System.out.println(casino.getTische());
		// System.out.println();
		// System.out.println("---------Tisch 1---------");
		// System.out.println("Dealer: " + dealer1);
		// System.out.println("Spieler:");
		// System.out.println(tisch1);
		// System.out.println();
		// System.out.println("---------Tisch 2---------");
		// System.out.println("Dealer: " + dealer2);
		// System.out.println("Spieler:");
		// System.out.println(tisch2);
		// System.out.println();
		// System.out.println();
		System.out
				.println("Verschaffen wir uns einen Einblick ins Spielgeschehen \n");
		
		
		int i = 0;
		do {
			System.out.println("Neues Spiel, neues Gl�ck.");
			System.out.println("Kartendeck: " + kartenDeck + "\n");
			dealer1.mischeKarten(kartenDeck);
			System.out.println("Dealer mischt die Karten: " + kartenDeck + "\n");
			System.out.println("Dealer teilt Karten aus. \n");
			dealer1.austeilenKarten(kartenDeck);
			
			// dealer1.festlegenGewinner();
			System.out.println("Hand des 1. Spielers: " + spieler1.getHand());
			System.out.println("Wert der Hand des 1. Spielers: "
					+ spieler1.getHand().getSumme());
			System.out.println("Vermoegen des 1. Spielers: "
					+ spieler1.getVermoegen() + "\n");
			spieler1.setzen(100);
			System.out.println("Hand des 2. Spielers: " + spieler2.getHand());
			System.out.println("Wert der Hand des 2. Spielers: "
					+ spieler2.getHand().getSumme());
			System.out.println("Vermoegen des 2. Spielers: "
					+ spieler2.getVermoegen() + "\n");
			spieler2.setzen(100);
			System.out.println("Hand des 3. Spielers: " + spieler3.getHand());
			System.out.println("Wert der Hand des 3. Spielers: "
					+ spieler3.getHand().getSumme());
			System.out.println("Vermoegen des 3. Spielers: "
					+ spieler3.getVermoegen() + "\n");
			spieler3.setzen(100);
			System.out.println("Hand des 4. Spielers: " + spieler4.getHand());
			System.out.println("Wert der Hand des 4. Spielers: "
					+ spieler4.getHand().getSumme());
			System.out.println("Vermoegen des 4. Spielers: "
					+ spieler4.getVermoegen() + "\n");
			spieler4.setzen(100);
			System.out.println("Hand des 5. Spielers: " + spieler5.getHand());
			System.out.println("Wert der Hand des 5. Spielers: "
					+ spieler5.getHand().getSumme());
			System.out.println("Vermoegen des 5. Spielers: "
					+ spieler5.getVermoegen() + "\n");
			spieler5.setzen(100);
			System.out.println("Hand des Dealers: " + dealer1.getDealerHand());
			System.out.println("Wert der Hand des Dealers: "
					+ dealer1.getDealerHand().getSumme());
			System.out.println("Vermoegen des Dealers: "
					+ dealer1.getDealerVermoegen() + "\n");
			dealer1.setzen(100);
			System.out.println("Summe des Pots: " + pot1.potSammeln() + "\n");
			dealer1.SetzteGewinner();
			System.out.println("Gewinner dieser Runde: " + dealer1.getGewinner()
					+ "\n");
			dealer1.auszahlen(pot1.potSammeln());
			System.out.println("Neues Vermoegen des 1. Spielers: "
					+ spieler1.getVermoegen() + "\n");
			System.out.println("Neues Vermoegen des 2. Spielers: "
					+ spieler2.getVermoegen() + "\n");
			System.out.println("Neues Vermoegen des 3. Spielers: "
					+ spieler3.getVermoegen() + "\n");
			System.out.println("Neues Vermoegen des 4. Spielers: "
					+ spieler4.getVermoegen() + "\n");
			System.out.println("Neues Vermoegen des 5. Spielers: "
					+ spieler5.getVermoegen() + "\n");
			System.out.println("Neues Vermoegen des Dealers: "
					+ dealer1.getDealerVermoegen() + "\n");
			dealer1.einsammelnKarten();
			
		} while ( spieler1.getVermoegen() > i &&  spieler2.getVermoegen() > i
				&& spieler3.getVermoegen() > i && spieler4.getVermoegen() > i
				&& spieler5.getVermoegen() > i && dealer1.getDealerVermoegen() > i);
		
System.out.println("Spiel beendet.");
	}
}
