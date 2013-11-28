package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import java.util.ArrayList;

/**
 * Klasse, zur Erzeugung der Kapitalgesellschaften
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public class Kapitalgesellschaften extends Unternehmen implements
		Koerperschaftssteuer, Gewerbesteuer {

	/**
	 * Listen zur Verwaltung der Gesellschafter
	 */
	private ArrayList<Buerger> gesellschafter = new ArrayList<Buerger>();
	private ArrayList<Kapitalgesellschaften> listKapitalgesellschaften = new ArrayList<Kapitalgesellschaften>();

	/**
	 * Konstruktor, zur Erzeugung der Kapitalgesellschaft
	 * 
	 * @param unternehmensName
	 *            name des Unternehmens
	 * @param unternehmensGewinn
	 *            Betrag des Gewinn des Unternehmens
	 */
	public Kapitalgesellschaften(String unternehmensName,
			int unternehmensGewinn, ArrayList<Buerger> gesellschafter) {
		super(unternehmensName, unternehmensGewinn);
		this.gesellschafter = gesellschafter;
		Finanzamt.KoeperschaftssteuerPflicht(this);
		Finanzamt.GewerbesteuerPflicht(this);
	}

	/**
	 * Methode, um Kapitalgesellschaften hinzuzufügen
	 * 
	 * @param kapitalgesellschaften
	 */
	public void addKapitalgesellschaft(
			Kapitalgesellschaften kapitalgesellschaften) {
		listKapitalgesellschaften.add(kapitalgesellschaften);
	}

	public ArrayList<Buerger> getGesellschafter() {
		return gesellschafter;
	}

	/**
	 * Methode zur Berechnung der Koerperschaftssteuer
	 * 
	 * @return steuerbetrag liefert den errechneten Betrag der
	 *         Koerperschaftssteuer zurück
	 */
	public int berechneKoerperschaftssteuer() {
		int steuerbetrag = (this.getGewinn() / 100)
				* Konstanten.LINEARERSTEUERSATZ_KOERPER;
		if (steuerbetrag <= 0) {
			return 0;
		} else {
			return steuerbetrag;
		}
	}

	/**
	 * Methode zur Berechnung der Gewerbesteuer
	 * 
	 * @return liefert den errechneten Betrag der Gewerbesteuer zurück
	 */
	public int berechneGewerbesteuer() {
		return (this.getGewinn() / 100) * Konstanten.LINEARERSTEUERSATZ_GEWERBE;
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Kapitalgesellschaften [Gesellschafter=" + gesellschafter
				+ ", listKapitalgesellschaften=" + listKapitalgesellschaften
				+ ", unternehmensName=" + unternehmensName
				+ ", unternehmensGewinn=" + unternehmensGewinn
				+ ", berechneKoerperschaftssteuer()="
				+ berechneKoerperschaftssteuer() + ", berechneGewerbesteuer()="
				+ berechneGewerbesteuer() + "]";
	}

}
