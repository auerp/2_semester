package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Hand;
import java.util.*;

public class Tische {

	private Pot pot;
	private int tischNr = 0;
	private Map<String, Spieler> spieler;
	private KartenDeck kartenDeck;
	private Dealer dealer;
	private Casino casino;

	/**
	 * Konstruktor zur Erzeugung eines Tisches
	 * 
	 * @param casino
	 */
	public Tische(Casino casino) {
		this.casino = casino;
		// this.tischNr++;
		this.spieler = new HashMap<String, Spieler>();
		this.dealer = new Dealer();
		this.pot = new Pot();
		// this.kartendeck = new KartenDeck();
		// this.pot = new HashMap<String, Integer>();
	}

	/**
	 * Methode, um eine Tischnummer zu liefern
	 * 
	 * @return tischNr liefert die Tischnummer
	 */
	public int getTischNr() {
		return this.tischNr;
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
		private Hand hand = new Hand();

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
		protected void austeilenKarten() {
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
			// private Map<String, Spieler> punkteSpieler = new HashMap<String,
			// Spieler>;

			Set<Map.Entry<String, Spieler>> punkteSpieler = Spieler
					.punkteSpieler();
			for (Map.Entry<String, Spieler> entry : punkteSpieler) {
				String id = entry.getKey();
				Spieler value = entry.getValue();
			}

		}

		// Auszahlung an Gewinner
		protected void auszahlen(int betrag) {

		}

	} // Innere Klasse Ende

	/**
	 * Innere Klasse Pot, der die Einsätze der Spieler verwaltet
	 * 
	 * @author auerp
	 * @author bucnevr
	 * @author baumannt
	 * 
	 */
	class Pot {

		// verwendet die ID des Spielers zur Verwaltung der Einsätze

	}

	/**
	 * Methode, um den Spieler zurueck zu liefern
	 * 
	 * @return spieler liefert einen Spieler zurueck
	 */
	public Map<String, Spieler> getSpieler() {
		return spieler;

	}

	/**
	 * Fuegt einen Spieler der Map hinzu
	 * 
	 * @param spieler
	 *            ID, Name und Vermoegen des Spielers
	 */
	public void addSpieler(Spieler spieler) {
		this.spieler.put(spieler.getId(), spieler);
	}

	/**
	 * Gibt die Anzahl der Spieler zurueck
	 * 
	 * @return spieler liefert die Anzahl der Spieler zurueck
	 */
	public int getAnzahlSpieler() {
		return spieler.size();
	}

}
