package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse zur Erzugung von Menschen.
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Menschen extends Einwohner {

	/**
	 * Variable zur Verwaltung des Alters
	 */
	protected int alter;

	/**
	 * Konstruktor zur Erzeugung eines Menschen
	 * 
	 * @param name
	 *            des Menschen
	 * @param einkommen
	 *            des Menschen
	 * @param alter
	 *            des Menschen
	 */
	protected Menschen(String name, int alter, int einkommen) {
		super(name, einkommen);
		this.name = name;
		this.alter = alter;
		this.einkommen = einkommen;
	}

	/**
	 * Methode, um das Alter festzulegen
	 * 
	 * @return alter, liefert das Alter zurück
	 */
	protected int getAlter() {
		return alter;
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Menschen [Name= " + name + ", Alter= " + alter + ", Einkommen="
				+ einkommen + "]";
	}

}
