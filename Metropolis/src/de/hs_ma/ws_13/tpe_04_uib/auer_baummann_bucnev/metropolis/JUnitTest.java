package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Testklasse zum ausführen bestimmter Tests. Verschiedene Methoden werden auf
 * geprüft, ob diese beispielsweise das korrekte Ergebnis liefern
 * 
 * @author auerp
 * @author baumannt
 * @author bucnevr
 * @version 13.11.2013
 * 
 */

public class JUnitTest {

	@Test
	public void testBerechneEinkommenssteuer() {
		// Buerger
		// Possitives Einkommen mit Grenzwerten
		assertEquals(1000,
				new Buerger("Hans", 50, 10000).berechneEinkommenssteuer());
		assertEquals(2000,
				new Buerger("Roman", 21, 20000).berechneEinkommenssteuer());
		assertEquals(4500,
				new Buerger("Jens", 27, 30000).berechneEinkommenssteuer());
		assertEquals(7000,
				new Buerger("Tobias", 21, 40000).berechneEinkommenssteuer());
		assertEquals(9500,
				new Buerger("Mchelle", 21, 50000).berechneEinkommenssteuer());
		assertEquals(12000,
				new Buerger("Hildegard", 60, 60000).berechneEinkommenssteuer());
		assertEquals(19000,
				new Buerger("Patric", 27, 80000).berechneEinkommenssteuer());
		assertEquals(26000,
				new Buerger("Brunhilde", 65, 100000).berechneEinkommenssteuer());
		assertEquals(33000,
				new Buerger("Heinz", 40, 120000).berechneEinkommenssteuer());
		assertEquals(43000,
				new Buerger("Doris", 44, 140000).berechneEinkommenssteuer());
		assertEquals(48000,
				new Buerger("Axel", 35, 150000).berechneEinkommenssteuer());
		assertEquals(73000,
				new Buerger("Frank", 45, 200000).berechneEinkommenssteuer());
		// kein zu versteuerndes Einkommen
		assertEquals(0, new Buerger("Patric", 27, 0).berechneEinkommenssteuer());
		// kein zu versteuerndes Einkommen mit negativen Werten
		assertEquals(0,
				new Buerger("Patric", 27, -10000).berechneEinkommenssteuer());

		// Personengesellschaften
		// Liste der Inhaber
		ArrayList<Buerger> inhaber1 = new ArrayList<Buerger>();
		inhaber1.add(new Buerger("Patric", 27, 200000));
		inhaber1.add(new Buerger("Peter", 20, 0));
		inhaber1.add(new Buerger("'Michelle", 21, 80000));

		ArrayList<Buerger> inhaber2 = new ArrayList<Buerger>();
		inhaber2.add(new Buerger("Thomas", 27, 0));

		ArrayList<Buerger> inhaber3 = new ArrayList<Buerger>();
		inhaber3.add(new Buerger("Roman", 20, -20000));
		inhaber3.add(new Buerger("Axel", 45, 0));

		// // zu versteuerndes Einkommen
		assertEquals(92000, new Personengesellschaften("Maier KG", 200000,
				inhaber1).berechneEinkommenssteuer());
		// kein zu versteuerndes Einkommen
		assertEquals(0,
				new Personengesellschaften("Maier KG", 0, inhaber2)
						.berechneEinkommenssteuer());
		// kein zu versteuernder Gewinn bei negativen Werten
		assertEquals(0,
				new Personengesellschaften("Maier KG", -10000, inhaber3)
						.berechneEinkommenssteuer());
	}

