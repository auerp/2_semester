package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Tische{
	
	private int pot;
	
	
	Tische(int pot, ArrayList spieler) {
		
		this.pot = pot;
		
		
	}

	class Dealer {
		
		Dealer(){
			
		}
		// Methoden
		protected void mischen(Stack kartendeck) {
			Collections.shuffle(kartendeck);
		}

		protected void austeilen(Stack kartendeck) {
			// Wie viele Spieler?
			// 3 Karten pro Spieler
			// Dealer spielt mit
		}
		
		//Einsätze der Spieler
		protected void abfragen(){
			
		}
		
		//festlegen des Gewinners
		protected void festlegen(){
			
		}
		
		//Gewinn Auszahlung
		protected void auszahlen(){
			
		}
		
		//Karten einsammeln von Spielern
		protected void einsammeln(){
			
		}

	}

}
