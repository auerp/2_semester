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

		a.addChild(b);
        a.addChild(c);
        a.addChild(d);
        b.addChild(e);
        b.addChild(f);
        b.addChild(g);
        c.addChild(l);
        c.addChild(m);
        d.addChild(o);
        d.addChild(p);
        e.addChild(h);
        e.addChild(i);
        f.addChild(j);
        f.addChild(k);
        m.addChild(n);

		// Elemente in die Liste der Breitensuche hinzufügen
		breitensuche.add(a);
		breitensuche.add(b);
		breitensuche.add(c);
		breitensuche.add(d);
		breitensuche.add(e);
		breitensuche.add(f);
		breitensuche.add(g);
		breitensuche.add(l);
		breitensuche.add(m);
		breitensuche.add(o);
		breitensuche.add(p);
		breitensuche.add(h);
		breitensuche.add(i);
		breitensuche.add(j);
		breitensuche.add(k);
		breitensuche.add(n);

		// Elemente in die Liste der Tiefensuche hinzufügen
		tiefensuche.add(a);
		tiefensuche.add(b);
		tiefensuche.add(e);
		tiefensuche.add(h);
		tiefensuche.add(i);
		tiefensuche.add(f);
		tiefensuche.add(j);
		tiefensuche.add(k);
		tiefensuche.add(g);
		tiefensuche.add(c);
		tiefensuche.add(l);
		tiefensuche.add(m);
		tiefensuche.add(n);
		tiefensuche.add(d);
		tiefensuche.add(o);
		tiefensuche.add(p);

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
