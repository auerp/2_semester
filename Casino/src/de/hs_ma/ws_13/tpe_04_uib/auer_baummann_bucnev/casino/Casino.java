package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

public class Casino {

	private int vermoegen;
	private int gewinn;
	private ArrayList<Tische> tische;

	// private ArrayList<Spieler> spieler;

	Casino(int anzahlTische, int vermoegen) {
		this.setVermoegen(vermoegen);
		this.tische = new ArrayList<Tische>();
		this.addTische(anzahlTische);
	}

	private void addTische(int anzahlTische) {
		for (int i = 0; i < anzahlTische; i++) {
			this.tische.add(new Tische(this));
		}
	}

	public int getGewinn() {
		return this.gewinn;
	}

	public void setGewinn(int gewinn) {
		this.gewinn += gewinn;
	}

	/**
	 * Methode, um die Anzahl der Tische festzulegen
	 * 
	 * @return tische liefert den Wert der enthaltenen Tische zurueck
	 */
	public ArrayList<Tische> getTische() {
		return tische;
	}

	// Spieler einem Tisch zuweisen(zufällig)
	public int getAnzahlTische() {
		return this.tische.size();
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

}
