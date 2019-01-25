/**
 * 
 */
package fr.eni.formation.geometrie;

/**
 * @author NPloquin
 *
 */
public class Triangle extends Figure implements Cloneable  {
	
	public Point sommet;
	public Segment base;
	
	public Triangle() {
	}

	public Triangle(Point sommet, Segment base) {
		this.base = base;
		this.sommet = sommet;
	}

	@Override
	public double aire() {
		return 0;
	}

	@Override
	public double perimetre() {
		return 0;
	}
	
//	@Override
//	public Triangle clone() {
//		
//		return new Triangle(sommet.clone(), base.clone());
//	}
}
