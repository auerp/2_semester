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

	// private Node<T> search;
	private NodeListImpl<T> found;
	private NodeListImpl<T> pathList = new NodeListImpl<T>();

	@Override
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {
		// this.search = toSearch;
		this.pathList.clear();
		this.found = new NodeListImpl<T>();

		// dSearch() {
		// f�rbe alle Knoten wei�
		// for(alle im Graph enthaltenen Knoten) {
		// if(Farbe von Knoten == wei�) {
		// rufe dSearchVisit auf und �bergebe diesen Knoten
		// }}}
		// dSearchVisit(Knoten) {
		// f�rbe Knoten grau
		// for(alle Nachbarn von Knoten) {
		// if(Farbe von Nachbarn == wei�) {
		// rufe dSearchVisit auf und �bergebe Nachbarn. //REK.!
		// } }
		// f�rbe Knoten schwarz
		// }

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
	 */
	private void searchHelpRek(Node<T> tempNode, Node<T> toSearch) {
		tempNode.setVisit(true);
		pathList.add(tempNode);

		for (Node<T> iterator : tempNode.getChildren()) {
			if (iterator.getValue().equals(toSearch.getValue())) {
				found.add(iterator);
			}
			if (!iterator.getVisit()) {
				searchHelpRek(iterator, toSearch);
			}
		}
	}

	/**
	 * Methode, um die Liste des Pfades auf false zu setzen
	 */
	private void clean() {
		for (Node<T> iterator : this.pathList) {
			iterator.setVisit(false);
		}
	}

	/**
	 * Methode, um den Weg zur�ckzuliefern
	 * 
	 * @return pathList liefert den durchgelaufenen Pfad zur�ck
	 */
	public NodeListImpl<T> getPath() {
		return pathList;
	}
}
