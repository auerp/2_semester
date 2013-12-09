package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Casino {

	protected int vermoegen;
	private int gewinn;
	private ArrayList<Tische> tische;
	protected ArrayList spieler;

	Casino(int vermoegen, ArrayList tische) {
		this.vermoegen = vermoegen;
		this.tische = new ArrayList<Tische>();
     //   this.tische.add(new Tische());
	}
	 		
	public int getGewinn(){
        return this.gewinn;
    }

    public void setGewinn(int gewinn){
        this.gewinn += gewinn;
    }
    
	//Spieler einem Tisch zuweisen(zufällig)
	public int getAnzahlTische(){
        return this.tische.size();
    }

}
