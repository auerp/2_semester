package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

public class Spieler {

	// public enum Teilnehmer {
	// Dealer, Spieler;
	// }

	private String name;
	private String id;
	private int vermoegen;

	//Konstruktor
	Spieler(String name, String id, int vermoegen) {
		this.name = name;
		this.id = id;
		// this.vermoegen = vermoegen;
		setVermoegen(vermoegen);
	}

	// Getter Methoden
	// getName
	public String getName() {
		return this.name;
	}

	// getID
	public String getId() {
		return this.id;
	}

	// getVermoegen
	public int getVermoegen(int vermoegen) {
		return this.vermoegen;
	}

	// Setter Methoden
	// setVermoegen
	public void setVermoegen(int vermoegen) {
		this.vermoegen = vermoegen;
	}
}
