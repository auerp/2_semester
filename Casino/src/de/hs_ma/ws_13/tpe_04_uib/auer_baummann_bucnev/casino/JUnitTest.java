package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Karte.EnumKartenFarbe;
import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Karte.EnumKartenWert;

public class JUnitTest {

	Casino casino = new Casino(3, 20000);
	KartenDeck kartenDeck = new KartenDeck();
	Tische tisch1 = new Tische(casino);
	Tische.Dealer dealer1 = tisch1.new Dealer("Hans", 80000);
	Spieler spieler1 = new Spieler("Dodo", 1000, casino);
	ArrayList<Karte> kartenHand = new ArrayList<Karte>();

	@Test
	public void testCasino() {

		
		assertEquals(3, casino.getTische());

		// Im Casino Spieler Tisch zuweisen	 
//		assertEquals(true, casino.spielerTischZuweisen(spieler1));
		
		 // Tisch hinzufügen
		
		
		
	}

	@Test
	public void testHand() {

		Karte karte1 = new Karte(EnumKartenWert.DREI, EnumKartenFarbe.HERZ);
		Karte karte2 = new Karte(EnumKartenWert.BUBE, EnumKartenFarbe.HERZ);

		spieler1.setHand(karte1);
		spieler1.setHand(karte2);

		// AddKarten
		assertEquals(true, kartenHand.add(new Karte(EnumKartenWert.DREI,
				EnumKartenFarbe.HERZ)));
		assertEquals(true, kartenHand.add(new Karte(EnumKartenWert.BUBE,
				EnumKartenFarbe.HERZ)));

		// Summe der Karten auf der Hand
		assertEquals(13, spieler1.getHand().getSumme());

		// removeKarten?
		Hand hand = new Hand();
		hand.addKarte(karte1);
		hand.addKarte(karte2);
		hand.removeKarten();
		assertEquals(true, hand.getKartenHand().isEmpty());
		
	}

	@Test
	public void testKarten() {
		// Werte auslesen
		assertEquals(3,
				new Karte(EnumKartenWert.DREI, EnumKartenFarbe.HERZ).getWert());
		assertEquals(7,
				new Karte(EnumKartenWert.SIEBEN, EnumKartenFarbe.HERZ)
						.getWert());
		assertEquals(10,
				new Karte(EnumKartenWert.BUBE, EnumKartenFarbe.HERZ).getWert());
		assertEquals(11,
				new Karte(EnumKartenWert.AS, EnumKartenFarbe.HERZ).getWert());
	}

	@Test
	public void testKartenDeck() {
		// Deck erstellen
		assertEquals(false, kartenDeck.equals(new KartenDeck()));
		
		//Länge des Decks
		assertEquals(52, kartenDeck.size());

	}

	// TODO wird alles im Dealer getestet oder?
	@Test
	public void testKartenMischer() {
		
		

		// Kartenmischer
		// shuffle Methode testen
//		assertEquals(false, KartenMischer.shuffle(kartenDeck));

	}

	@Test
	public void testSpieler() {

		Karte karte1 = new Karte(EnumKartenWert.DREI, EnumKartenFarbe.HERZ);
		Karte karte2 = new Karte(EnumKartenWert.BUBE, EnumKartenFarbe.HERZ);

		// Einsatz setzen
		assertEquals(900, new Spieler("Lutz", 1000, casino).setzen(100));

		// setHand
		spieler1.setHand(karte1);
		spieler1.setHand(karte2);

		// getHand
		Hand hand = new Hand();
		hand.addKarte(karte1);
		hand.addKarte(karte2);
		//TODO Warum gibt der false aus?
//		assertEquals(true,spieler1.getHand().equals(hand));

		// Pot gewonnen
		
	}

	@Test
	public void testTische() {
		
		tisch1.addSpieler(spieler1);
		
		// addSpieler
		//TODO Das gleiche Spiel hier mit dem false, warum?
//		assertEquals(true ,tisch1.getSpieler().equals(tisch1) );
		
		
		// getAnzahlSpieler
		assertEquals(1, tisch1.getAnzahlSpieler());
	}
	
	@Test
	public void testEinsammeln() {
		KartenDeck kartenDeckNeu =  new KartenDeck ();
		int laengeKarteDeckVorAusteilen = kartenDeckNeu.size();
		dealer1.austeilenKarten(kartenDeckNeu);
		dealer1.einsammelnKarten(); 
		int laengeKarteDeckNachAusteilen = kartenDeckNeu.size();
		assertEquals(true, laengeKarteDeckVorAusteilen == laengeKarteDeckNachAusteilen);
	}

	@Test
	public void testDealer() {
		
	
		// Karten mischen
		KartenDeck kartenDeckNeu =  new KartenDeck ();
		dealer1.mischeKarten(kartenDeckNeu);

		 assertEquals(false, kartenDeck.equals(kartenDeckNeu));
		
		// Gewinner festlegen
//		 assertEquals(true, dealer1.festlegenGewinner());
		 
		// Einsatz abfragen
		 spieler1.setzen(200);
		 
		 assertEquals(200, spieler1.getEinsatz());
		// auszahlen
		 Spieler spieler = new Spieler("Haha",300,casino);
		 Tische tisch = new Tische(casino);
		 tisch.addSpieler(spieler);
		 dealer1.auszahlen(200);
		 assertEquals();
		
	}

	@Test
	public void testPot() {
		Tische.Pot pot;
		int alleEinsaetze = 1000;
		tisch1.addSpieler(spieler1);
		spieler1.setVermoegen(400);
		spieler1.setzen(alleEinsaetze/tisch1.getAnzahlSpieler() + 1);
		dealer1.setzen(alleEinsaetze/tisch1.getAnzahlSpieler() + 1);
		
//		spieler1.gewonnen(Tische.Pot.this.potSammeln());
		
		
	}

}
