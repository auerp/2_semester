package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

public class Spieler {

	private String name;
	private String id = " " + System.identityHashCode(this); // erzeugt
																// automatische
																// ID
	private int vermoegen;
	private Hand hand;

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
	public Spieler(String name, int vermoegen) {
		this.name = name;
		this.vermoegen = vermoegen;
	}

	/**
	 * Methode um einen Betrag zu setzen
	 * 
	 * @param betrag
	 *            Betrag der gesetzt werden soll
	 */
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
		return this.id;
	}

	// getVermoegen
	public int getVermoegen() {
		return this.vermoegen;
	}

	// Setter Methoden
	// setVermoegen
	public void setVermoegen(int vermoegen) {
		this.vermoegen = vermoegen;
	}

}
