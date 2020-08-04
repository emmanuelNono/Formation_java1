package em.java_.collection_ustensile;

public abstract class Ustensile {
	
	private int _yearCreated;
	
	public Ustensile(int yearCreated) {
		this._yearCreated = yearCreated;
	}
	
	public double calculerValeur(int currentYear) {
		int age = (currentYear - getYearCreated());
		double valeur = 0;
		if (age  > 50) {
			valeur = age - 50;
		}
		
		return valeur;
	}
	
	public int getYearCreated() {
		return _yearCreated;
	}
	
	

}
