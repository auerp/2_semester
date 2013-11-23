package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.LinkedList;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * 
 */
public class Node<T> extends NodeListImpl<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7678153360742668972L;
	protected boolean isVisited;
	String nodeName;
	T wert;
	LinkedList<Node> nodeList;

	Node(String nodeName, T wert, LinkedList<Node> nodeList) {
		this.nodeName = nodeName;
		this.wert = wert;
		this.nodeList= nodeList;

	}

	void addChild(Node<T> child) {
		this.add(child);	// ? ob es doppelt ist
		nodeList.add(child);
	}

	//Auslesen aller Kindsknoten
	LinkedList getChildren() {
		return nodeList;
	}

	String getName() {
		return this.nodeName;
	}

	//Auslesen des Wertes
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
