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

public class Graph<T> implements SearchStrategy {

	LinkedList<T> liste = new LinkedList<T>(); // darf man das machen?
	Node<T> root;

	/**
	 * Konstruktor
	 */
	Graph(Node<T> root) {
		this.root = root;
	}

	public void breitensuche(T wert, Node<T> root) {

	}

	private void tiefensuche(T wert, Node<T> root) {

	}

	/**
	 * Methode, zum kopieren von Knoten in eine Liste
	 */
	void copyInto() {

	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Methode
	 */
	@SuppressWarnings("hiding")
	@Override
	public <T> String search(T wert, boolean breitensuche) {

		liste.clear();
		if (breitensuche) {
			breitensuche(wert, root); // komischer Fehler, vllt findet ihr etwas
										// dagegen
		} else {
			tiefensuche(wert, root);
		}
		return null;

	}

}
