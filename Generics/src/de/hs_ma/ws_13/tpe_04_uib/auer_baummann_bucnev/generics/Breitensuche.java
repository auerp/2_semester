package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse zur Erzeugung der Breitensuche.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 * @param<T>
 * 
 */
public class Breitensuche<T> implements SearchStrategy<T> {
	
	/**
	 * Konstruktor
	 */
	//TODO kann der Kontruktor nicht generisch sein?
	public Breitensuche(){
		
	}

	@Override
	public NodeListImpl<T> getPath() {
		
		return null;
	}

	@Override
	public NodeListImpl<T> search(Node<T> firstNode, Node<T> toSearch) {
		
		return null;
	}

}
