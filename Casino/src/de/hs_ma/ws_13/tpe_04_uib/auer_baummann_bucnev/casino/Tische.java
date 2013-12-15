package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Hand;
import java.util.*;

public class Tische {

	// private Pot pot;
	private Map<String, Integer> pot;
	private int tischNr = 0;
	private Map<String, Spieler> spieler;
	private KartenDeck kartenDeck;
	Dealer dealer;
	Casino casino;
	private Stack<Spieler> gewinnerSpieler;

	/**
	 * Konstruktor zur Erzeugung eines Tisches
	 * 
	 * @param casino
	 */
	public Tische(Casino casino) {
		this.gewinnerSpieler = new Stack<Spieler>();
		this.casino = casino;
		this.spieler = new HashMap<String, Spieler>();
		this.pot = new HashMap<String, Integer>();
	}

	/**
	 * Methode, um eine Tischnummer zu liefern
	 * 
	 * @return tischNr liefert die Tischnummer
	 */
	public int getTischNr() {
		return this.tischNr;
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

	/**
	 * Innere Klasse die den Dealer enthaelt
	 * 
	 * @author auerp
	 * @author bucnevr
	 * @author baumannt
	 * 
	 */
	class Dealer {
		private Hand hand = new Hand();
		String name;
		double vermoegenDealer;

		/**
		 * Konstruktor zur Erzeugung eines Dealer
		 */
		Dealer(String name, double vermoegen) {
			this.name = name;
			this.vermoegenDealer = vermoegen;
			dealer = this; // greift auf globalen Dealer vom tisch zu
		}

		/**
		 * Methode zum Mischen der Karten
		 */
		public void mischeKarten() {
			KartenMischer.mischeKarten(kartenDeck);

		}

		// Karten austeilen an Spieler und sich selbst
		protected void austeilenKarten() {
			int kartenAnzahl = 0;
			while (kartenAnzahl != 3) {
				for (Spieler it : Tische.this.spieler.values()) {
					Karte karte = Tische.this.kartenDeck.pop();
					it.setHand(karte);
				}
				// Ausgabe der Karten an den Dealer
				this.hand.addKarte(Tische.this.kartenDeck.pop());
				kartenAnzahl++;
			}
		}

		// Karten einsammeln von Spielern
		protected void einsammelnKarten() {
			for (Spieler it : Tische.this.spieler.values()) {
				Hand spielerhand = it.getHand();
				for (Karte karte : spielerhand.getKartenHand()) {
					Tische.this.kartenDeck.push(karte);
				}
				spielerhand.removeKarten();
			}
			ArrayList<Karte> dealerHandKarten = this.hand.getKartenHand();
			for (Karte card : dealerHandKarten) {
				Tische.this.kartenDeck.push(card);
			}
			this.hand.removeKarten();
		}

		// Einsätze der Spieler
		protected int abfragen(Spieler spieler) {
			String id = spieler.getId();
			return Tische.this.pot.get(id);
		}

		// festlegen des Gewinners
		protected void festlegenGewinner() {
			Stack<Spieler> besteSpieler = new Stack<Spieler>();
			gewinnerSpieler.clear();

			for (Spieler spieler : Tische.this.spieler.values()) {
				Hand spielerhand = spieler.getHand();
				int summe = spielerhand.getSumme();
				if (summe <= 21) {
					if (besteSpieler.isEmpty()) {
						besteSpieler.add(spieler);
					} else {
						Hand besteSpielerHand = besteSpieler.firstElement()
								.getHand();
						if (summe == besteSpielerHand.getSumme()) {
							besteSpieler.add(spieler);
						} else if (summe > besteSpielerHand.getSumme()) {
							besteSpieler.clear(); // Liste löschen um den besten
													// spieler danach
													// einzuspeichern
							besteSpieler.add(spieler);
						}
					}
				}
			}
			int dealersumme = this.hand.getSumme();
			if (dealersumme <= 21) {
				Hand besteSpielerHand = besteSpieler.firstElement().getHand();
				if (dealersumme >= besteSpielerHand.getSumme()) {
					besteSpieler.clear();
				}
			}
			gewinnerSpieler = besteSpieler;

		}

		// Auszahlung an Gewinner
		protected void auszahlen(int betrag) {
			if (gewinnerSpieler.isEmpty()) {
				this.vermoegenDealer += betrag;
			} else {
				for (Spieler spieler : gewinnerSpieler) {
					spieler.gewonnen(betrag / gewinnerSpieler.size());
				}
			}
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

}
