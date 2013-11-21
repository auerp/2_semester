package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;

/**
 * Klasse, zur Implementierung der Liste
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 * @param <T>
 *            Typ der gespeicherten Elemente
 */
public abstract class ListImpl<T> implements List<T> {

	ArrayList<T> list = new ArrayList<T>();
	
	
	/**
	 * Fuegt am Ende ein Element hinzu.
	 * 
	 * @param e
	 *            Element, das hinzugefuegt werden soll.
	 * @return ist immer true
	 */
	public boolean add(T e){
		return list.add(e);
		
		
	}
	
	
	public boolean contains(Object e){
		
		return false;
		
	}

}
