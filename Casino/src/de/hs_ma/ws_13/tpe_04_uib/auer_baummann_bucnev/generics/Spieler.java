package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

public class Spieler {

	private String name;
	private String id;
	private int vermoegen;

	int intId = Integer.parseInt(id); // String wird in Integer umgewandelt

	// Integer integerId = new Integer(stringId);

	/**
	 * Konstruktor zur Erzeugung eines Spielers
	 * 
	 * @param name
	 *            Name eines Spielers
	 * @param id
	 *            ID eines Spielers
	 * @param vermoegen
	 *            Das Vermoegen eines Spielers
	 */
	public Spieler(String name, String id, int vermoegen) {
		this.name = name;
		this.vermoegen = vermoegen;
		// setVermoegen(vermoegen);
		this.intId++;
		this.id = intId.toString();
	}

	// Geld setzen
	public void setzen(int betrag) {
		this.vermoegen = this.vermoegen - betrag;
	}

	/**
	 * Methode um den Betrag zu erhoehen wenn ein Spieler gewonnen hat
	 * 
	 * @param betrag
	 *            Betrag um welchen das Vermoegen erhoeht wird
	 */
	public void gewonnen(int betrag) {
		this.vermoegen = this.vermoegen + betrag;
	}

	/**
	 * Methode, die den Name liefert
	 * 
	 * @return name liefert den Name des Spielers
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Methode, um die ID zu ermitteln
	 * 
	 * @return id liefert die ID des Spielers
	 */
	public String getId() {
		return this.stringId;
	}

	// // getVermoegen
	// public int getVermoegen() {
	// return this.vermoegen;
	// }
	//
	// // Setter Methoden
	// // setVermoegen
	// public void setVermoegen(int vermoegen) {
	// this.vermoegen = vermoegen;
	// }
}
