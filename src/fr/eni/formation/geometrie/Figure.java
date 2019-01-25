/**
 * 
 */
package fr.eni.formation.geometrie;

import java.util.Comparator;

/**
 * @author NPloquin
 *
 */
public abstract class Figure {
	protected Couleur couleur;
	
	public static final Comparator<Figure> COMPARATOR = new Comparator<Figure>(){

		@Override
		public int compare(Figure fig1, Figure fig2) {
			return (int)(fig1.aire() - fig2.aire());
		}

	};

	public Figure() {
		
		this(Couleur.BLEU);
	}

	public Figure(Couleur couleur) {
		super();
		this.couleur = couleur;
	}
	
	public abstract double aire();
	public abstract double perimetre();

}
