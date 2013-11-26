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
	public NodeListImpl<T> search(Node<T> firstNode, Node<T> toSearch) {

		NodeListImpl<T> tempList = new NodeListImpl<T>();
		NodeListImpl<T> found = new NodeListImpl<T>();
		Node<T> tempNode;

		pathList.clear();
		pathList.add(firstNode);

		// bSearch (Startknoten) {
		// färbe alle Knoten weiß
		// färbe Startknoten grau und hänge ihn an Schlange an
		// while(Schlange nicht leer){
		// tntferne erstes Element aus Schlange und
		// setze es auf tmp
		// for (alle Nachbarn von tmp) {
		// if (Farbe von Nachbarn == weiß) {
		// färbe Nachbarn grau und hänge ihn an Schlange an
		// }
		// }
		// färbe tmp schwarz
		// }
		// }

		if (firstNode.getValue().equals(toSearch.getValue())) {
			found.add(firstNode);
		} else {
			tempList.add(firstNode);

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
						this.pathList.add(iterator);
					}
				}
			}
		}
		// pathList.clear();
		clean(); // Liste leeren???
		return found;
	}

	// if(firstNode.getValue().equals(toSearch.getValue())){
	// pathList.add(firstNode);
	// firstNode.setVisit(true);
	// }else{
	//
	// firstNode.getChildren();
	// firstNode.getChildren().getFirst()
	//
	//

	// }

	// if (firstNode.getChildren().isEmpty()) {
	// pathList.add(firstNode);
	// firstNode.setVisit(true);
	// } else {
	// pathList.add(firstNode);
	// pathList.addAll(firstNode.getChildren());
	//
	// }
	// return pathList;
	// }

	/**
	 * Methode, um den Weg zurückzuliefern
	 * 
	 * @return pathList liefert den durchgelaufenen Pfad zurück
	 */
	public NodeListImpl<T> getPath() {
		return pathList;
	}

	private void clean() {
		for (Node<T> iterator : this.pathList) {
			iterator.setVisit(false);
		}
	}

//	arze

}
