package fr.eni.formation.geometrie;

import java.util.LinkedList;
import java.util.List;

public class Polygone extends Figure {
	
	public List<Point> coords = new LinkedList<Point>();
	
	/**
	 * 
	 */
	public Polygone() {
		super();
	}
	public Polygone(Point p1, Point p2, Point p3, Point... points) throws Exception {
		super();
		coords.add(p1);
		coords.add(p2);
		coords.add(p3);
		if(points.length >10) throw new Exception("Trop de points");
		for(Point p : points){
			coords.add(p);
		}
	}

	/**
	 * @param coords
	 */
	public Polygone(List<Point> coords) {
		super();
		this.coords = coords;
	}

	@Override
	public double aire() {
		return 0;
	}

	@Override
	public double perimetre() {
		return 0;
	}

	@Override
	public String toString() {
		String text = "Polygone ( coords : [ ";
		for(Point p : coords){
			text += p + ", ";
		}
		return text + " ] )";
	}

}
