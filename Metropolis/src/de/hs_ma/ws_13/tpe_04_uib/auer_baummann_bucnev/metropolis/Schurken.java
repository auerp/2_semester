package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse zur Erzeugung der Schurken
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Schurken extends Mutanten implements Einkommenssteuer {

	/**
	 * Variable und Initialisierung, um die Verurteilung zu verwalten
	 */
	boolean verurteilt = false;

	/**
	 * Variable, um die Syndikate zu verwalten
	 */
	boolean inSyndikat = false;

	/**
	 * Konstruktor zur Erzeugung eines Schurken
	 * 
	 * @param name
	 *            des Schurken
	 * @param einkommen
	 *            des Schurken
	 * @param superkraft
	 *            des Schurken
	 * @param verurteilt
	 *            Verurteilung des Schurken
	 * @param inSyndikat
	 *            vorhandenes Schurken Syndikat
	 */
	Schurken(String name, int einkommen, Superkraft superkraft,
			boolean verurteilt, boolean inSyndikat) {
		super(name, einkommen, superkraft);
		this.verurteilt = verurteilt;
		this.inSyndikat = inSyndikat;
		Finanzamt.EinkommenssteuerPflicht(this);

		if (inSyndikat) {
			SchurkenSyndikat.addSchurke(this);
		}

	}

	/**
	 * Methode um zu ermitteln ob der Schurke den Kampf gewinnt
	 * 
	 * @return liefert true zurück wenn schurke gewinnt und false wenn er
	 *         verliert
	 */
	protected boolean kaempfe(Mutanten mutant) {
		if (this.superkraft.equals(mutant.superkraft)) {
			return true; // schurke verliert
		} else {
			return false; // schurke gewinnt
		}
	}

	/**
	 * Methode zur Berechnung der Einkommensteuer return liefert den errechneten
	 * Steuerbetrag zurück
	 */
	public int berechneEinkommenssteuer() {
		return EinkommensSteuerBerechnung.berechneEinkommenssteuer(einkommen);
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Schurken [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft + ", Verurteilt= " + verurteilt
				+ ", inSyndikat= " + inSyndikat + "]";
	}

}