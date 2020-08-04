package em.java_.collection_ville_multi_exception;

public class App {
	
	/*
	 
	 //---------------------   la valeur de nbre Affiche 100 a la fin   --------------------------
		int i = 0, nbre = 0;
		while(i <= 9)
		 {
		     for (int j = 0; j < 10; j++)
		        nbre++;
		    	 
		     i++;
		}
		System.out.println(nbre);
		
		//-------------------   Affiche ts les elet du tableau    ---------------------------------
		String tab[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};
		 
		for(String str[] : tab)
		{
		 	for(String str2 : str)
		 	{
		     	System.out.println("La valeur est  = " + str2);
		 	}
		}
	*/

	public static void main(String[] args) {
		
		Ville v = new Ville();
		
		Ville v1 = null;
		try {
			v1 = new Ville("Marseille", -123456, "France");
		} catch (NombreHabitantException e1) {
			e1.printStackTrace();
		} catch (NomVilleException e2) {
			System.out.println(e2.getMessage());
		} finally {
		    if(v == null)
		        v = new Ville();
		}/*
		
		Ville v2 = null;
		try {
			v2 = new Ville("Rio", -321654, "Brésil");
		} catch (NombreHabitantException e1) {
			e1.printStackTrace();
		} catch (NomVilleException e2) {
			System.out.println(e2.getMessage());
		} finally{
		    if(v == null)
		        v = new Ville();
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("\n v = "+v.getNomVille()+" ville de  "+v.getNbreHabitants()+ " habitants se situant en "+v.getNomPays());
		System.out.println(" v1 = "+v1.getNomVille()+" ville de  "+v1.getNbreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNomVille()+" ville de  "+v2.getNbreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		
		System.out.println("----------------------------------------------------------------");
		System.out.println(v1.toString());
		System.out.println(v1.comparerVille(v2));
		
		System.out.println("----------------------------------------------------------------");
		
		Capital c = null;
		try {
			c = new Capital("Paris", 654987, "France", "la tour Eiffel");
		} catch (NombreHabitantException e1) {
			e1.printStackTrace();
		}catch (NomVilleException e2) {
			System.out.println(e2.getMessage());
		}
		System.out.println(c.toString() + "\n");
		
		System.out.println("--------------------------  tableau de ville  --------------------------------------");
		Ville[] tableau = new Ville[6];				//Définition d'un tableau de villes null
		        
		//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
		String[] tabVille = {"Marseille", "lille", "caen", "paris", "New York", "Berlin"};
		int[] tabHab = {123456, 78456, 987, 75832165, 3505594, 50954138};
		String[] tabMonument = {"aucun", "aucun", "aucun", "Tour Eiffel",  "Statue de la Liberte", "Porte de Brandebourg" };
		         
		//Les trois premiers éléments du tableau seront des villes, et le reste, des capitales
		for(int i = 0; i < tabVille.length; i++){
		  if (i < 3){
			  
		    Ville V = null;
			try {
				V = new Ville(tabVille[i], tabHab[i], "france");
			} catch (NombreHabitantException e1) {
				e1.printStackTrace();
			}catch (NomVilleException e2) {
				System.out.println(e2.getMessage());
			}
		    tableau[i] = V;
		  } else {
			  
		    Capital C = null;
			try {
				C = new Capital(tabVille[i], tabHab[i], "france", tabMonument[i]);
			} catch (NombreHabitantException e1) {
				e1.printStackTrace();
			} catch (NomVilleException e2) {
				System.out.println(e2.getMessage());
			}
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){				// qlq soit le type d'objet, on affiche sa meth toString
		  System.out.println(obj.toString()+"\n");
		}
		
		int h = 0;				//	on additionne les habitants des ville qui sont des capitales
		for (Ville V : tableau) {
			if(V instanceof Capital) {
				h = h + V.getNbreHabitants();
			}
		}
		System.out.println("le nombre d'habitatns total de toutes les capitales est de " + h);
	*/}

}
