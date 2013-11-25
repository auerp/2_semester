package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * 
 */
public class Node<T> {

	protected boolean isVisited;
	private String nodeName;
	private T wert;
	private NodeListImpl<T> childList;

	/**
	 * Konstruktor
	 * 
	 * @param nodeName
	 * @param wert
	 */
	public Node(String nodeName, T wert) {
		this.nodeName = nodeName;
		this.wert = wert;
		this.childList = new NodeListImpl<T>();

	}

	void addChild(T child) {
		this.childList.add(child);
	}

	// Auslesen aller Kindsknoten
	NodeListImpl<T> getChildren() {
		return this.childList;
	}

	String getName() {
		return this.nodeName;
	}

	// Auslesen des Wertes
	T getValue() {
		return this.wert;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void visit() {
		isVisited = true;
	}

	public void unvisited() {
		isVisited = false;
	}

	// @Override
	// public String toString() {
	// // return "Node [nodeList=" + nodeList + ", node=" + node + "]";
	// }

}
