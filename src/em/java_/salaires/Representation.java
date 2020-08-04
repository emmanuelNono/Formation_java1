package em.java_.salaires;

public class Representation extends Commercial {
	private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 800;

	public Representation(String nom, String prenom, int age, String dateBegin, double ca) {
		super(nom, prenom, age, dateBegin, ca);
	}

	@Override
	public double calculerSalaire() {
		return  (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
	}
	
	
	public String getTitre() {
		return "Le representant";
	}

}
