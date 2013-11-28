package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Abstrakte Klasse, zur Ereugung der Einwohner.
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */

public abstract class Einwohner {

	/**
	 * Variable um den Namen der Einwohner zu verwalten
	 */
	protected String name;

	/**
	 * Variable um das einkommen der Einwohner zu verwalten
	 */
	protected int einkommen;

	/**
	 * Konstruktor zur Erzeugung eines Einwohners
	 * 
	 * @param name
	 *            Name des Einwohners
	 * @param einkommen
	 *            Einkommen des Einwohners
	 */
	public Einwohner(String name, int einkommen) {
		this.name = name;
		this.einkommen = einkommen;
	}

	/**
	 * Methode, um das Einkommen zu setzen und zu übergeben
	 * 
	 * @return einkommen gibt das Einkommen des jeweiligen Objektes zurück
	 */
	public int getEinkommen() {
		return this.einkommen;
	}

}
