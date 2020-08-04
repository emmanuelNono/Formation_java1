package em.java_.collection_ville_multi_exception;

import java.util.Objects;

public class Ville {
	
	public static int nbreInstances = 0;
	protected String _nomVille;			//Stocke le nom de notre ville  
	protected String _nomPays;			//Stocke le nom du pays de notre ville
	protected int _nbreHabitants;		//Stocke le nombre d'habitants de notre ville
	protected char _categorie;
	  
	  //Constructeur par défaut
	public Ville(){
	    System.out.println("Création d'une ville !");          
	    _nomVille = "Inconnu";
	    _nomPays = "Inconnu";
	    _nbreHabitants = 0;
	    this.setCategorie();
	}
	
	//Constructeur Ville avec paramètres(« p » en lere lettre des param peut être un bon moyen de les repérer)
	
	public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException, NomVilleException {
		if(pNbre < 0) {
			throw new NombreHabitantException(pNbre);
		}
		if (pNom.length() < 3) {
			throw new NomVilleException("La ville doit avoir plus de 3 xre. vous avez saisi: " + pNom);
		}else
		{
			System.out.println("Création d'une ville avec des paramètres !");
		    _nomVille = pNom;
		    _nomPays = pPays;
		    _nbreHabitants = pNbre;
		    this.setCategorie();
		}
	}
	
	
	private void setCategorie() {
		  int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		  char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	
		  int i = 0;
		  while (i < bornesSuperieures.length && this._nbreHabitants > bornesSuperieures[i])
			  i++;
	
		  this._categorie = categories[i];
	}
	
	public String comparerVille(Ville v) {
		String str = new String();
		
		if(this.getNbreHabitants() == v.getNbreHabitants()) {
			str = "\t" + this.getNomVille() + " et " + v.getNomVille() + " ont les memes nombre d'habitants";
		}else {
			if(this.getNbreHabitants() > v.getNbreHabitants()) {
				str =  "\t" + this.getNomVille() + " est plus peuplé que " + v.getNomVille();
			}else {
				str =  "\t" + v.getNomVille() + " est plus peuplé que " + this.getNomVille();
			}
		}
		return str;
	}

	@Override
	public String toString() {
		return "\t" + this._nomVille + " est une ville de " + this._nomPays + " et elle a " + this._nbreHabitants + " habitants "
				+ ". Elle est de categorie => " + this._categorie;
	}
	
	
	
	@Override
	public int hashCode() {			//utilisé par certains objets (exp les collections) afin de classer les objets entre eux.
		 return Objects.hash(_categorie, _nbreHabitants, _nomPays, _nomVille);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (getClass() != obj.getClass())
			return false;
		
		Ville other = (Ville) obj;
		return Objects.equals(other.getCategorie(), this.getCategorie()) &&
				Objects.equals(other.getNbreHabitants(), this.getNbreHabitants()) &&
				Objects.equals(other._nomVille, this.getNomVille()) &&
				Objects.equals(other.getNomPays(), this.getNomPays());
	}

	public String getNomVille() {
		return _nomVille;
	}

	public void setNomVille(String pnomVille) {
		this._nomVille = pnomVille;
	}

	public String getNomPays() {
		return _nomPays;
	}

	public void setNomPays(String pnomPays) {
		this._nomPays = pnomPays;
	}

	public int getNbreHabitants() {
		return _nbreHabitants;
	}

	public void setNbreHabitants(int pnbreHabitants) {
		this._nbreHabitants = pnbreHabitants;
	}

	public char getCategorie() {
		return _categorie;
	}

	public void setCategorie(char _categorie) {
		this._categorie = _categorie;
	}
	
	
	  
}
