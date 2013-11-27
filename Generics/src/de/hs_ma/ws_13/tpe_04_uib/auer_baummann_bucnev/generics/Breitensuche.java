package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse zur Erzeugung der Breitensuche.
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 27.11.2013
 * @param<T> Typ der gespeicherten Elemente
 * 
 */
public class Breitensuche<T> implements SearchStrategy<T> {

	NodeListImpl<T> pathList = new NodeListImpl<T>();

	/**
	 * Methode in der die Breitensuche implementiert ist. Der duchlaufene Pfad
	 * wird hier ebenfalls gespeichert
	 * 
	 * @param startNode
	 *            Anfangsknoten
	 * @param toSearch
	 *            gescuhter Wert
	 * @return found liefert den gesuchten Schlüsselwert zurück
	 */
	public NodeListImpl<T> search(Node<T> startNode, Node<T> toSearch) {

		NodeListImpl<T> tempList = new NodeListImpl<T>();
		NodeListImpl<T> found = new NodeListImpl<T>();
		Node<T> tempNode;

		pathList.clear();
		pathList.add(startNode);

		if (startNode.getValue().equals(toSearch.getValue())) {
			found.add(startNode);
		} else {
			tempList.add(startNode);

			while (!tempList.isEmpty()) {
				tempNode = tempList.removeFirst();
				tempNode.setVisit(true);

				for (Node<T> iterator : tempNode.getChildren()) {
					if (toSearch.getValue().equals(iterator.getValue())) {
						found.add(iterator);
					}
					if (!iterator.getVisit()) {
						iterator.setVisit(true);
						tempList.add(iterator);
						pathList.add(iterator);
					}
				}
			}
		}
		clean();
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

	/**
	 * Methode, um die Liste des Pfades auf false zu setzen
	 */
	private void clean() {
		for (Node<T> iterator : this.pathList) {
			iterator.setVisit(false);
		}
	}

}
