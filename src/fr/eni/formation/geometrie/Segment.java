/**
 * 
 */
package fr.eni.formation.geometrie;

import java.util.Comparator;

/**
 * @author NPloquin
 *
 */
public class Segment implements Cloneable {
	
	public static final Comparator<Segment> LONGUEUR_COMPARATOR;
	
	public Point origine;
	public Point destination;
	
	static {
		
		System.out.println("Chargement de la classe Segment.");
		
		LONGUEUR_COMPARATOR = new Comparator<Segment>() {
			@Override
			public int compare(Segment o1, Segment o2) {
				double diff = o1.longueur() - o2.longueur();
				if(diff < 0.0) return -1;
				if(diff > 0.0) return 1;
				return 0;
			}
		};
		
	}
	
//	public static class LongueurComparator implements Comparator<Segment>{
//
//		/**
//		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
//		 */
//		@Override
//		public int compare(Segment o1, Segment o2) {
//			double diff = o1.longueur() - o2.longueur();
//			if(diff < 0.0) return -1;
//			if(diff > 0.0) return 1;
//			return 0;
//		}
//		
//	}
	
	
	
	public Segment(){
		origine = new Point();
		destination = new Point();
	}	
	
	public Segment(Point origine, Point destination){
		this.origine = origine;
		this.destination = destination;
	}
	
	public void deplacer(double dx, double dy){
		origine.deplacer(dx, dy);
		destination.deplacer(dx, dy);
	}
	
	public double longueur(){
		return Math.sqrt(Math.pow(origine.getX()-destination.getX(),2) + Math.pow(origine.getY()-destination.getY(),2));
	}
	
	@Override
	public String toString() {
		return "Ligne ( " + origine + " ; " + destination + " ; longueur = " + longueur() + " )";
	}
	
//	@Override
//	public Segment clone() {
//		return new Segment((Point)origine.dupliquer(), (Point)destination.dupliquer());
//	}
	public Segment dupliquer(){
		Segment segment = null;
		try {
			segment = (Segment)this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return segment;
	}


}
