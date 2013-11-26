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

	public static void main(String[] args) {
		
//		NodeListImpl<String> list = new NodeListImpl<String>();
		Breitensuche breitensuche = new Breitensuche();
		
		Node<String> a = new Node<String>("A", "A");
        Node<String> b = new Node<String>("B", "B");
        Node<String> c = new Node<String>("C", "C");
        Node<String> d = new Node<String>("D", "D");
        Node<String> e = new Node<String>("E", "E");
        Node<String> f = new Node<String>("F", "F");
        
      
        
        a.addChild(d);
        a.addChild(c);
        a.addChild(b);
        
//        System.out.println(a);
        System.out.println(breitensuche.search(a, b));
        System.out.println(breitensuche.getPath());
        
        b.addChild(f);
        
     

	}

}
