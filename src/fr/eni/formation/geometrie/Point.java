/**
 * 
 */
package fr.eni.formation.geometrie;

/**
 * @author NPloquin
 *
 */
public class Point implements Cloneable {
	
	public static int nbPoints = 0;

	private double x = 0.0;
	private double y = 0.0;
	
	static {
		System.out.println("Chargement de la classe Point : " + nbPoints);
	}
	
	public Point() {
		super();
		nbPoints++;
//		System.out.println("Construction d'un nouveau point");
	}

	public Point(double x, double y) {
		this();
		try {
			setX(x);
			setY(y);
		} catch (HorsLimitesException e) {
			System.err.println("Erreur dans les coordonnés du point. Le point est initialisé à " + this);
			e.printStackTrace();
		}
	}
	
	public static int getNbPoints() {
		return nbPoints;
	}

	protected static void setNbPoints(int nbPoints) {
		Point.nbPoints = nbPoints;
	}

	public double getX(){
		return x;
	}
	
	public void setX(double x) throws HorsLimitesException{
		if(x >= 0.0 && x <= 200.0){
			this.x = x;
		}else{
			throw new HorsLimitesException();
		}
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) throws HorsLimitesException {
		if(y >= 0.0 && y <= 200.0){
			this.y = y;
		}else{
			throw new HorsLimitesException();
		}
	}

	@Deprecated
	public static void afficheNbPoints(){
		System.out.println(nbPoints + " points créés.");
	}
	
	public void deplacer(double dx, double dy){
		try {
			this.setX(this.getX() + dx);
			this.setY(this.getY() + dy);
		} catch (HorsLimitesException e) {
			System.err.println("Déplacement impossible.");
			e.printStackTrace();
		}
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Point [" + getX() + "," + getY() + "]";
	}
	
	public boolean equals(Object p){
		return (p instanceof Point) && (this.getX() == ((Point)p).getX()) && (this.getY() == ((Point)p).getY());
	}

	
	

	@Override
	public Object clone() {
		return new Point(getX(),getY());
	}
	
	@Override
	protected void finalize() throws Throwable {
		nbPoints--;
		System.out.println("Suppression du point : " + this.toString());
		
	}

	public Point dupliquer(){
		Point point = null;
		point = (Point)this.clone();
		return point;
	}
	

}
