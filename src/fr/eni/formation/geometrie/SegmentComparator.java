package fr.eni.formation.geometrie;

import java.util.Comparator;

public class SegmentComparator implements Comparator<Segment> {

	@Override
	public int compare(Segment o1, Segment o2) {
		double diff = o2.longueur() - o1.longueur();
		if(diff < 0.0) return -1;
		if(diff > 0.0) return 1;
		return 0;
	}

}
