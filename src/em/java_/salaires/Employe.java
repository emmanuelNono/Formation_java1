package em.java_.salaires;

public abstract class Employe {

	private String _nom;
	private String _prenom;
	private int _age;
	private String _dateBegin;
	
	
	public Employe(String nom, String prenom, int age, String dateBegin) {
		this._nom=nom;
		this._prenom=prenom;
		this._age=age;
		this._dateBegin=dateBegin;
		
	}
	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return this._prenom + " " + this._nom ;
	}
	
	public String getTitre()
    {
        return "L'employé " ;
    }
}
