/**
 * 
 */
package fr.eni.formation.geometrie;


/**
 * @author NPloquin
 *
 */
public class Point3D extends Point {
	
	private double z;

	/**
	 * 
	 */
	public Point3D() {
		super();
	}

	public Point3D(double x, double y, double z) {
		super(x,y);
		this.setZ(z);
	}
	
	public void deplacer(double dx, double dy, double dz) {
		super.deplacer(dx, dy);
		this.setZ(this.getZ() + dz);
	}

	@Override
	public String toString() {
		return "Point3D [" + getX() + "," + getY() + "," + getZ() + "]";
	}

	/**
	 * @return the z
	 */
	public double getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(double z) {
		this.z = z;
	}

	

}
