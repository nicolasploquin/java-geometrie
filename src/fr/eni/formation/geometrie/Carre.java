/**
 * 
 */
package fr.eni.formation.geometrie;

/**
 * @author NPloquin
 *
 */
public class Carre extends Figure implements Cloneable {
	
	public Point origine;
	public double cote;
	
	public Carre() {

			super();			

	}

	/**
	 * @param origine
	 * @param cote
	 */
	public Carre(Point origine, double cote) {
		this();
		this.origine = origine;
		this.cote = cote;
	}

	/**
	 * @return the origine
	 */
	public Point getOrigine() {
		return origine;
	}

	/**
	 * @param origine the origine to set
	 */
	public void setOrigine(Point origine) {
		this.origine = origine;
	}

	/**
	 * @return the cote
	 */
	public double getCote() {
		return cote;
	}

	/**
	 * @param cote the cote to set
	 */
	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public double aire() {
		return cote * cote;
	}
	
	@Override
	public double perimetre() {
		return 4*cote;
	}
	

//	@Override
//	public Carre clone() {
//		return new Carre(origine.clone(),cote);
//	}
	
	@Override
	public String toString() {
		return "Carré ( origine : " + origine + " , côté : " + cote + " , perimètre : " + perimetre() + ", aire : " + aire() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return (obj instanceof Carre) && this.origine.equals(((Carre)obj).origine) && (this.cote == ((Carre)obj).cote);
	}


}
