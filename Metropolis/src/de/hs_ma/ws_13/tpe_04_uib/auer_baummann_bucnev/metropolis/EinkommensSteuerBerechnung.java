package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Klasse, in der die Einkommensteuer berechnet wird
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */

public class EinkommensSteuerBerechnung {

	/**
	 * Methode zur Berechnung der Einkommensteuer
	 * 
	 * @param einkommen
	 *            der jeweiligen Person
	 * @return steuerbetrag liefert den errechneten steuerbetrag zurück
	 */
	public static int berechneEinkommenssteuer(int einkommen) {
		int steuerbetrag = 0;
		int grenze20k = (Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
		int grenze40k = ((Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
				+ grenze20k;
		int grenze60k = ((Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
				+ grenze40k;
		int grenze120k = ((Konstanten.BERECHNUNGSGRENZE_60K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
				+ grenze60k;

		if (einkommen <= 0) {
			return steuerbetrag;
		} else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_20K) {
			return steuerbetrag = (einkommen * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
		} else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_60K) {
			return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_40K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
					+ grenze40k;
		} else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_120K) {
			return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_60K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
					+ grenze60k;
		} else {
			return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_120K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN4) / 100)
					+ grenze120k;
		}
	}
}
