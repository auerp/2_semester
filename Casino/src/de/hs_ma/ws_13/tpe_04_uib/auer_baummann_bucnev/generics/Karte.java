package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import enum_klassen.EnumKartenTypen;
import enum_klassen.EnumKarten;

public class Karte {
	
	private int farbeValue, wertValue;
	  private String farbe[] = {"Herz", "Pik", "Karo", "Kreuz"};
	  private String wert[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König","As"};

	  public Karte(){
		  
	  }
	  
//	  public void kartenHinzufuegen(){
//		  
//	  }
	  
//	  public Karte(int farbe, int wert)
//	  {
//		 farbeValue = farbe;
//		 wertValue = wert;
//	  }

	  public String convertToString(int farben){
	    return farbe[farben];
	  }

	  public void setFarbe(int farben){
		  farbeValue = farben;
	  }
	  
//	  public String getFarbe(){
//		  for (int i=0; i<= farbe.length; i++){
//			  System.out.println(farbe[i]);
//			  return farbe[i];
//			  
//		  }
//		  return "Hallo";
//	  }

	  public void setSuit(int wert){
		  wertValue = wert;
	  }

	  public int getRank(){
	    return farbeValue;
	  }

	  public int getSuit(){
	    return wertValue;
	  }

	  public String toString(){
	    String name = farbe[farbeValue] + " of " + wert[wertValue];
	    return name;
	  }
	}

//    private EnumKartenTypen farbe;
//    private EnumKarten wert;
//    
//    public Karte(EnumKartenTypen farbe, EnumKarten wert){
//            this.farbe = farbe;
//            this.wert = wert;
//    }
//
//    public EnumKartenTypen getFarbe() {
//            return farbe;
//    }
//
//    public EnumKarten getWert() {
//            return wert;
//    }
//}
