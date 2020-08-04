package em.java_.salaires;

public class TechnARisque extends Technicien implements PrimeARisque {

	public TechnARisque(String nom, String prenom, int age, String dateBegin, int unites) {
		super(nom, prenom, age, dateBegin, unites);
	}
	
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + prime;
	}
	
	

}
