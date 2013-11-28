package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import static de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis.Konstanten.*;
import java.util.ArrayList;

/**
 * Klasse zur Erzeugung von Personengesellschaften
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Personengesellschaften extends Unternehmen implements
		Einkommenssteuer, Gewerbesteuer {

	/**
	 * Variable, um den jeweiligen Steuerbetrag ermitteln zu können
	 */
	int steuerbetrag;

	/**
	 * Variable, um die inhaber einer Personenegesellschaft zu verwalten
	 */
	private ArrayList<Buerger> inhaber = new ArrayList<Buerger>();

	/**
	 * Konstrukto zur Erzeugung der Personengesellschaft
	 * 
	 * @param name
	 *            der Personengesellschaft
	 * @param gewinn
	 *            der Personengesellschaft
	 * @param inhaber
	 *            der Personengesellschaft
	 */
	protected Personengesellschaften(String name, int gewinn,
			ArrayList<Buerger> inhaber) {
		super(name, gewinn);
		this.inhaber = inhaber;
		Finanzamt.EinkommenssteuerPflicht(this);
		Finanzamt.GewerbesteuerPflicht(this);
	}

	/**
	 * Methode um Bürger einer Liste hinzuzufügen
	 * 
	 * @param buerger
	 */
	public void addBuerger(Buerger buerger) {
		inhaber.add(buerger);

	}

	/**
	 * Methode, um den inhaber zuzuweisen
	 * 
	 * @return inhaber liefert den name des Inhabers zurück
	 */
	public ArrayList<Buerger> getInhaber() {
		return inhaber;
	}

	/**
	 * Methode, um die Gewerbesteuer zu berechnen
	 * 
	 * @return errechneter Steuerbetrag mit bzw. ohne Steuerermaessigung
	 */
	public int berechneGewerbesteuer() {
		int steuerbetrag;

		steuerbetrag = (this.getGewinn() * LINEARERSTEUERSATZ_GEWERBE) / 100; // berechnet
																				// Steuerbetrag

		if (steuerbetrag <= 0) { // Prüfung auf negativen Steuerbetrag
			return 0; // liefert 0 zurück wenn BEtrag negativ
		} else if (steuerbetrag < GEWERBE_STEUERABZUG) {
			return steuerbetrag; // liefert steuerbetrag ohne Steuerermaessigung
									// zurueck
		} else {
			return steuerbetrag = steuerbetrag - GEWERBE_STEUERABZUG; // liefert
																		// Steuerbetrag
																		// mit
																		// Ermaessigung
																		// zurueck
		}
	}

	/**
	 * Methode, um die Einkommensteuer zu berechnen
	 * 
	 * @return steuerbetrag betrag der die Hoehe der Einkommensteuer liefert
	 */
	public int berechneEinkommenssteuer() {
		int einkommenssteuer = 0;
		for (Buerger buerger : getInhaber()) {
			einkommenssteuer += buerger.berechneEinkommenssteuer();
		}
		if (einkommenssteuer <= 0) {
			return 0;
		} else {
			return einkommenssteuer;
		}
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Personengesellschaften [" + "Inhaber= " + inhaber
				+ ", Unternehmensname= " + unternehmensName
				+ ", Unternehmensgewinn= " + unternehmensGewinn + "]";
	}

}
