package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

public class Casino {

	private int vermoegen;
	private int gewinn;
	private ArrayList<Tische> tische;

	/**
	 * Konstruktor zur Erzeugung des Casinos
	 * 
	 * @param anzahlTische
	 *            Anzahl der Tische
	 * @param vermoegen
	 *            Vermoegen des Casinos
	 */
	public Casino(int anzahlTische, int vermoegen) {
		this.setVermoegen(vermoegen);
		this.tische = new ArrayList<Tische>();
		this.addTische(anzahlTische);
	}

	/**
	 * Methode um neue Tische hinzuzufuegen
	 * 
	 * @param anzahlTische
	 *            Anzahl der Tische
	 */
	private void addTische(int anzahlTische) {
		for (int i = 0; i < anzahlTische; i++) {
			this.tische.add(new Tische(this));
		}
	}

	/**
	 * Methode, um die Anzahl der Tische festzulegen
	 * 
	 * @return tische liefert den Wert der enthaltenen Tische zurueck
	 */
	public ArrayList<Tische> getTische() {
		return tische;
	}

	/**
	 * Methode, um die Spieler einem Tisch zuzuweisen
	 * 
	 * @param spieler
	 */
	public void spielerTischZuweisen(Spieler spieler) {
		boolean tischGefunden = false;
		int zaehler = 0; // zaehler um die Anzahl zu ermitteln

		while (!tischGefunden && zaehler < tische.size()) {
			if (tische.get(zaehler).getAnzahlSpieler() < 16) { // 16 Spieler
																// koennen an
																// einm Tisch
																// sitzen
				tische.get(zaehler).addSpieler(spieler); // Fuegt Spieler hinzu
				tischGefunden = true; // Spieler hat Platz zugewiesen bekommen
			}
			zaehler++;
		}

	}
	
	// Methode starteSpiel
	public String spielStarten(){
		
	}

	/**
	 * Methode die das Vermoegen liefert
	 * 
	 * @return vermoegen liefert den Betrag des Vermoegens zurueck
	 */
	public int getVermoegen() {
		return vermoegen;
	}

	/**
	 * Methode um Vermoegen zu setzen
	 * 
	 * @param vermoegen
	 *            Betrag des Vermoegen
	 */
	public void setVermoegen(int vermoegen) {
		this.vermoegen = vermoegen;
	}

	public int getGewinn() {
		return this.gewinn;
	}

	public void setGewinn(int gewinn) {
		this.gewinn += gewinn;
	}

	
	
	@Override
	public String toString() {
		return "Casino [vermoegen=" + vermoegen + ", gewinn=" + gewinn + "]";
	}

}
