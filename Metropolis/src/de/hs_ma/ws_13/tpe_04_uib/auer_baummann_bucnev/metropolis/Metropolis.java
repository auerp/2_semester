package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import java.util.ArrayList;

/**
 * Klasse, zur Erzeugung einer Simulation der Stadt Metropolis.
 * 
 * @author pauer
 * @author baumannt
 * @author bucnevr
 * 
 * @version 13.11.2013
 * 
 */
public class Metropolis {

	public static void main(String[] args) {

		// Einwohner Schurken angelegen
		Schurken mutantSch1 = new Schurken("Shrek", 20000,
				Superkraft.EISSTRAHL, true, true);
		Schurken mutantSch2 = new Schurken("Wuka", 3000, Superkraft.FEUERBALL,
				false, false);
		Schurken mutantSch3 = new Schurken("Luke", 23000,
				Superkraft.LASERBLICK, true, false);
		Schurken mutantSch4 = new Schurken("Vader", 45000,
				Superkraft.MEINSCHATZ, false, true);

		// Liste mit Schurken für SchurkenSyndikat und Schurken hinzufügen
		ArrayList<Schurken> syndiList = new ArrayList<Schurken>();
		syndiList.add(mutantSch1);
		syndiList.add(mutantSch4);

		// SchurkenSyndikat anlegen
		SchurkenSyndikat syndi = new SchurkenSyndikat("Die Unglaublichen",
				syndiList);

		// Einwohner Superhelden anlegen
		Mutanten mutantSup1 = new Superhelden("Powerman", 10000,
				Superkraft.EISSTRAHL, Superkraft.MEINSCHATZ);
		Mutanten mutantSup2 = new Superhelden("Thunder", 2000,
				Superkraft.UNGLAEUBIG, Superkraft.FEUERBALL);

		// Einwohner Buerger anlegen
		Buerger menschBue1 = new Buerger("Lutzi", 22, 60000);
		Buerger menschBue2 = new Buerger("Peter", 26, 200000);
		Buerger menschBue3 = new Buerger("Krummbein", 23, 80000);
		Buerger menschBue4 = new Buerger("Hans", 50, 10000);
		Buerger menschBue5 = new Buerger("Roman", 21, 20000);
		Buerger menschBue6 = new Buerger("Jens", 27, 30000);
		Buerger menschBue7 = new Buerger("Tobias", 21, 40000);
		Buerger menschBue8 = new Buerger("Michelle", 21, 50000);
		Buerger menschBue9 = new Buerger("Hildegard", 60, 60000);
		Buerger menschBue10 = new Buerger("Patric", 27, 80000);
		Buerger menschBue11 = new Buerger("Brunhilde", 65, 100000);
		Buerger menschBue12 = new Buerger("Heinz", 40, 120000);
		Buerger menschBue13 = new Buerger("Doris", 44, 140000);
		Buerger menschBue14 = new Buerger("Axel", 35, 150000);
		Buerger menschBue15 = new Buerger("Frank", 45, 200000);
		// kein zu versteuerndes Einkommen
		Buerger menschBue16 = new Buerger("Patric", 27, 0);
		// kein zu versteuerndes Einkommen mit negativen Werten
		Buerger menschBue17 = new Buerger("Patric", 27, -10000);

		// Liste anlegen und mit Buergern füllen
		ArrayList<Buerger> inhaber = new ArrayList<Buerger>();
		inhaber.add((Buerger) menschBue1);
		inhaber.add((Buerger) menschBue2);

		// Weitere Liste anlegen und mit Buergern füllen
		ArrayList<Buerger> inhaber2 = new ArrayList<Buerger>();
		inhaber2.add((Buerger) menschBue3);

		// Gesellschafterliste anlegen und mit Buergern fuellen
		ArrayList<Buerger> gesellschafter1 = new ArrayList<Buerger>();
		gesellschafter1.add((Buerger) menschBue4);
		gesellschafter1.add((Buerger) menschBue5);
		gesellschafter1.add((Buerger) menschBue6);
		gesellschafter1.add((Buerger) menschBue7);

		// Weitere Gesellschafterliste
		ArrayList<Buerger> gesellschafter2 = new ArrayList<Buerger>();
		gesellschafter2.add((Buerger) menschBue8);
		gesellschafter2.add((Buerger) menschBue9);
		gesellschafter2.add((Buerger) menschBue10);
		gesellschafter2.add((Buerger) menschBue11);

		// Einwohner Richter anlegen
		Richter menschRic1 = new Richter("Raudi", 45, 45000, true);
		Richter menschRic2 = new Richter("Schnauzer", 62, 63000, false);

		// Einwohner Superheld anlegen
		Superhelden mutantSupi = new Superhelden("Thunder", 20000,
				Superkraft.EISSTRAHL, Superkraft.FEUERBALL);

		// Unternehmen (Personengesellschaften) anlegen
		Personengesellschaften perso1 = new Personengesellschaften("Firma",
				250000, inhaber);
		Personengesellschaften perso2 = new Personengesellschaften("Gasthaus",
				500000, inhaber2);

		// Liste mit Gesellschaftern
		ArrayList<Buerger> gesellschafter = new ArrayList<Buerger>();
		gesellschafter.add(menschBue1);
		gesellschafter.add(menschBue4);

		// Unternehmen (Kapitalgesellschaften) anlegen
		Kapitalgesellschaften kapi1 = new Kapitalgesellschaften("HUHU GmbH",
				420000, gesellschafter);
		Kapitalgesellschaften kapi2 = new Kapitalgesellschaften("Lutzis GmbH",
				80000, gesellschafter);

		// Methode kaempfen()
		// Schurke greift Superhelden an
		// Gleiche Kraft --> Schurke verliert
		mutantSch1.kaempfe(mutantSup1);

		// Unterschiedliche Kraft --> Schurke gewinnt
		mutantSch2.kaempfe(mutantSup2);

		// Superheld greift Schurken an
		// Gleiche Kraft
		mutantSup1.kaempfe(mutantSch1);
		// Unterschiedliche Kraft
		mutantSup2.kaempfe(mutantSch3);

		// Methode verurteilen()
		// Richter korrupt und verurteilt somit Schurken
		menschRic1.verurteilt((Schurken) mutantSch1);
		// Richter nicht korrupt und verurteilt Schurken nicht
		menschRic2.verurteilt((Schurken) mutantSch2);

		// Koerperschaftssteuer ermitteln
		kapi1.berechneKoerperschaftssteuer();
		kapi2.berechneKoerperschaftssteuer();
		syndi.berechneKoerperschaftssteuer();

		// Gewerbesteuer ermitteln
		kapi1.berechneGewerbesteuer();
		kapi2.berechneGewerbesteuer();
		perso1.berechneGewerbesteuer();
		perso2.berechneGewerbesteuer();

		// Einkommenssteuer ermitteln
		menschBue1.berechneEinkommenssteuer();
		menschBue2.berechneEinkommenssteuer();
		menschBue3.berechneEinkommenssteuer();
		perso1.berechneEinkommenssteuer();
		perso2.berechneEinkommenssteuer();
		mutantSch1.berechneEinkommenssteuer();
		mutantSch2.berechneEinkommenssteuer();
		mutantSch3.berechneEinkommenssteuer();
		mutantSch4.berechneEinkommenssteuer();

		// gesamte Steuer ermitteln
		Finanzamt.berechneGesamteSteuern();

		System.out
				.println("**************************METROPOLIS****************************");
		System.out.println("");
		System.out.println("<<------- Einwohner ------->>");
		System.out.println("");
		System.out.println("<--Menschen-->");
		System.out.println(menschBue1);
		System.out.println(menschRic1);
		System.out.println("");
		System.out.println("<--Mutanten-->");
		System.out.println(mutantSch1);
		System.out.println(mutantSupi);
		System.out.println("");
		System.out.println("<<-------Unternehmen------->>");
		System.out.println("");
		System.out.println("<--Personengesellschaften-->");
		System.out.println(perso1);
		System.out.println(perso2);
		System.out.println("");
		System.out.println("<--Kapitalgesellschaften-->");
		System.out.println(kapi1);
		System.out.println(kapi2);
		System.out.println("");
		System.out.println("<--Schurken Syndikat-->");
		System.out.println(syndi);
		System.out.println("");
		System.out.println("<<-------Finanzamt------->>");
		System.out.println("");
		System.out.println("<--Einkommenssteuer-->");
		System.out.println(Finanzamt.berechneEinkommenssteuer());
		System.out.println("");
		System.out.println("<--Körperschaftssteuer-->");
		System.out.println(Finanzamt.berechneKoerperschaftsteuer());
		System.out.println("");
		System.out.println("<--Gewerbesteuer-->");
		System.out.println(Finanzamt.berechneGewerbesteuer());
		System.out.println("");
		System.out.println("<--Gesamte Steuer-->");
		System.out.println(Finanzamt.berechneGesamteSteuern());

	}

}
