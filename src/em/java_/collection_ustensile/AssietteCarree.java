package em.java_.collection_ustensile;

public class AssietteCarree extends Assiette {
	
	private double _cote;

	public AssietteCarree(int yearCreated, double cote) {
		super(yearCreated);
		this._cote=cote;
	}
	
	public double getCote() {
        return _cote;
    }

	@Override
	public double calculAire() {
		return getCote() * getCote();
	}
	
	public double calculerValeur(int anneeActuelle) {
        double valeur = 5 * super.calculerValeur(anneeActuelle);
        return valeur;
	}

}
