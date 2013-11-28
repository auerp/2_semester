package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse, in der die Einkommensteuer der Buerger von Metropolis berechnet wird
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Buerger extends Menschen implements Einkommenssteuer {

	/**
	 * Variable um das Einkommen zu verwalten
	 */
	int einkommen;

	/**
	 * Konstruktor zur Erzeugung eines Buerger
	 * 
	 * @param name
	 *            des Buerger
	 * @param alter
	 *            des Buerger
	 * @param einkommen
	 *            des Buerger
	 */
	Buerger(String name, int alter, int einkommen) {
		super(name, alter, einkommen);
		this.einkommen = einkommen;
		Finanzamt.EinkommenssteuerPflicht(this);
	}

	/**
	 * Methode, um die Einkommensteuer zu berechnen
	 * 
	 * @return steuerbetrag betrag der die Hoehe der Einkommensteuer liefert
	 */
	public int berechneEinkommenssteuer() {
		return EinkommensSteuerBerechnung
				.berechneEinkommenssteuer(this.einkommen);
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Buerger [einkommen=" + einkommen + ", alter=" + alter
				+ ", name=" + name + ", berechneEinkommenssteuer()="
				+ berechneEinkommenssteuer() + "]";
	}

}