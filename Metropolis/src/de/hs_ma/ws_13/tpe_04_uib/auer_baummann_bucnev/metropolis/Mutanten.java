package de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis;

/**
 * Abstrakte Klasse zur Erzeugung von Mutanten.
 * 
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 * @version 13.11.2013
 * 
 */
public abstract class Mutanten extends Einwohner {

	/**
	 * Variable, um die superkraefte verwalten zu können
	 */
	protected Superkraft superkraft;

	/**
	 * Methode zur Erzeugung der Mutanten
	 * 
	 * @param name
	 *            des Mutanten
	 * @param einkommen
	 *            des Mutanten
	 * @param superkraft
	 *            des Mutanten
	 */
	Mutanten(String name, int einkommen, Superkraft superkraft) {
		super(name, einkommen);
		// this.name = name;
		// this.einkommen = einkommen;
		this.superkraft = superkraft;
	}

	/**
	 * Absrakte Methode, um gegeneinander zu kaempfen
	 * 
	 * @return
	 */
	protected abstract boolean kaempfe(Mutanten mutant);

	/**
	 * Überschreiben der hashCode() Methode
	 * 
	 * @return result
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((superkraft == null) ? 0 : superkraft.hashCode());
		return result;
	}

	/**
	 * Überschreiben der equals() Methode um superkraft zu vergleichen
	 * 
	 * @return liefert true bei gleichheit andernfalls false
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mutanten other = (Mutanten) obj;
		if (superkraft == null) {
			if (other.superkraft != null)
				return false;
		} else if (!superkraft.equals(other.superkraft))
			return false;
		return true;
	}

	/**
	 * Methode, um eine anständige Anzeige zu erzeugen
	 */
	public String toString() {
		return "Mutanten [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft + "]";
	}

}
