package fr.eni.formation.geometrie;

public class CarreBuilder {
	
	private Carre carre = null;

	public CarreBuilder() {
		carre = new Carre();
	}
	
	public CarreBuilder setOrigine(double x, double y) {
		carre.setOrigine(new Point(x,y));
		return this;
	}
	
	public CarreBuilder setCote(double cote) {
		carre.setCote(cote);
		return this;
	}
	
	public CarreBuilder fromSegment(Segment segment) {
		carre.setOrigine(segment.origine);
		carre.setCote(segment.longueur());
		return this;
	}
	
	public CarreBuilder fromCSV(String csv) {
//		...
		return this;
	}
	
	public Carre build() {
		return carre;
	}
	

}
