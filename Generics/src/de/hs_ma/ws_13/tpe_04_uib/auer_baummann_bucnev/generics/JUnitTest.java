package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Klasse, zum Testen der Implementierten Methoden
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 20.11.2013
 * 
 */
public class JUnitTest {

	@Test
	public void test() {
		// Objekte
		Breitensuche<String> breitensucheObject = new Breitensuche<String>();
		Tiefensuche<String> tiefensucheObject = new Tiefensuche<String>();

		// Listen
		NodeListImpl<String> breitensuche = new NodeListImpl<String>();
		NodeListImpl<String> tiefensuche = new NodeListImpl<String>();
		NodeListImpl<String> found = new NodeListImpl<String>();
		NodeListImpl<String> notFound = new NodeListImpl<String>();
		NodeListImpl<String> copyList = new NodeListImpl<String>();

		Node<String> a = new Node<String>("A", "A");
		Node<String> b = new Node<String>("B", "B");
		Node<String> c = new Node<String>("C", "C");
		Node<String> d = new Node<String>("D", "D");
		Node<String> e = new Node<String>("E", "E");
		Node<String> f = new Node<String>("F", "F");
		Node<String> g = new Node<String>("G", "G");
		Node<String> h = new Node<String>("H", "H");
		Node<String> i = new Node<String>("I", "I");
		Node<String> j = new Node<String>("J", "J");
		Node<String> k = new Node<String>("K", "K");
		Node<String> l = new Node<String>("L", "L");
		Node<String> m = new Node<String>("M", "M");
		Node<String> n = new Node<String>("N", "N");
		Node<String> o = new Node<String>("O", "O");
		Node<String> p = new Node<String>("P", "P");
		Node<String> z = new Node<String>("Z", "Z");

		a.addChild(d);
		a.addChild(c);
		a.addChild(b);
		b.addChild(g);
		b.addChild(f);
		b.addChild(e);
		b.addChild(a);
		g.addChild(d);
		f.addChild(k);
		f.addChild(j);
		e.addChild(h);
		e.addChild(i);
		k.addChild(d);
		j.addChild(i);
		h.addChild(b);

		// Elemente in die Liste der Breitensuche hinzufügen
		breitensuche.add(a);
		breitensuche.add(d);
		breitensuche.add(c);
		breitensuche.add(b);
		breitensuche.add(g);
		breitensuche.add(f);
		breitensuche.add(e);
		breitensuche.add(k);
		breitensuche.add(j);
		breitensuche.add(h);
		breitensuche.add(i);

		// Elemente in die Liste der Tiefensuche hinzufügen
		tiefensuche.add(a);
		tiefensuche.add(d);
		tiefensuche.add(c);
		tiefensuche.add(b);
		tiefensuche.add(g);
		tiefensuche.add(f);
		tiefensuche.add(k);
		tiefensuche.add(j);
		tiefensuche.add(i);
		tiefensuche.add(e);
		tiefensuche.add(h);

		Graph<String> firstGraph = new Graph<String>(a);

		found.add(k);

		// Breitensuche
		// Schlüsselwert enthalten
		assertEquals(found, firstGraph.search(k, breitensucheObject));
		// Schlüsselwert nicht enthalten
		assertEquals(notFound, firstGraph.search(z, breitensucheObject));
		// durchlaufener Pfad
		assertEquals(breitensuche, breitensucheObject.getPath());

		// Tiefensuche
		// Schlüsselwert enthalten
		assertEquals(found, firstGraph.search(k, tiefensucheObject));
		// Schlüsselwert nicht enthalten
		assertEquals(notFound, firstGraph.search(z, tiefensucheObject));
		assertEquals(tiefensuche, tiefensucheObject.getPath());

		// copyInto() Test
		assertEquals(breitensuche, firstGraph.copyInto(breitensuche, copyList));
	}
}
