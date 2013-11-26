package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * @param <T>
 * 
 */

public class Graph<T> implements SearchStrategy<T> {

	private NodeListImpl<T> allNodes = new NodeListImpl<T>();
	private Node<T> firstNode;

	/**
	 * Konstruktor zur Erzeugung des ersten Knoten
	 */
	public Graph(Node<T> firstNode) {
		this.firstNode = firstNode;
	}

	/**
	 * Methode, zum kopieren von Knoten in eine Liste
	 */
	void copyInto(NodeListImpl<T> list) {
		for (Node<T> it : this.allNodes) {
			list.add(it);
		}
	}

	/**
	 * Methode
	 */
	public NodeListImpl<T> search(Node<T> toSearch, SearchStrategy<T> strategy) {
		NodeListImpl<T> found = new NodeListImpl<T>();
		found = strategy.search(this.firstNode, toSearch);
		return found;
	}

	@Override
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeListImpl<T> getPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
