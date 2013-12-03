package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Tische {

	//Deckgröße
	private static final int DECK_SIZE = KartenDeck.Kartenwert.values().length * KartenDeck.KartenTyp.values().length;
	//Gewinner 21
	private static final int blackjack = 21;
	
	private int pot;

	// Listen zur Verwaltung der Spieler
	private ArrayList<Spieler> spieler = new ArrayList<Spieler>();

	Tische(int pot, ArrayList<Spieler> spieler) {
		this.pot = pot;
		this.spieler = spieler;
	}

	// Innere Klasse (Nonstatic Member Class)
	class Dealer {

		Dealer() {
			// this.dealer = dealer;

		}

		// Methoden
		// Karten mischen
		protected void mischenKarten(Stack<?> kartendeck) {
			Collections.shuffle(kartendeck);
		}

		// Karten austeilen an Spieler und sich selbst
		protected void austeilenKarten(Stack<?> kartendeck) {
			// Wie viele Spieler?
			// 3 Karten pro Spieler
			// Dealer spielt mit
		}

		// Einsätze der Spieler
		protected void abfragen() {

		}

		// festlegen des Gewinners
		protected void festlegenGewinner() {

		}

		// Auszahlung an Gewinner
		protected void auszahlen() {

		}

		// Karten einsammeln von Spielern
		protected void einsammelnKarten() {

		}

	} // Innere Klasse Ende

}
