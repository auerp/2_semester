package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, zur Erzeugung eines Graphen. Hierfür werden Methoden aus dem
 * Interface SearchStrategy implementiert.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 27.11.2013
 * @param <T>
 *            Typ der gespeicherten Elemente
 * 
 */

public class Graph<T> implements SearchStrategy<T> {

	private NodeListImpl<T> allNodes = new NodeListImpl<T>();
	private Node<T> firstNode;

	/**
	 * Konstruktor zur Erzeugung des ersten Knoten
	 * 
	 * @param firstNode
	 *            ist der Wurzelknoten
	 */
	public Graph(Node<T> firstNode) {
		this.firstNode = firstNode;
	}

	/**
	 * Methode, zum kopieren von Knoten in eine Liste
	 * 
	 * @return list liefert eine Liste mit den kopierten Werten zurück
	 */
	public NodeListImpl<T> copyInto(NodeListImpl<T> existList,
			NodeListImpl<T> list) {

		if (existList.getFirst() != null) {
			list.addAll(existList);
		}
		return list;
	}

	/**
	 * Methode, um nach einem bestimmten Wert zu suchen
	 * 
	 * @return found liefert den gesuchten Wert zurück
	 */
	public NodeListImpl<T> search(Node<T> toSearch, SearchStrategy<T> strategy) {
		NodeListImpl<T> found = new NodeListImpl<T>();
		found = strategy.search(this.firstNode, toSearch);
		return found;
	}

	/**
	 * Methode, um den Graphen nach Knoten mit einem bestimmten Wert zu
	 * durchsuchen.
	 * 
	 * @param <T>
	 * 
	 * @return null
	 */
	@Override
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {
		return null;
	}

	/**
	 * Methode, um den Weg des zu letzt genutzen Durchlaufes im Graphen
	 * auszugeben.
	 * 
	 * @return null
	 */
	@Override
	public NodeListImpl<T> getPath() {
		return null;
	}

}
