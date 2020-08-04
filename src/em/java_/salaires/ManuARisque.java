package em.java_.salaires;

public class ManuARisque extends Manutention implements PrimeARisque {

	public ManuARisque(String nom, String prenom, int age, String dateBegin, int nbreHeures ) {
		super(nom, prenom, age, dateBegin, nbreHeures);
	}
	
	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + prime;
	}
	
}
