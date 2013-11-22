package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;import java.util.Iterator;
import java.util.LinkedList;



/**
 * Klasse 
 * @author pauer
 *
 * @param <T>
 */

public class NodeListImpl<T>  extends LinkedList<T> implements NodeList<T> {
	
	LinkedList<T> nodeList = new LinkedList<T>();

	@Override
	public boolean addNodeToList(T node) {
		return nodeList.add(node);
		
	}

	@Override
	public boolean removeNodeFromList(T node) {
		return nodeList.remove(node);
		
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(T e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public boolean contains(T node) {
//		return nodeList.contains(node);
//		
//	}
//
//	

}
