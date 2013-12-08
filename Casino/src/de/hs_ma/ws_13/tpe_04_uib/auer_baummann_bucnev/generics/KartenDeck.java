package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;

public class KartenDeck {

	// Liste zur Verwendung des Ka rtendecks
	ArrayList kartenDeck = new ArrayList();

	// Methoden
	// Karten mischen
	public void mischeKarten() {
		//Collections.enumeration(kartenDeck);
		Collections.shuffle(kartenDeck);
		//return 0;
	}
}
