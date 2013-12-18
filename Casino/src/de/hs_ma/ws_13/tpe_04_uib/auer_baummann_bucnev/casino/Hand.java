package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

import java.util.ArrayList;

/**
 * Klasse zur Erzeugung einer Hand mit Karten
 * 
 * @author pauer
 * 
 */
public class Hand {

	private int summe;
	private ArrayList<Karte> kartenHand = new ArrayList<Karte>();

	/**
	 * Methode um die Summe aller Karten einer Hand zu ermitteln
	 * 
	 * @return summe liefert die Summer aller Karten einer Hand zurueck
	 */
	public int getSumme() {
		int summe = 0; // summe auf Null setzen, sonst wird summe aufgerechnet
		for (Karte karte : kartenHand) {
			summe = summe + karte.getWert();
		}
		return summe;
	}

	/**
	 * Methode, um die Karten der ArrayList (Hand) hinzuzufuegen
	 * 
	 * @param k
	 *            karte
	 */
	public void addKarte(Karte k) {
		if (kartenHand.size() < 3) {
			this.kartenHand.add(k);
		}
	}

	/**
	 * Methode, um die Karten aus der ArrayList (Hand) zu entfernen
	 */
	public void removeKarten() {
		kartenHand.clear();
	}

	/**
	 * Methode, die die Karten von der Hand zurueck gibt
	 * 
	 * @return kartenHand liefert die Karten einer Hand
	 */
	public ArrayList<Karte> getKartenHand() {
		return this.kartenHand;
	}

	@Override
	public String toString() {
		return "Hand [summe=" + summe + ", kartenHand=" + kartenHand + "]";
	}

}
