package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013 t
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

	
	public boolean getVisit(){
		return isVisited;
		
	}
	
	public void setVisit(boolean visit){
		isVisited = visit;
		
	}

	
//	/**
//	 * Methode, um zu prüfen, ob ein Knoten bereits besucht wurde
//	 * 
//	 * @return visit
//	 */
//	public boolean isVisited() {
//		return isVisited;
//	}

//	/**
//	 * Methode, um festzulegen, ob ein Knoten besucht oder nicht besucht wurde
//	 * 
//	 * @return true wenn der Knoten besucht wurde; false wenn der Knoten nocht
//	 *         nicht besucht wurde
//	 */
//	public boolean visit() {
//		if (isVisited) {
//			return isVisited = true;
//		} else
//			return false;
//	}

	// public void unvisited() {
	// isVisited = false;
	// }

	/**
	 * Methode, um eine geeignete Darstellung zu erzeugen
	 */
	@Override
	public String toString() {
		return nodeName;
	}
	

}
