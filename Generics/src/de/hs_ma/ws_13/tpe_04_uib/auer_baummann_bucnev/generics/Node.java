package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * t
 */
public class Node<T> {

	protected boolean isVisited;
	private String nodeName;
	private T value;
	private NodeListImpl<T> childList;

	/**
	 * Konstruktor
	 * 
	 * @param nodeName
	 * @param wert
	 */
	public Node(String nodeName, T value) {
		this.nodeName = nodeName;
		this.value = value;
		this.childList = new NodeListImpl<T>();

	}

	void addChild(Node<T> child) {
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
		return this.value;
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

	@Override
	public String toString() {
		return "Node [nodeName=" + nodeName
				+ ", value=" + value + ", childList=" + childList + "]";
	}

	

}
