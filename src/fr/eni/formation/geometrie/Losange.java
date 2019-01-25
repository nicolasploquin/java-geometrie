package fr.eni.formation.geometrie;

public class Losange extends Figure {
	
	public Segment diagonale;
	public double largeur;

	/**
	 * @see fr.eni.formation.geometrie.Figure#aire()
	 */
	@Override
	public double aire() {
		return diagonale.longueur() * largeur / 2;
	}

	/**
	 * @see fr.eni.formation.geometrie.Figure#perimetre()
	 */
	@Override
	public double perimetre() {
		return 0;
	}

}
