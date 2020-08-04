package em.java_.salaires;

public class Technicien extends Employe {
	private final static double FACTEUR_UNITE = 5.0;
    private int _unites;

	public Technicien(String nom, String prenom, int age, String dateBegin, int unites) {
		super(nom, prenom, age, dateBegin);
		this._unites=unites;
	}

	@Override
	public double calculerSalaire() {
		return FACTEUR_UNITE * this._unites;
	}
	
	public String getTitre() {
		return "Le technicien";
	}

}
