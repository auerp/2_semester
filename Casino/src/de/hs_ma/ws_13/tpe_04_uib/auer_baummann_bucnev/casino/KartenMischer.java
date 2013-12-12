package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.Arrays;
import java.util.Collections;

/**
 * Interface , das als zentraler Kartenmischer im Casiono dient.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 */
public class KartenMischer {

	private static final KartenMischer instanz = new KartenMischer();

	/**
	 * Default-Konstruktor zur Erzeugung des Kartenmischers
	 */
	private KartenMischer() {

	}

	/**
	 * Statische Methode, liefert die einzige Instanz dieser Klasse zurueck
	 * 
	 * @return instanz liefert die instanz der Klasse
	 */
	public static KartenMischer getInstance() {
		return instanz;
	}

	/**
	 * Methode, um die Karten eines Kartendecks zu mischen
	 */
	public void mischeKarten(KartenDeck kartenDeck) {
		return Collections.shuffle(kartenDeck);
	}
}
