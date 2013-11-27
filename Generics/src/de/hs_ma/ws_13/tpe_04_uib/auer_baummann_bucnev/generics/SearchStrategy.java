package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Interface, um den Graphen nach Knoten mit einem bestimmten Wert zu
 * durchsuchen.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 27.11.2013
 * @param <T>
 *            Typ der gespeicherten Elemente
 */

public interface SearchStrategy<T> {

	/**
	 * Methode, um den Graphen nach Knoten mit einem bestimmten Wert zu
	 * durchsuchen.
	 * 
	 * @param startNode
	 *            Anfangsknoten
	 * @param toSearch
	 *            gescuhter Wert
	 */
	abstract NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch);

	/**
	 * Methode, um den Weg des zu letzt genutzen Durchlaufes im Graphen
	 * auszugeben.
	 */
	abstract NodeListImpl<T> getPath();

}
