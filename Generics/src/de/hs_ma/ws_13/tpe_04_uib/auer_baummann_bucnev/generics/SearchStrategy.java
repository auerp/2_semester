package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Interface, um den Graphen nach Knoten mit einem bestimmten Wert zu
 * durchsuchen.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * 
 */

public interface SearchStrategy<T> {

	/**
	 * Methode, um den Graphen nach Knoten mit einem bestimmten Wert zu
	 * durchsuchen.
	 * @param <T>
	 * 
	 * @return
	 */
	abstract NodeListImpl<T> search(Node<T> firstNode, Node<T> toSearch);

	/**
	 * Methode, um den Weg des zu letzt genutzen Durchlaufes im Graphen
	 * auszugeben.
	 * 
	 * @return
	 */
	abstract NodeListImpl<T> getPath();


}
