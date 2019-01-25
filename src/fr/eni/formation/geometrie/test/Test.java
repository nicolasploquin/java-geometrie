/**
 * 
 */
package fr.eni.formation.geometrie.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.eni.formation.geometrie.Carre;
import fr.eni.formation.geometrie.CarreBuilder;
import fr.eni.formation.geometrie.Cercle;
import fr.eni.formation.geometrie.Figure;
import fr.eni.formation.geometrie.Point;
import fr.eni.formation.geometrie.Point3D;
import fr.eni.formation.geometrie.Segment;
import fr.eni.formation.geometrie.SegmentComparator;

/**
 * @author NPloquin
 *
 */
public class Test {

	/**
	 * @param args Ce programme n'attend pas de paramètre.
	 */
	public static void main(String[] args) {
		
		Point p1 = new Point(1.0,3.0);
		Point p2 = new Point(2.0,4.0);
		Point p3 = new Point(3.0,4.0);
		Point p4 = new Point3D(3.0,4.0,6.0);
		
//		p1.z = 4.0;
//		if(p2.getClass() == Point3D.class){
//			((Point3D)p2).getZ();
//		}
		
		Point[] tabPoints = {p1,p2,p3,p4};
		
		System.out.println("liste points " + Arrays.toString(tabPoints));
		
		
		List<Point> listePoints = new ArrayList<Point>(30);
		
		listePoints.add(p1);
		listePoints.add(p2);
		listePoints.add(p3);
		listePoints.add(0, p4);

		
		
		for (Point point : listePoints) {
			
			if(point instanceof Point3D) ( (Point3D) point).deplacer(1.0, 1.0, 1.0);
			System.out.println(point.toString());
			
		}
		System.out.println("--- fin démo ---");
		
		Figure fig1 = new Carre(p1, 4.0); 
		Figure fig2 = new Carre(p2, 4.0);
		Figure fig3 = new Cercle(p2, 6.0);
		
		Figure[] listeFigures = {fig1,fig2,fig3};
		
		System.out.println("--- Périmètres des figures ---");
		for (Figure figure : listeFigures) {
			System.out.println(figure.perimetre());
		}
		
		
		
		
		
		
		
		Point p5 = (Point)p1.dupliquer();
		
		System.out.println(p1);
//		System.out.println(p5);
		
		p1.deplacer(3.0, 2.0);
		
		System.out.println(p1);
		System.out.println(p4);
		System.out.println(p5);
		
		
		Segment s1 = new Segment(p1, p3);
		Segment s2 = new Segment(p1, p2);
		Segment s3 = new Segment(p2, p3);
		
		List<Segment> segments = new ArrayList<Segment>();
		segments.add(s1);
		segments.add(s2);
		segments.add(s3);
		segments.add(s1);
		segments.add(s2);
		segments.add(s3);
		
		for (Segment segment : segments) {
			System.out.println(segment);
		}
		
		System.out.println("-- tri des ségments par longueur --");

//		Comparator<Segment> comparateurSegment = new SegmentComparator();
//		Collections.sort(segments, comparateurSegment);
//		Collections.sort(segments, Segment.LONGUEUR_COMPARATOR);
		Collections.sort(segments, (l1, l2) -> (int)(l1.longueur() - l2.longueur()) );
		
		for (Segment segment : segments) {
			System.out.println(segment);
		}
		
		// Design Pattern Builder
		Carre carre1 = new CarreBuilder()
				.fromSegment(s1)
				.build();
		
		System.out.println(s1);
		System.out.println(carre1);
		
		
		
	}
	


}
