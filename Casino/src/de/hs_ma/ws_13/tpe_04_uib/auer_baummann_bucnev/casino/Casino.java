package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;
import java.util.Collections;

public class Casino {

	private int vermoegen;
	private int gewinn;
	private ArrayList<Tische> tische;
	protected ArrayList<Spieler> spieler;

	Casino(int vermoegen, ArrayList<Spieler> tische) {
		this.setVermoegen(vermoegen);
		this.tische = new ArrayList<Tische>();
		// this.tische.add(new Tische());
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