	@Test
	public void testBerechneGewerbesteuer() {

		ArrayList<Buerger> gesellschafter1 = new ArrayList<Buerger>();
		gesellschafter1.add(new Buerger("Hans", 50, 10000));

		ArrayList<Buerger> gesellschafter2 = new ArrayList<Buerger>();
		gesellschafter2.add(new Buerger("Peter", 20, 0));
		gesellschafter2.add(new Buerger("'Michelle", 21, 80000));

		// Kapitalgesellschaften
		// Berechnung mit Gewinn
		assertEquals(100000, new Kapitalgesellschaften("EnBW AG", 1000000,
				gesellschafter1).berechneGewerbesteuer());
		// kein zu versteuernder Gewinn
		assertEquals(0,
				new Kapitalgesellschaften("EnBW AG", 0, gesellschafter2)
						.berechneGewerbesteuer());
		// kein zu versteuernder Gewinn bei Verlust
		assertEquals(0, new Kapitalgesellschaften("EnBW AG", -10,
				gesellschafter1).berechneGewerbesteuer());

		// Personengesellschaften
		// Berechnung mit Gewinn
		assertEquals(100, new Personengesellschaften("Maier KG", 1000,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
		assertEquals(99, new Personengesellschaften("Mueller KG", 999,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
		// Berechnung mit Gewinn und Abzug der Steuerermaessigung
		assertEquals(500, new Personengesellschaften("Maier KG", 15000,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
		// kein zu versteuernder Gewinn
		assertEquals(0, new Personengesellschaften("Maier KG", 0,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
		// kein zu versteuernder Gewinn bei Verlust
		assertEquals(0, new Personengesellschaften("Maier KG", -15400,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
		assertEquals(0, new Personengesellschaften("Mueller KG", -200000,
				new ArrayList<Buerger>()).berechneGewerbesteuer());
	}

	@Test
	public void testBerechneKoerperschaftssteuer() {

		ArrayList<Buerger> gesellschafter2 = new ArrayList<Buerger>();
		gesellschafter2.add(new Buerger("Peter", 20, 0));
		gesellschafter2.add(new Buerger("'Michelle", 21, 80000));

		// Kapitalgesellschaften
		// Berechnung mit Gewinn
		assertEquals(2500, new Kapitalgesellschaften("Toms AG", 10000,
				gesellschafter2).berechneKoerperschaftssteuer());
		// kein zu versteuernder Gewinn
		assertEquals(0, new Kapitalgesellschaften("Fritz AG", 0,
				gesellschafter2).berechneKoerperschaftssteuer());
		// kein zu versteuernder Gewinn bei Verlust
		assertEquals(0,
				new Kapitalgesellschaften("EnBW AG", -45, null)
						.berechneKoerperschaftssteuer());

		// Schurken
		// Berechnung mit Gewinn
		Schurken s1 = new Schurken("Tom ", 10000, Superkraft.FEUERBALL, true,
				true);
		Schurken s2 = new Schurken("Patricia", 30000, Superkraft.UNGLAEUBIG,
				true, false);
		Schurken s3 = new Schurken("Dozent", 90000, Superkraft.VORLESUNG,
				false, true);
		Schurken s4 = new Schurken("Dozent", 200000, Superkraft.VORLESUNG,
				true, true);
		Schurken s5 = new Schurken("Golum", 130000, Superkraft.MEINSCHATZ,
				false, true);
		Schurken s6 = new Schurken("Iceman", -20000, Superkraft.EISSTRAHL,
				false, false);

		// Liste mit Schurken- Objekten füllen
		ArrayList<Schurken> schurken = new ArrayList<Schurken>();
		schurken.add(s1);
		schurken.add(s2);
		schurken.add(s3);

		// Liste mit Schurken- Objekten füllen
		ArrayList<Schurken> schurken2 = new ArrayList<Schurken>();
		schurken2.add(s4);
		schurken2.add(s5);
		schurken2.add(s3);

		// Liste mit Schurken- Objekten füllen
		ArrayList<Schurken> schurken3 = new ArrayList<Schurken>();
		schurken3.add(s6);
		schurken3.add(s1);

		assertEquals(32500,
				new SchurkenSyndikat("Tom", schurken)
						.berechneKoerperschaftssteuer());
		assertEquals(105000,
				new SchurkenSyndikat("Fisch", schurken2)
						.berechneKoerperschaftssteuer());
		assertEquals(0,
				new SchurkenSyndikat("Flieger", schurken3)
						.berechneKoerperschaftssteuer());

	}

	@Test
	public void verurteilen() {
		// Richter ist korrupt, Schurke wird nicht verurteilt (true)
		assertEquals(false,
				new Richter("Gustav", 50, 60000, true).verurteilt(new Schurken(
						"Dozent", 80000, Superkraft.VORLESUNG, true, true)));
		// Richter ist nicht korrupt, Schurke wird verurteilt (true)
		assertEquals(true,
				new Richter("Gustav", 50, 60000, false)
						.verurteilt(new Schurken("Dozent", 80000,
								Superkraft.VORLESUNG, true, true)));
		// Richter ist nicht korrupt, Schurke wird nicht verurteilt (false)
		assertEquals(false,
				new Richter("Gustav", 50, 60000, true).verurteilt(new Schurken(
						"Dozent", 80000, Superkraft.VORLESUNG, false, true)));
		// Richter ist korrupt, Schurke wird nicht verurteilt (false)
		assertEquals(false,
				new Richter("Gustav", 50, 60000, true).verurteilt(new Schurken(
						"Dozent", 80000, Superkraft.VORLESUNG, false, true)));

	}

	@Test
	public void kaempfe() {

		// Schurke greift Superheld an und verliert
		assertEquals(true, new Schurken("Peter", 25000, Superkraft.UNGLAEUBIG,
				true, false).kaempfe(new Superhelden("Superman", 30000,
				Superkraft.UNGLAEUBIG)));

		// Schurke greift Superheld an und gewinnt
		assertEquals(false, new Schurken("Lutzi", 22000, Superkraft.LASERBLICK,
				true, false).kaempfe(new Superhelden("Catwoman", 70000,
				Superkraft.UNGLAEUBIG)));

		// Superheld greift Schurken an und verliert
		assertEquals(false, new Superhelden("Leno", 22000,
				Superkraft.LASERBLICK).kaempfe(new Schurken("Kathi", 70000,
				Superkraft.UNGLAEUBIG, true, false)));

		// Superheld greift Schurken an und gewinnt
		assertEquals(true, new Superhelden("Student", 22000,
				Superkraft.LASERBLICK, Superkraft.FEUERBALL,
				Superkraft.EISSTRAHL).kaempfe(new Schurken("Stein", 70000,
				Superkraft.LASERBLICK, true, false)));

	}

	@Test
	public void berechneGesamteSteuern() {

		Finanzamt.leereListEinkommenssteuer();
		Finanzamt.leereListKoerperschaftssteuer();
		Finanzamt.leereListGewerbesteuer();

		// s1 ist in syndikat, führt Koerperschaftssteuer und Einkommensteuer
		// (Doppel Belastung)
		Schurken s1 = new Schurken("Tom ", 10000, Superkraft.FEUERBALL, true,
				true);
		// s2 ist nicht in Syndikat, führt nur Koerperschaftssteuer ab
		Schurken s2 = new Schurken("Golum", 50000, Superkraft.MEINSCHATZ,
				false, true);
		Buerger buerger = new Buerger("Nadine", 21, 30000);

		// Kapitalgesellschaft führt Körperschafts- und Gewerbesteuer ab
		Kapitalgesellschaften kapital1 = new Kapitalgesellschaften("EnBW AG",
				10000000, null);

		// Liste mit Inhabern einer Personengesellschaft
		ArrayList<Buerger> inhaber = new ArrayList<Buerger>();
		inhaber.add(buerger);

		// Personengesellschaft führt Gewerbe- und Einkommenssteuer ab
		Personengesellschaften perso = new Personengesellschaften("Hambsch KG",
				10000, inhaber);

		// Schurke muss dem Syndikat hinzugefügt werden!!!
		ArrayList<Schurken> schurken = new ArrayList<Schurken>();
		schurken.add(s1);

		// Schurkensyndikat führt Körperschaftssteuer aus der Summe des
		// Einkommens seiner Mitglieder ab
		SchurkenSyndikat syndi = new SchurkenSyndikat("TUT", schurken);

		// Gesamte Steuerberechnung
		assertEquals(3522000, Finanzamt.berechneGesamteSteuern());
	}

}
