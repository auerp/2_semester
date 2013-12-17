package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

public class Spieler {

	private String name;
	private String id = " " + System.identityHashCode(this); // erzeugt
																// automatische
																// ID
	private double vermoegen;
	private Hand hand;
	private int einsatz;

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
	 */
	public int setzen(int einsatz) {
		this.einsatz = einsatz;
		if(einsatz <=0){
			return 0;
		}
		this.vermoegen = this.vermoegen - einsatz;
		return (int) this.vermoegen;
		
	}
	
	public int getEinsatz(){
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
	 * @param karte 
	 * 			Karte eines Spielers
	 */
	public void setHand(Karte karte){
		this.hand.addKarte(karte);
	}
	
	@Override
	public String toString() {
		return "Spieler [name=" + name + ", id=" + id + ", vermoegen="
				+ vermoegen + ", hand=" + hand + "]";
	}
	
}
