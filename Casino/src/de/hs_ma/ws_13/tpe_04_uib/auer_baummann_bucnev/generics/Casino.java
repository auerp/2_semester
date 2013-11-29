package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;


public class Casino {

	private int vermoegen;

	// Innere Klasse
	private class Dealer{
		
		// ArrayList für das Kartendeck
		private ArrayList arrayListKartenDeck = new ArrayList();
		
		//Methoden
		private  mischen(ArrayList arrayListKartenDeck){
			return shuffle();
		}
		
		private ... austeilen(){
			
		}
		
		// mischt das Kartendeck
		protected ArrayList shuffle(ArrayList arrayListKartenDeck){
				Collections.shuffle(arrayListKartenDeck);
			
		}
	}
}
