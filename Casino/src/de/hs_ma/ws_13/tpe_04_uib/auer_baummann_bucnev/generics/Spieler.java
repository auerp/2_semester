package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

public class Spieler {

	public enum Teilnehmer {
		Dealer, Spieler;
	}

	private String name;
	private String id;
	private int vermoegen;

	Spieler(String name, String id, int vermoegen) {
		this.name = name;
		this.id = id;
		this.vermoegen = vermoegen;

	}

	public String getName() {
		return this.name;
	}

}
