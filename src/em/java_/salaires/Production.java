package em.java_.salaires;

public class Production extends Employe {

	public Production(String nom, String prenom, int age, String dateBegin) {
		super(nom, prenom, age, dateBegin);
	}

	@Override
	public double calculerSalaire() {
		return 0;
	}
	
	public String getNom() {
		return this.getClass().getSimpleName() + " " + super.getNom();
	}
	
}
