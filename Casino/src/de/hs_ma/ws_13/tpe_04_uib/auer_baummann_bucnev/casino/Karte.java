package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.casino;

public class Karte {

	private EnumKartenWert wert; // Werte der Karten
	private EnumKartenFarbe farbe; // Zeichen bzw. Farbe der Karten

	/**
	 * Konstruktor zur Erzeugung der Karte
	 * 
	 * @param wert
	 *            Wert den die Karte enthaelt
	 * @param typ
	 *            Farbe den die Karte enthaelt
	 */
	public Karte(EnumKartenWert wert, EnumKartenFarbe farbe) {
		this.wert = wert;
		this.farbe = farbe;
	}

	/**
	 * Methode die den Wert der Karte liefert
	 * 
	 * @return wert liefert den Wert der Karte zurueck
	 */
	public int getWert() {
		return this.wert.getWert(); // ruft getWert() aus der inneren Enumklasse
									// auf
	}
	

	/**
	 * Methode, ...
	 */
	public String toString() {
		return "Karte [wert=" + wert + ", farbe=" + farbe + "]";
	}

	/**
	 * Innere Enumklasse zur Erzeugung von KArten mit enthaltenen Werten
	 * 
	 * @author pauer
	 * @author rbucnev
	 * @author tbaumann
	 * 
	 */
	public enum EnumKartenWert {

		ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(
				9), ZEHN(10), BUBE(10), DAME(10), KOENIG(10), AS(11);

		private int wert;

		/**
		 * Konstruktor zur Erzeugung einer Karte mit Wert
		 * 
		 * @param wert
		 *            Wert den die KArte enthaelt
		 */
		private EnumKartenWert(int wert) {
			this.wert = wert;
		}

		/**
		 * Methode , die den Wert der Karte zurueck liefert
		 * 
		 * @return wert Der enthaltene Wert der Karte
		 */
		public int getWert() {
			return wert;
		}

		public String toString() {
			return this.name();
		}
	}

	/**
	 * Innere Enumklasse zur Erzeugung der Kartenfarbe
	 * 
	 * @author pauer
	 * @author rbucnev
	 * @author tbaumann
	 * 
	 */
	public enum EnumKartenFarbe {

		PIK, KREUZ, KARO, HERZ;
	}

}
