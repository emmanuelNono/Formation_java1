package em.java_.salaires;

public class Manutention extends Employe {
	
	private final static double SALAIRE_HORAIRE = 65;
	private int _nbreHeures;
	
	public Manutention(String nom, String prenom, int age, String dateBegin, int nbreHeures) {
		super(nom, prenom, age, dateBegin);
		this._nbreHeures=nbreHeures;
	}

	@Override
	public double calculerSalaire() {
		return SALAIRE_HORAIRE * _nbreHeures;

	}
	
	public String getTitre() {
		 return "Le manut. " ;
	}
	
}
