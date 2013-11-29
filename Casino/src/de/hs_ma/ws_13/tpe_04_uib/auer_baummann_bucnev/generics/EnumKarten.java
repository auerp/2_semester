package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

public enum EnumKarten {

	ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9), ZEHN(
			10), BUBE(10), DAME(10), KOENIG(10), AS(11);

	private int value;

	// Konstruktor
	private EnumKarten(int value) {
		this.value = value;
	}

	// liefert die Werte der ENUM zurück
	private int getValue() {
		return value;
	}

}
