package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.LinkedList;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann version 20.11.2013
 * 
 */
public class Node<T> {

	protected T node;
	protected boolean isVisited;

	// noch unsicher, obs gebraucht wird in dieser Klasse
	LinkedList<T> nodeList = new LinkedList<T>();

	void addNode(T node) {
		this.node = node;

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

	void addChild() {

	}

	void getChildren() {

	}

	void getName() {

	}

	void getValue() {

	}

	@Override
	public String toString() {
		return "Node [nodeList=" + nodeList + ", node=" + node + "]";
	}

}
