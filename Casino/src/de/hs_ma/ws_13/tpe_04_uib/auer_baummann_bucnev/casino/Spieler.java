package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

/**
 * Klasse Spieler. Sie dient zur Erzeugung eines Spielers
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 */
public class Spieler {

	private String name;
	private String id = " " + System.identityHashCode(this); // erzeugt
																// automatische
																// ID
	private double vermoegen;
	private Hand hand;
	private int einsatz;

	/**
	 * /** Konstruktor zur Erzeugung eines Spielers
	 * 
	 * @param name
	 *            Name eines Spielers
	 * @param vermoegen
	 *            Das Vermoegen eines Spielers
	 * @param casino
	 *            Casino in dem der Spieler vorhanden ist
	 */
	public Spieler(String name, double vermoegen, Casino casino) {
		this.name = name;
		this.vermoegen = vermoegen;

		this.hand = new Hand();
		casino.spielerTischZuweisen(this);
	}

	/**
	 * Methode um einen Betrag zu setzen
	 * 
	 * @param einsatz
	 *            Betrag der gesetzt werden soll
	 * @return 0 liefert den Betrag Null zurueck wenn nichts gesetzt wurde
	 * @return vermoegen liefert das errechnete vermoegen zurueck
	 */
	public int setzen(int einsatz) {
		this.einsatz = einsatz;
		if (einsatz <= 0) {
			return 0;
		}
		this.vermoegen = this.vermoegen - einsatz;
		return (int) this.vermoegen;

	}

	/**
	 * Methode die den Einsatz liefert
	 * 
	 * @return einsatz liefert den Einsatz
	 */
	public int getEinsatz() {
		return this.einsatz;
	}

	/**
	 * Methode um den Betrag zu erhoehen wenn ein Spieler gewonnen hat
	 * 
	 * @param betrag
	 *            Betrag um welchen das Vermoegen erhoeht wird
	 */
	public void gewonnen(double betrag) {
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

	/**
	 * Gibt die Hand eines Spielers zurueck
	 * 
	 * @return hand liefert die Hand eines Spielers
	 */
	public Hand getHand() {
		return this.hand;
	}

	/**
	 * Liefert das Vermoegen eines Spielers
	 * 
	 * @return vermoegen liefert das vermoegen eines Spielers zurueck
	 */
	public double getVermoegen() {
		return this.vermoegen;
	}

	/**
	 * Methode, die das Vermoegen eines Spielers ermittelt
	 * 
	 * @param vermoegen
	 *            Vermoegen eines Spielers
	 */
	public void setVermoegen(int vermoegen) {
		this.vermoegen = vermoegen;
	}

	/**
	 * Methode, die die eine Karte in die Hand nimmt
	 * 
	 * @param karte
	 *            Karte eines Spielers
	 */
	public void setHand(Karte karte) {
		this.hand.addKarte(karte);
	}

	@Override
	public String toString() {
		return "Spieler [name=" + name + ", id=" + id + ", vermoegen="
				+ vermoegen + ", hand=" + hand + "]";
	}

}
