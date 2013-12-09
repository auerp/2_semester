package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;
						
public class KartenDeck extends Karte implements KartenMischer  {
	
	// Liste zur Verwendung des Ka rtendecks
		ArrayList kartenDeck = new ArrayList();

	
	public KartenDeck(ArrayList kartenDeck) {
		this.kartenDeck = kartenDeck;

	}

	

//	public void kartenHinzufuegen(){
//	
//	}
	
	// Methoden
	// Karten mischen
	public  void mischeKarten() {
		
		//Collections.enumeration(kartenDeck);
		Collections.shuffle(kartenDeck);
		//return 0;
	}
}
