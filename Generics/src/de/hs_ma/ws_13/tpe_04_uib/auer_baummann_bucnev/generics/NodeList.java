package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Interface zur Verwaltung der Knoten
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 * @param <T>
 */
public interface NodeList<T> extends List<T> {
	
	public boolean addNodeToList(T node);
	public boolean removeNodeFromList(T node);
//	public boolean contains(T node);
					
	
	



}
