package em.java_.salaires;

public class Vente extends Commercial {
	private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 400;

	public Vente(String nom, String prenom, int age, String dateBegin, double ca) {
		super(nom, prenom, age, dateBegin, ca);
	}

	@Override
	public double calculerSalaire() {
		return (POURCENT_VENDEUR * super.getChiffreAffaire()) + BONUS_VENDEUR;
		
	}
	
	public String getTitre() {
		return "Le vendeur";
	}

}
