package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, zur Verwaltung der Knoten und zur Erzeugung der Knoten
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 27.11.2013
 * @param T
 *            Typ der gespeicherten Elemente
 */
public class Node<T> {

	protected boolean isVisited;
	private String nodeName;
	private T value;
	private NodeListImpl<T> childList;

	/**
	 * Konstruktor, zur Erzeugung eines Knoten
	 * 
	 * @param nodeName
	 *            Name des Knoten
	 * @param wert
	 *            den der Knoten enthalten soll
	 */
	public Node(String nodeName, T value) {
		this.nodeName = nodeName;
		this.value = value;
		this.childList = new NodeListImpl<T>();

	}

	/**
	 * Methode, um Kindeknoten hinzuzufügen
	 * 
	 * @param child
	 *            Kindknoten
	 */
	void addChild(Node<T> child) {
		this.childList.add(child);
	}

	/**
	 * Methode zum Auslesen aller Kindknoten
	 * 
	 * @return childList Liste aller Kindknoten
	 */
	NodeListImpl<T> getChildren() {
		return this.childList;
	}

	/**
	 * Methode um den Namen zu bekommen
	 * 
	 * @return nodeName Name des Knoten
	 */
	String getName() {
		return this.nodeName;
	}

	/**
	 * Methode zum Auslesen der Werte
	 * 
	 * @return value enthaltener Wert
	 */
	T getValue() {
		return this.value;
	}

	/**
	 * Methode, um zu prüfen ob ein Knoten besucht wurde
	 * 
	 * @return isVisited gibt an, ob ein Knoten besucht wurde.
	 */
	public boolean getVisit() {
		return isVisited;

	}

	/**
	 * Methode um den Besuch eines Knoten zu setzen
	 * 
	 * @param visit
	 */
	public void setVisit(boolean visit) {
		isVisited = visit;

	}

	/**
	 * Methode, um eine geeignete Darstellung zu erzeugen
	 * 
	 * @return nodeName Name des Knoten
	 */
	@Override
	public String toString() {
		return nodeName;
	}

}
