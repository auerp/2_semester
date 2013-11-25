package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.LinkedList;

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

public abstract class Graph<T> implements SearchStrategy {

	// LinkedList<T> liste = new LinkedList<T>(); // darf man das machen?
	private NodeListImpl<T> all = new NodeListImpl<T>();
	private Node<T> root;

	/**
	 * Konstruktor
	 */
	public Graph(Node<T> root) {
		this.root = root;
	}

	/**
	 * Methode, zum kopieren von Knoten in eine Liste
	 */
	void copyInto(NodeListImpl list) {
		for (Node<T> it : this.all) {
			list.add(it);
		}
		return list;
	}

	@Override
	public Node<T> getPath() {
		return this.root;
	}

	/**
	 * Methode
	 */
	public NodeListImpl<T> search(Node<T> search, SearchStrategy<T> strategy) {
		NodeListImpl<T> found = new NodeListImpl<T>();
		found = strategy.search(this.root, search);
		return found;
	}

}
