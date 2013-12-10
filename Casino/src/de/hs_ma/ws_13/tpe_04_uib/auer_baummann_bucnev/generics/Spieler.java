package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

public class Spieler {

	private String name;
	private String id;
//	private int id1=0;
	private int vermoegen;

//	 private Integer intId = new Integer(id1);
	
	private int intId= Integer.parseInt(id); // String wird in Integer umgewandelt 
	//private Integer idIntW = new Integer(intid);

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
	public Spieler(String name, String id,int vermoegen) {
		this.name = name;
		this.vermoegen = vermoegen;
		// setVermoegen(vermoegen);
		this.intId++;
//		this.id = intId.toString();
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
