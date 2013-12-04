package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;

public class KartenDeck {
	


	ArrayList meinDeck= new ArrayList();
	
	// Methoden
	// Karten mischen
	public int mischeKarten(){
		Collections.enumeration(meinDeck);
		 Collections.shuffle(meinDeck);
		 return 0;
	}
}
