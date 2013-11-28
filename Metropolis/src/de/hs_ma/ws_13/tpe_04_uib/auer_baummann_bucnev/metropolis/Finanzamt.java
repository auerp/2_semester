package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import java.util.ArrayList;

/**
 * Klasse, in der die steuerpflichtigen Objekte erfasst werden
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */

public class Finanzamt {

	/**
	 * Liste, zur Verwaltung der Steuerarten
	 */
	private static final ArrayList<Einkommenssteuer> ListEinkommenssteuer = new ArrayList<Einkommenssteuer>();
	protected static final ArrayList<Koerperschaftssteuer> ListKoerperschaftssteuer = new ArrayList<Koerperschaftssteuer>();
	private static final ArrayList<Gewerbesteuer> ListGewerbesteuer = new ArrayList<Gewerbesteuer>();

	/**
	 * Methode zum leeren der Einkommenssteuer Liste
	 */
	public static void leereListEinkommenssteuer() {
		ListEinkommenssteuer.clear();
	}

	/**
	 * Methode zum leeren der Koerperschaftssteuer Liste
	 */
	public static void leereListKoerperschaftssteuer() {
		ListKoerperschaftssteuer.clear();
	}

	/**
	 * Methode zum leeren der Gewerbesteuer Liste
	 */
	public static void leereListGewerbesteuer() {
		ListGewerbesteuer.clear();
	}

	/**
	 * Methode, die die Einkommensteuerpflichtigen Objekte erfasst
	 * 
	 * @param e
	 */
	public static void EinkommenssteuerPflicht(Einkommenssteuer e) {
		ListEinkommenssteuer.add(e);
	}

	/**
	 * Methode, die die Koerperschaftssteuerpflichtigen Objekte erfasst
	 * 
	 * @param k
	 */
	public static void KoeperschaftssteuerPflicht(Koerperschaftssteuer k) {
		ListKoerperschaftssteuer.add(k);
	}

	/**
	 * Methode, die die Gewerbesteuerpflichtigen Objekte erfasst
	 * 
	 * @param g
	 */
	public static void GewerbesteuerPflicht(Gewerbesteuer g) {

		ListGewerbesteuer.add(g);
	}

	/**
	 * Methode zur Ermittlung der Gesamtsumme der Einkommen in Abhängigkeit der
	 * Steuerart
	 * 
	 * @return summeEinkommen gibt die gesamte Summer der Einkommen zurück
	 */
	public static int berechneEinkommenssteuer() {
		// for each Schleife um solange durchzulaufen bis die Liste leer ist
		int summeEinkommen = 0;
		for (Einkommenssteuer e : ListEinkommenssteuer) {
			summeEinkommen += e.berechneEinkommenssteuer();
		}
		return summeEinkommen;
	}

	/**
	 * Methode zur Ermittlung der Gesamtsumme der Einkommen in Abhängigkeit der
	 * Steuerart
	 * 
	 * @return summeEinkommen gibt die gesamte Summer der Einkommen zurück
	 */
	public static int berechneKoerperschaftsteuer() {
		int summeEinkommen = 0;
		for (Koerperschaftssteuer k : ListKoerperschaftssteuer) {
			summeEinkommen = summeEinkommen + k.berechneKoerperschaftssteuer();
		}
		return summeEinkommen;
	}

	/**
	 * Methode zur Ermittlung der Gesamtsumme der Einkommen in Abhängigkeit der
	 * Steuerart
	 * 
	 * @return summeEinkommen gibt die gesamte Summer der Einkommen zurück
	 */
	public static int berechneGewerbesteuer() {
		int summeEinkommen = 0;
		for (Gewerbesteuer g : ListGewerbesteuer) {
			summeEinkommen = summeEinkommen + g.berechneGewerbesteuer();
		}
		return summeEinkommen;
	}

	/**
	 * Methode zur Berechnung der gesamten Steuer
	 * 
	 * @return Summe aller Steuerarten
	 */
	public static int berechneGesamteSteuern() {
		return berechneEinkommenssteuer() + berechneKoerperschaftsteuer()
				+ berechneGewerbesteuer();
	}

}
