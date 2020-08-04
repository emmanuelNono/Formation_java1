package em.java_.collection_ustensile;

public class AssietteRonde extends Assiette {
	
	private double _rayon;

	public AssietteRonde(int yearCreated, double rayon) {
		super(yearCreated);
		this._rayon=rayon;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculAire() {
		return getRayon() * getRayon() * 3.14;	
	}
	
	public double getRayon() {
		return _rayon;
	}

}
