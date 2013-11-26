package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.generics;

/**
 * Klasse um eine Simulation zu erzeugen
 * 
 * @author pauer
 * @author rbucnev
 * @author tbaumann
 * @version 22.11.2013
 * 
 */

public class Main {

	public static <T> void main(String[] args) {

		// NodeListImpl<String> list = new NodeListImpl<String>();
		Breitensuche<String> breitensuche = new Breitensuche<String>();

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



		a.addChild(b);
        a.addChild(c);
        a.addChild(d);
        b.addChild(e);
        b.addChild(f);
        b.addChild(g);
        b.addChild(a);
        c.addChild(l);
        c.addChild(m);
        d.addChild(o);
        d.addChild(p);
        e.addChild(h);
        e.addChild(i);
        f.addChild(j);
        f.addChild(k);
        m.addChild(n);
        

		
		Graph<String> firstGraph = new Graph<String>(a);

		// System.out.println(a);
		System.out.println(firstGraph.search(b, breitensuche));
		System.out.println("Breitensuche: " + breitensuche.getPath());

//		b.addChild(f);

	}

}
