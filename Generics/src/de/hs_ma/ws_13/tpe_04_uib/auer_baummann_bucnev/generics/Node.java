package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import java.util.ArrayList;

/**
 * Klasse, ...
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann version 20.11.2013
 * 
 */
public class Node<T> {
	
	ArrayList<T> nodeList = new ArrayList<T>();
	
	void addNode(Node node){
		nodeList.add((T) node);
		
	}

	void addLeftChild() {

	}
	
	void addRightChild(){
		
	}

	void getChildren() {

	}

	void getName() {

	}

	void getValue() {

	}

}
