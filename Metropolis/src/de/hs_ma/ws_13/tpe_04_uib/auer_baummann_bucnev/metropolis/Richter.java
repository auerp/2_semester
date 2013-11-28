package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse zur Erzeugung der Richter
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Richter extends Menschen {

	/**
	 * Variable zur Verwaltung der Bestechlichkeit
	 */
	private boolean korrupt;

	/**
	 * Konstruktor zur Erzeugung eines Richters
	 * 
	 * @param name
	 *            des Richter
	 * @param alter
	 *            des Richter
	 * @param einkommen
	 *            des Richter
	 * @param korrupt
	 *            Bestechlichkeit des Richter
	 */
	protected Richter(String name, int alter, int einkommen, boolean korrupt) {
		super(name, alter, einkommen);
		this.korrupt = korrupt;
	}

	/**
	 * Methode zur Bestimmung, ob ein Schurke verurteilt wird, mithilfe der
	 * Ueberpruefung der Korruption
	 * 
	 * @param schurke
	 * @return Schurke wird verurteilt oder Schurke wird nicht verurteilt
	 */
	protected boolean verurteilt(Schurken schurke) {
		if (this.korrupt) {
			return schurke.verurteilt = false; // wird nicht verurteilt, wenn
												// Richter korrupt
		} else {
			return schurke.verurteilt = true; // wird verurteilt, wenn Richter
												// korrupt
		}
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Richter [Name= " + name + ", Alter= " + alter + ", Einkommen="
				+ einkommen + ", Korrupt= " + korrupt + "]";
	}

}