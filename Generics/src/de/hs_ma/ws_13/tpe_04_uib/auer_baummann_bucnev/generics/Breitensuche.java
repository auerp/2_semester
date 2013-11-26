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

	NodeListImpl<T> pathList = new NodeListImpl<T>();

	@Override
	public NodeListImpl<T> getPath() {
		return pathList;
	}

	@Override
	public NodeListImpl<T> search(Node<T> firstNode, Node<T> toSearch) {
	
		if(firstNode.getValue().equals(toSearch.getValue())){
			return firstNode;
		}else{
			
		}
		
			
			
		
		if(firstNode.getChildren().isEmpty()){
			 pathList.add(firstNode);
			 firstNode.visit();
		}
		else{
			pathList.add(firstNode);
			pathList.addAll(firstNode.getChildren());
			
		}
		return pathList;
	}

	@Override
	public String toString() {
		return "Breitensuche [pathList=" + pathList + "]";
	}

	
}
