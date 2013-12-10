package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class KartenDeck extends Karte implements KartenMischer {

	// Liste zur Verwendung des Ka rtendecks
	ArrayList kartenDeck = new ArrayList();

	public KartenDeck(ArrayList kartenDeck) {
		this.kartenDeck = kartenDeck;

	}

	protected HashMap<String, String> alleKarten = new HashMap<String, String>();

	// Karten hinzufügen
	public void kartenHinzufuegen() {

		for (int i = 0; i < typ.length; i++) {
			for (int k = 0; k < wert; k++) {
				deck[i][k] = typ[i] + " " + wert[k];
				alleKarten.put(deck[i][k], wert[k]);

				// System.out.println(deck[i][k]);
				// System.out.println(alleKarten.get(deck[i][k]));

			}
		}

	}

	// public String convertToString(int farben) {
	// return farbe[farben];
	// }

	// Methoden
	// Karten mischen
	public void mischeKarten() {

		// Collections.enumeration(kartenDeck);
		Collections.shuffle(kartenDeck);
		// return 0;
	}
}
