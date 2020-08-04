package em.java_.rectangle;

import java.util.Scanner;

public class Rectangle {
	private static Scanner scanner = new Scanner(System.in);
	 /**
	  * La String pass�e en param�tre et qui prendra
	  * pour valeur effective "largeur" ou "hauteur", permet
	  * d'afficher un message plus explicite lorsque l'on demande
	  * � l'utilisateur d'entrer ses donn�es.
	  * @return un double lu depuis le clavier
	  */
	 public double lireDonnee (String text) {
	 System.out.print("Entrez la " + text + ": ");
	 return (scanner.nextDouble());
	 }
	 
	 /**
	  * Permet de calculer un perim�tre ou une surface selon le souhait 
	  * de l'utilisateur.
	  * Cette m�thode prend pour arguments la hauteur et la largeur
	  * du rectangle n�cessaires au calcul. Notez qu'il n'est absolument pas
	  * n�cessaire que les param�tres de la m�thode aient le m�me nom que
	  * les variables pass�es en param�tre effectifs dans la m�thode main
	  * @param l longeur du rectangle
	  * @param h hauteur du rectangle
	  */
	 public void calculer(double l, double h) {
		 System.out.print("Surface ('s/S') ou perim�tre ('p/P')? ");
		 char typeCalcul = scanner.next().charAt(0);
		 switch (typeCalcul ){
			 case 's':
			 case 'S': {
				 double surface = l * h;
				 System.out.println("La surface est " + surface);
				 break;
			 }
			 case 'p':
			 case 'P': {
				 double perimetre = 2 * (l + h);
				 System.out.println("Le perimetre est est " + perimetre);
				 break;
			 }
			 default: {
				 System.out.println ("Introduire un 'p' ou un 's' s.v.p");
			 }
		 }
	 }
	 
	 /**
	  * M�thode pour tester les donn�es fournies par l'utilisateur
	  * @return true si les donn�es sont toutes deux strictement positives
	  */
	 public boolean testerDonnees(double largeur, double hauteur) {
	 return ((largeur > 0) && (hauteur > 0));
	 }
	 
	 /**
	  * Affiche simplement un message d'erreur � l'�cran.
	  **/
	 public void afficherErreur () {
	 System.out.println("Erreur: vous avez introduit une largeur " +
	 "ou une hauteur n�gative!");
	 }
	 
}
