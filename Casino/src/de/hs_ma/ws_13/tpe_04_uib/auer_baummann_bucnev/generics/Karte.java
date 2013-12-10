package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.HashMap;

import enum_klassen.EnumKartenTypen;
import enum_klassen.EnumKarten;

public class Karte {

	// private int farbeValue, wertValue;
	// private String farbe[] = {"Herz", "Pik", "Karo", "Kreuz"};
	// private String wert[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
	// "Bube", "Dame", "König","As"};
	//

	private EnumKarten wert; // Werte der Karten
	private EnumKartenTypen typ; // Zeichen bzw. Farbe der Karten

	private String deck[][] = new String[3][13];

	/**
	 * Konstruktor zur Erzeugung der Karte
	 * 
	 * @param wert
	 *            Wert den die KArte enthaelt
	 * @param typ
	 *            Farbe den die Karte enthaelt
	 */
	public Karte(EnumKarten wert, EnumKartenTypen typ) {
		this.wert = wert;
		this.typ = typ;
	}

	protected HashMap<String, String> alleKarten = new HashMap<String, String>();

	public void kartenHinzufuegen() {

		for (int i = 0; i < farbe.length; i++) {
			for (int k = 0; k < wert.length; k++) {
				deck[i][k] = farbe[i] + " " + wert[k];
				alleKarten.put(deck[i][k], wert[k]);

				// System.out.println(deck[i][k]);
				// System.out.println(alleKarten.get(deck[i][k]));

			}
		}

	}

	// public String convertToString(int farben) {
	// return farbe[farben];
	// }

	/**
	 * Methode die die Farbe der Karte liefert
	 * 
	 * @return typ liefert die Farbe der Karte zurueck
	 */
	public EnumKartenTypen getTyp() {
		return typ;
	}

	/**
	 * Methode die den Wert der Karte liefert
	 * 
	 * @return wert liefert den Wert der Karte zurueck
	 */
	public EnumKarten getWert() {
		return wert;
	}

	// public String getFarbe(){
	// for (int i=0; i<= farbe.length; i++){
	// System.out.println(farbe[i]);
	// return farbe[i];
	//
	// }
	// return "Hallo";
	// }

	// public void setSuit(int wert) {
	// wertValue = wert;
	// }
	//
	// public int getRank() {
	// return farbeValue;
	// }
	//
	// public int getSuit() {
	// return wertValue;
	// }

	public String toString() {
		String name = farbe[farbeValue] + " of " + wert[wertValue];
		return name;
	}
}
