package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.Collections;
import java.util.Stack;

public class Tische extends Casino {

	class Dealer {
		// Methoden
		protected void mischen(Stack kartendeck) {
			Collections.shuffle(kartendeck);
		}

		protected void austeilen(Stack kartendeck) {
			// Wie viele Spieler?
			// 3 Karten pro Spieler
			// Dealer spielt mit
		}

	}

}
