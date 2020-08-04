package em.java_.salaires;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		System.out.println("------------------- Tableau de Employe  ------------------------------");
		Personnel p = new Personnel();
		p.ajouterEmploye(new Vente("Pierre", "Business", 45, "1995", 30000));
		p.ajouterEmploye(new Representation("Léon", "Vendtout", 25, "2001", 20000));
		p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
		p.ajouterEmploye(new Manutention("Jeanne", "Stocketout", 32, "1998", 45));
		p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
		p.ajouterEmploye(new ManuARisque("Al", "Abordage", 30, "2001", 45));

		p.afficherSalaires();

		System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");

		System.out.println("------------------- ArrayList de Employe ------------------------------");
		System.out.println("\n");
		ArrayList<Employe> p2 = new ArrayList<>();
		p2.add(new Vente("Pierre", "Business", 45, "1995", 30000));
		p2.add(new Representation("Léon", "Vendtout", 25, "2001", 20000));
		p2.add(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
		p2.add(new Manutention("Jeanne", "Stocketout", 32, "1998", 45));
		p2.add(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
		p2.add(new ManuARisque("Al", "Abordage", 30, "2001", 45));

		System.out.println("nbre de pers est de : " + p2.size());

		for (Employe emp : p2) {
			System.out.println(emp.getNom() + " gagne " + emp.calculerSalaire() + " Frs par mois");
		}

		double sal = 0;
		for (int i = 0; i < p2.size(); i++) {
			sal += p2.get(i).calculerSalaire();
		}
		System.out.println("Le salaire moyen dans l'entreprise est de " + (sal / p2.size()) + " Frs.");

		System.out.println("------------------- ArrayList Trier des Employe ------------------------------");
		System.out.println("\n");

		Collections.sort(p2, new Comparator<Employe>() {
			public int compare(Employe e1, Employe e2) { // pr trier ds l'ordre decroissant, on inverse e1 et e2
				return Integer.valueOf(e1.getNom().compareTo(e2.getNom()));
			}
		});

		for (int i = 0; i < p2.size(); i++) {
			System.out.println(p2.get(i).getTitre() + " " + p2.get(i).getNom() + " gagne " + p2.get(i).calculerSalaire()
					+ " Frs par mois");
		}

		System.out.println("------------------- rechrche nom dans un ArrayList des Employe ------------------------------");
		System.out.println("\n");

		for (int i = 0; i < p2.size(); i++) {
			if (p2.get(i).getNom().equals("Flippe Jean")) {
				System.out.println("oui il est present a la " + (i+1) + " position");
			}

		}
		int x = 11, y = 22;
        System.out.println("1. x = " + x); 

	}

}
