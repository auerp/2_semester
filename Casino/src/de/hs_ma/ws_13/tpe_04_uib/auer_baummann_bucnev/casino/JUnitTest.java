package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import static org.junit.Assert.*;

import org.junit.Test;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Karte.EnumKartenFarbe;
import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Karte.EnumKartenWert;

public class JUnitTest {

	Casino casino = new Casino(3, 20000);
	KartenDeck kartenDeck = new KartenDeck();

	@Test
	public void testCasino() {
		
//		assertEquals(5, casino.addTische(5));

		// Im Casino
		// Spieler Tisch zuweisen
		// Tisch hinzufügen
	}
	
	

	@Test
	public void testHand(){

	// Hand
	// Summe der Karten auf der Hand
	// AddKarten
	// removeKarten?
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
		// KartenDeck
		// Deck erstellen
		// TODO ergibt das Sinn?
		assertEquals(false, kartenDeck.equals(new KartenDeck()));

	}

	// TODO wird alles im Dealer getestet oder?
	@Test
	public void testKartenMischer() {
		// Kartenmischer
		// shuffle Methode testen

	}

	@Test
	public void testSpieler() {
		// Spieler

		assertEquals(900, new Spieler("Lutz", 1000, casino).setzen(100));
		// Einsatz setzen
		// Pot gewonnen
		// getHand
		// setHand
	}

	@Test
	public void testTische() {
		// Tische
		// addSpieler
		// getAnzahlSpieler
	}

	@Test
	public void testDealer() {

//		assertEquals(false, kartenDeck.equals(new Tische.Dealer("Gustav", 200)
//				.mischeKarten(kartenDeck)));
		// Dealer
		// Karten mischen
		// Karten einsammeln
		// Einsatz abfragen
		// Gewinner festlegen
		// auszahlen
	}

	@Test
	public void testPot() {
		// Pot
	}

}
