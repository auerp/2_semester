package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import java.util.ArrayList;

/**
 * Klasse zur Erzuegung von Superhelden
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Superhelden extends Mutanten {

	/**
	 * Liste, um die Superkraefte zu beschreiben
	 */
	private ArrayList<Superkraft> superkraft = new ArrayList<Superkraft>();

	/**
	 * Konstruktor zur Erzeugung eines Superhelden
	 * 
	 * @param name
	 *            des Superhelden
	 * @param einkommen
	 *            des Superhelden
	 * @param superkraft
	 *            des Superhelden
	 */
	Superhelden(String name, int einkommen, Superkraft superkraft,
			Superkraft... superkraefte) {
		super(name, einkommen, superkraft);
	}

	/**
	 * Methode, zur Angabe der Superkraft
	 * 
	 * @return superkraft liefert die Superkraft des Superhelden zurück
	 */
	public ArrayList<Superkraft> getSuperkraft() {
		return superkraft;
	}

	/**
	 * Methode um zu ermitteln ob der Superheld den Kampf gewinnt
	 * 
	 * @return liefert true zurück wenn Superheld verliert und false wenn er
	 *         gewinnt
	 */
	protected boolean kaempfe(Mutanten mutant) {

		if (mutant instanceof Schurken) {
			return mutant.kaempfe(this);
		} else {
			return false;
		}
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Superhelden [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft + "]";
	}

}