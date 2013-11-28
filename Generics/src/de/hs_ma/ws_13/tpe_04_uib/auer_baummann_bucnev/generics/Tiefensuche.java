package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse, zur Erzegung der Tiefensuche
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 27.11.13
 * @param <T>
 *            Typ der gespeicherten Elemente
 */
public class Tiefensuche<T> implements SearchStrategy<T> {

	// private Node<T> search;
	private NodeListImpl<T> found;
	private NodeListImpl<T> pathList = new NodeListImpl<T>();

	/**
	 * Methode, um den Graphen nach Knoten mit einem bestimmten Wert zu
	 * durchsuchen.
	 * 
	 * @param startNode
	 *            Anfangsknoten
	 * @param toSearch
	 *            gesuchter Wert
	 */
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {
		// this.search = toSearch;
		this.pathList.clear();
		this.found = new NodeListImpl<T>();

		if (startNode.getValue().equals(toSearch.getValue())) {
			pathList.add(startNode);
			found.add(startNode);
			startNode.setVisit(true);
		} else {
			pathList.add(startNode);
			startNode.setVisit(true);
			for (Node<T> iterator : startNode.getChildren()) {
				if (!iterator.getVisit()) {
					searchHelpRek(iterator, toSearch);
				}
			}

		}
		clean();
		return found;

	}

	/**
	 * Methode, die als rekursive Hilfsfunktion zu oben stehender Methode
	 * search() dient
	 * 
	 * @param tempNode
	 *            Temporärer Speicher für einen Node
	 * @param toSearch
	 *            der gesuchte Wert
	 */
	private void searchHelpRek(Node<T> tempNode, Node<T> toSearch) {
		tempNode.setVisit(true); // setzt Knoten auf true
		pathList.add(tempNode);

		for (Node<T> iterator : tempNode.getChildren()) {
			if (iterator.getValue().equals(toSearch.getValue())) { // iteriert
																	// den
																	// Graphen
																	// durch und
																	// liefert
																	// die Werte
				found.add(iterator);
			}
			if (!iterator.getVisit()) { // prüft, ob Knoten bereits besucht
										// wurde
				searchHelpRek(iterator, toSearch); // ruft die Methode erneut
													// auf
			}
		}
	}

	/**
	 * Methode, um die Liste des Pfades auf false zu setzen
	 */
	private void clean() {
		for (Node<T> iterator : this.pathList) { // iteriert die Liste durch und
													// setzt besuchte Knoten auf
													// false
			iterator.setVisit(false);
		}
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
