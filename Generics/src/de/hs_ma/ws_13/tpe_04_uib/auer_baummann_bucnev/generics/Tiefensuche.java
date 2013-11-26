package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, zur Erzegung der Tiefensuche
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * 
 * @param <T>
 */
public class Tiefensuche<T> implements SearchStrategy<T> {

	private Node<T> search;
	private NodeListImpl<T> found;
	private NodeListImpl<T> pathList = new NodeListImpl<T>();

	@Override
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {
		this.search = toSearch;
		this.pathList.clear();
		this.found = new NodeListImpl<T>();

		if (startNode.getValue().equals(search.getValue())) {
			this.pathList.add(startNode);
			found.add(startNode);
			startNode.setVisit(true);
		} else {
			this.pathList.add(startNode);

		}
		return found;

	}

	/**
	 * Methode, um den Weg zurückzuliefern
	 * 
	 * @return pathList liefert den durchgelaufenen Pfad zurück
	 */
	public NodeListImpl<T> getPath() {
		return pathList;
	}
}
