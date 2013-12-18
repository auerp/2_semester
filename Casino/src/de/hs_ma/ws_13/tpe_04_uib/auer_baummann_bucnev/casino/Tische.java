package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino.Hand;

import java.util.*;

/**
 * Klasse Tische, die einen Tisch innerhalb des Casinos erzeugt. Die Klasse
 * Tische enthaelt ausserdem eine innere Klasse Dealer, die einen Dealer erzeugt
 * und die Methoden des Spielablaufs enthaelt. Eine weitere innere Klasse Pot,
 * die den Einsatz aller Spieler darstellen soll.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 */
public class Tische {

	private Map<String, Integer> pot;
	private Map<String, Spieler> spieler;
	private KartenDeck kartenDeck;
	Dealer dealer;
	Casino casino;
	private Stack<Spieler> gewinnerSpieler;
	private Stack<Dealer> gewinnerDealer;

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

	@Override
	public String toString() {
		return "Tische [spieler=" + spieler + ", kartenDeck=" + kartenDeck
				+ ", dealer=" + dealer + ", casino=" + casino
				+ ", gewinnerSpieler=" + gewinnerSpieler + "]";
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
		private int einsatz;
		double vermoegenDealer;
		private KartenDeck kartenDeck;

		/**
		 * Konstruktor zur Erzeugung eines Dealer
		 * 
		 * @param name
		 *            Name des Dealers
		 * @param vermoegen
		 *            Vermoegen des Dealers
		 */
		public Dealer(String name, double vermoegen) {
			this.name = name;
			this.vermoegenDealer = vermoegen;
			dealer = this; // greift auf globalen Dealer vom tisch zu
		}

		/**
		 * Methode zum Mischen der Karten
		 */
		public void mischeKarten(KartenDeck kartenDeck) {
			this.kartenDeck = kartenDeck;
			KartenMischer.shuffle(kartenDeck);

		}

		/**
		 * Methode, die das vermoegen des Dealer liefert
		 * 
		 * @return vermoegenDealer liefert das Vermoegen des Dealer
		 */
		public double getDealerVermoegen() {
			return this.vermoegenDealer;
		}

		/**
		 * Methode, um Karten an Spieler und an sich selbst auszuteilen
		 * 
		 * @param kartenDeck
		 *            erzeugtes Kartendeck mit 52 KArten
		 */
		protected void austeilenKarten(KartenDeck kartenDeck) {
			this.kartenDeck = kartenDeck;
			int kartenAnzahl = 0;
			while (kartenAnzahl != 3) {
				for (Spieler it : Tische.this.spieler.values()) {
					Karte karte = Tische.this.dealer.kartenDeck.pop();
					it.setHand(karte);
				}
				Tische.this.dealer.hand.addKarte(Tische.this.dealer.kartenDeck
						.pop()); // Ausgabe der Karten an den Dealer
				kartenAnzahl++;
			}
		}

		/**
		 * Methode um die ausgeteilten Karten nach Spiel Ende wieder
		 * einzusammeln
		 */
		protected void einsammelnKarten() {
			for (Spieler it : Tische.this.spieler.values()) {
				Hand spielerhand = it.getHand();
				for (Karte karte : spielerhand.getKartenHand()) {
					this.kartenDeck.push(karte);
				}
				spielerhand.removeKarten();
			}
			ArrayList<Karte> dealerHandKarten = this.hand.getKartenHand();
			for (Karte karte : dealerHandKarten) {
				this.kartenDeck.push(karte);
			}
			this.hand.removeKarten();
		}

		// Einsätze der Spieler
		/**
		 * Methode um die Einsaetze der Spieler abzufragen
		 * 
		 * @param spieler
		 * @return pot liefert den Pot der die Einsaetze aller Mitspieler
		 *         enthaelt
		 */
		protected int einsatzAbfragen(Spieler spieler) {
			String id = spieler.getId();
			return Tische.this.pot.get(id);
		}
		
		public void setHand(Karte karte) {
			this.hand.addKarte(karte);
		}


		/**
		 * Methode um die gewinner zu bekommen
		 */
		protected void SetzteGewinner() {
			Stack<Spieler> besteSpieler = new Stack<Spieler>();
			Stack<Dealer> besterDealer = new Stack<Dealer>();
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
			if (dealersumme <= 21 && !besteSpieler.isEmpty()) {
				Hand besteSpielerHand = besteSpieler.firstElement().getHand();
				if (dealersumme >= besteSpielerHand.getSumme()) {
					besteSpieler.clear();
					besterDealer.add(dealer);
					gewinnerDealer = besterDealer;
				}
			}
			if (dealersumme > 21 && besteSpieler.isEmpty()) {
				besterDealer.add(dealer);
				gewinnerDealer = besterDealer;

			}
			gewinnerSpieler = besteSpieler;

		}

		/**
		 * Methode um die HAnd des Dealers zu liefern
		 * 
		 * @return hand liefert die Hand des Dealer
		 */
		public Hand getDealerHand() {
			return this.hand;
		}

		/**
		 * Methode um den Gewinner zu liefern
		 * 
		 * @return gewinnerSpieler liefert den Spieler der Gewonnen hat
		 * @return gewinnerDealer liefert den Dealer wenn dieser Gewonnen hat
		 */
		public Stack<?> getGewinner() {
			if (!gewinnerSpieler.isEmpty()) {
				return gewinnerSpieler;
			} else {
				return gewinnerDealer;
			}
		}

		// Auszahlung an Gewinner
		/**
		 * Methode um den Gewinner auszuzahlen
		 * 
		 * @param betrag
		 *            liefert die Summe des auszuzahlenden Betrag
		 */
		protected void auszahlen(int betrag) {
			if (gewinnerSpieler.isEmpty()) {
				this.vermoegenDealer += betrag;
			} else {
				for (Spieler spieler : gewinnerSpieler) {
					spieler.gewonnen(betrag / gewinnerSpieler.size());
				}
			}
		}

		/**
		 * Methode um einen Betrag zu setzen
		 * 
		 * @param einsatz
		 *            Betrag der gesetzt werden soll
		 */
		public int setzen(int einsatz) {
			this.einsatz = einsatz;
			if (einsatz <= 0) {
				return 0;
			}
			this.vermoegenDealer = this.vermoegenDealer - einsatz;
			return (int) this.vermoegenDealer;

		}

		/**
		 * Methode um die Einsaetze zu ermitteln
		 * 
		 * @return einsatz liefert die Einsaetze zurueck
		 */
		public int getEinsatz() {
			return this.einsatz;
		}

		@Override
		public String toString() {
			return "Dealer [hand=" + hand + ", name=" + name
					+ ", vermoegenDealer=" + vermoegenDealer + "]";
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

		private int pot;

		/**
		 * Default Konstruktor
		 */
		Pot() {

		}

		/**
		 * Methode, die den Pot von allen Spielern und dem Dealer einsammelt
		 * 
		 * @return pot 	liefert den gesamten Pot zurueck
		 */
		public int potSammeln() {
			pot = 0;
			for (Spieler spieler : Tische.this.spieler.values()) {
				pot += spieler.getEinsatz();
			
			}
			pot += dealer.getEinsatz();
			return pot;

		}
	}
}
