package em.java_.salaires;

public class Commercial extends Employe {
	
	public double _ca;

	public Commercial(String nom, String prenom, int age, String dateBegin, double ca) {
		super(nom, prenom, age, dateBegin);
		this._ca=ca;
	}
	
	public double getChiffreAffaire() {
		return this._ca;
	}

	@Override
	public double calculerSalaire() {
		return 0;
	}

}
