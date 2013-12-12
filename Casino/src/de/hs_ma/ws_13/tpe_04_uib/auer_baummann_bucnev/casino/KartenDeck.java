package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.Stack;

public class KartenDeck extends Stack<Karte> {

	// Stack<Karte> kartenDeck = new Stack<Karte>();

	/**
	 * Konstruktor zur Erzeugung eines Kartendeck
	 */
	public KartenDeck() {
		deckErstellen();
	}

	/**
	 * Methode, um ein Kartendeck zu erstellen
	 */
	public void deckErstellen() {
		for(Karte.EnumKartenWert wert : Karte.EnumKartenWert.wert(); ){
			for(Karte.EnumKartenFarbe farbe : Karte.EnumKartenFarbe.farbe()){
				
			}}
	}
	// int i = 0;
	// do {
	// kartenDeck[i] = new Karte(EnumKarten.ZWEI, EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ZWEI,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.ZWEI,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ZWEI,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.DREI,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.DREI,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.DREI,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.DREI,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.VIER,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.VIER,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.VIER,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.VIER,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.FUENF,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.FUENF,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.FUENF,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.FUENF,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.SECHS,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.SECHS,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.SECHS,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.SECHS,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.SIEBEN,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.SIEBEN,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new
	// Karte(EnumKarten.SIEBEN,EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.SIEBEN,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.ACHT,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ACHT,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.ACHT,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ACHT,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.NEUN,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.NEUN,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.NEUN,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.NEUN,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.ZEHN,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ZEHN,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.ZEHN,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.ZEHN,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.BUBE,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.BUBE,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.BUBE,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.BUBE,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.DAME,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.DAME,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.DAME,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.DAME,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.KOENIG,
	// EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.KOENIG,
	// EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.KOENIG,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.KOENIG,
	// EnumKartenTypen.PIK);
	// kartenDeck[++i] = new Karte(EnumKarten.AS, EnumKartenTypen.HERZ);
	// kartenDeck[++i] = new Karte(EnumKarten.AS, EnumKartenTypen.KARO);
	// kartenDeck[++i] = new Karte(EnumKarten.AS,
	// EnumKartenTypen.KREUZ);
	// kartenDeck[++i] = new Karte(EnumKarten.AS, EnumKartenTypen.PIK);

	// } while (i < 51);
	//
	// }

	// @Override
	// public String toString() {
	// return "KartenDeck [kartenDeck=" + Arrays.toString(kartenDeck) + "]";
	// }

}
