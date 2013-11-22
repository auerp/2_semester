package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann version 20.11.2013
 * 
 */
public class Node<T> extends NodeListImpl {

	
	protected boolean isVisited;

	

	public boolean isVisited() {
		return isVisited;
	}

	public void visit() {
		isVisited = true;
	}

	public void unvisited() {
		isVisited = false;
	}

	void addChild(){
		
	}

	void getChildren() {

	}

	void getName() {
		

	}

	void getValue() {

	}

	// @Override
	// public String toString() {
	// // return "Node [nodeList=" + nodeList + ", node=" + node + "]";
	// }

}
