package em.java_.rectangle;

/* Exercice sur la page : 
 							https://www.cours-gratuit.com/java/exercice-java-modularisation-rectangle
*/

public class Main {

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		 double largeur = r.lireDonnee("largeur");
		 double hauteur = r.lireDonnee("hauteur");
		 
		 boolean donneesOk = r.testerDonnees(largeur,hauteur);
		 
		 if (donneesOk) {
		 r.calculer(largeur, hauteur);
		 } else {
		 r.afficherErreur();
		 }
		
	}

}
