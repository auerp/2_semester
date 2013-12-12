package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Hand;
import java.util.*;

public class Tische {

	private Pot pot;
	private int tischNr = 0;
	private HashMap<String, Spieler> spieler;
	private KartenDeck kartenDeck;
	private Dealer dealer;
	private Casino casino;

	public Tische(Casino casino) {
		this.casino = casino;
		// this.tischNr++;
		this.spieler = new HashMap<String, Spieler>();
		this.dealer = new Dealer();
		this.pot = new Pot();
		// this.kartendeck = new KartenDeck();
		// this.pot = new HashMap<String, Integer>();
	}

	public int getTischNr() {
		return this.tischNr;
	}

	public HashMap<String, Spieler> getSpieler() {
		return this.spieler;

	}

	// //Gewinner 21
	// private static final int blackjack = 21;

	// Innere Klasse (Nonstatic Member Class)
	/**
	 * Innere Klasse die den Dealer enthaelt
	 * 
	 * @author auerp
	 * @author bucnevr
	 * @author baumannt
	 * 
	 */
	class Dealer {

		private ArrayList<Karte> cards = new ArrayList<Karte>();

		/**
		 * Konstruktor zur Erzeugung eines Dealer
		 */
		Dealer() {
		}

		/**
		 * Methode zum Mischen der Karten
		 */
		public void mischeKarten() {
			KartenMischer.mischeKarten(kartenDeck);

		}

		// Karten austeilen an Spieler und sich selbst
		protected void austeilenKarten(Stack<?> kartendeck) {
			// Wie viele Spieler?
			// 3 Karten pro Spieler
			// Dealer spielt mit
			// karten verteilen

			for (int a = 1; a <= 4; a++) {
				for (int b = 1; b <= 13; b++) {
					// Karte c = new Karte(a,b);
					// cards.add(c);
				}
			}
		}

		// Karten einsammeln von Spielern
		protected void einsammelnKarten() {

		}

		// Einsätze der Spieler
		protected void abfragen() {

		}

		// festlegen des Gewinners
		protected void festlegenGewinner() {
			Map<Integer, Spieler> punkteSpieler = new HashMap<Integer, Spieler>;
			
		}

		// Auszahlung an Gewinner
		protected void auszahlen(int betrag) {

		}

	} // Innere Klasse Ende

}
