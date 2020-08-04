package em.java_.collection_ville_multi_exception;

public class Capital extends Ville {
	
	private String _monument;
	
	public Capital() {
		super();
		_monument = "aucun";
	}
	
	public Capital(String pNom, int pNbre, String pPays, String monument ) throws NombreHabitantException, NomVilleException {
		super(pNom, pNbre, pPays);
		_monument = monument;
	}

	public String getMonument() {
		return _monument;
	}

	public void setMonument(String _monument) {
		this._monument = _monument;
	}

	@Override
	public String toString() {
		
		String str = super.toString() + " ==> avec " + this._monument + " comme monument";		
		return str;
	}

}
