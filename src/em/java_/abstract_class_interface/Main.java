package em.java_.abstract_class_interface;

public class Main {

	public static void main(String[] args) {
		//Loup l = new Loup("Gris bleuté", 20);
		Chien c = new Chien("un bouledog", 36);
	    c.boire();
	    c.manger();
	    c.deplacement();
	    c.crier();
	    System.out.println(c.toString());
	    
	    System.out.println("-----------  Les méthodes de l'interface   ---------------------------");
	    c.faireCalin();
	    c.faireLeBeau();
	    c.faireLechouille();
	    
	    System.out.println("-----------------  Utilisons le polymorphisme de notre interface  ---------------------");
	    // Prendre habitude de mettre des comportemen ds des interfaces et non de les lier à une class spécifique
	    Rintintin r = new Chien();
	    r.faireLeBeau();
	    r.faireCalin();
	    r.faireLechouille();
	  }
}
