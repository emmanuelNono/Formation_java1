package em.java_.decoupage_tableau;
public class Tableau2D {
	
	public Tableau2D() {};
	
	
	public void tableau2D() {
		System.out.println("------------------ tab String --------------------------");

        String[] names = new String[] { "thierry", "thierry", "yvan", "Thierry", };
        if (names[0] == names[1]) {
            System.out.println("le meme nom");
        }
        if (names[0].equalsIgnoreCase(names[3])) {
            System.out.println("le nom s'ecrit de la mmeme facon");
        }
        if (names[0] == names[3]) {
            System.out.println("le nom est identique");
        } else {
            System.out.println("le nom n'est pas identique au premier");
        }

        System.out.println("---------------------------- tab 1D ------------------------");

        int[] nbres = new int[] { 12, 5, 20, 15, 2 };
        int calcul = (nbres[1] + nbres[2] + nbres[4]) / nbres.length;
        System.out.println("la moy des 3 nbres selectionnés est " + calcul);// chiffre apres virgule ne st pas affichés

        System.out.println("---------------------------- tab 2D ------------------------");

        int[][] nombres = { { 8, 9, 10 }, { 2, 3, 1 }, { 15, 7, 11 } };
        System.out.println("2eme ligne et 3eme col = " + nombres[1][2]);
        System.out.println("3eme ligne et 1eme col = " + nombres[2][0]);

        System.out.println("--------- decouper String en tableau ------------------------");

        String nomss = "thierry, Macron, yvan, Thierry, Sarko";
        String[] noms = nomss.split(", "); // Attention a l'espace apres la virgule
        System.out.println("le 2eme est " + noms[1]);

        for (String str : noms) {
            System.out.println(str);
        }

        System.out.println("--------- boucles ------------------------");
        int[] notes = { 10, 12, 5, 20, 15, 2 };
        double moy = 0;
        for (int note : notes) {
            moy += note;
        }
        System.out.println(("la moyenne est = " + (moy / notes.length)));
    }

}
