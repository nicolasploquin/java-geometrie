/**
 * 
 */
package fr.eni.formation.geometrie;

/**
 * @author NPloquin
 *
 */
public class Cercle extends Figure {

	public Point centre;
	public double rayon;
	
	public Cercle() {
		super();
	}

	public Cercle(Point centre, double rayon) {
		this();
		this.centre = centre;
		this.rayon = rayon;
	}
	
	
	
	/**
	 * @see fr.eni.formation.geometrie.Figure#aire()
	 */
	@Override
	public double aire() {
		return Math.PI * rayon * rayon;
	}

	@Override
	public double perimetre() {
		return Math.PI * rayon * 2;
	}
	
	@Override
	public String toString() {
		return "Cercle ( centre : " + centre + " , rayon : " + rayon + " , perimètre : " + perimetre() + ", aire : " + aire() + ")";
	}



}
