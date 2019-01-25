/**
 * 
 */
package fr.eni.formation.geometrie;

/**
 * @author Nicolas
 *
 */
public class Hexagone extends Figure {
	
	public Point centre;
	public double cote;

	/**
	 * @see fr.eni.formation.geometrie.Figure#aire()
	 */
	@Override
	public double aire() {
		return 0;
	}

	/**
	 * @see fr.eni.formation.geometrie.Figure#perimetre()
	 */
	@Override
	public double perimetre() {
		return 6 * cote;
	}

}
