package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

//import java.util.ArrayList;
//import java.util.Collections;

public class KartenDeck {
	
	public enum Kartenwert{
		ZWEI(2), DREI(3), VIER(4), FUENF(5), SECHS(6), SIEBEN(7), ACHT(8), NEUN(9), ZEHN(
				10), BUBE(10), DAME(10), KOENIG(10), AS(11);
		
		private int wert;

		// Konstruktor
		private Kartenwert(int wert) {
			this.wert = wert;
		}
		
	}
	public enum KartenTyp{
		PIK, KREUZ, KARO, HERZ;
	}
	

	private Kartenwert kartenwert;
    private KartenTyp kartentyp;
    
    public KartenDeck(Kartenwert kartenwert, KartenTyp kartentyp) {
            super();
            this.kartenwert = kartenwert;
            this.kartentyp = kartentyp;
    }
    
    public Kartenwert getKartenwert() { 
    	return kartenwert; }
    
    public KartenTyp getKartenTyp() { 
    	return kartentyp; }
    
    @Override
    public String toString() {
            return kartenwert.toString() + kartentyp.toString() ;
    }
//	ArrayList meinDeck= new ArrayList();
//	
//	// Methoden
//	// Karten mischen
//	public int mischeKarten(){
//		Collections.enumeration(meinDeck);
//		 Collections.shuffle(meinDeck);
//		 return 0;
//	}
}
