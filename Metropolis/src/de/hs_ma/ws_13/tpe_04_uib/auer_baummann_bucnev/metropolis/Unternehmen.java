package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse zur Erzeugung eines Unternehmen
 * 
 * @author Patric auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 */
public class Unternehmen {

	/**
	 * Variable um den Name eines Unternehemns zu verwalten
	 */
	protected String unternehmensName;

	/**
	 * Variable um den Gewinn eines Unternehemens zu verwalten
	 */
	protected int unternehmensGewinn;

	/**
	 * Konstruktor zur Erzeugung eines Unternehmens
	 * 
	 * @param unternehmensName
	 *            Names des Unternehmens
	 * @param unternehmensGewinn
	 *            Gewinn des Unternehmens
	 */
	protected Unternehmen(String unternehmensName, int unternehmensGewinn) {
		this.unternehmensName = unternehmensName;
		this.unternehmensGewinn = unternehmensGewinn;
	}

	/**
	 * Methode zur Angabe des Gewinn
	 * 
	 * @return unternehmensGewinn liefert den Betrag des Gewinn zurück
	 */
	public int getGewinn() {
		return unternehmensGewinn;
	}
}
