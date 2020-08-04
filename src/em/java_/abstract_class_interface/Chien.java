package em.java_.abstract_class_interface;

public class Chien extends Canin implements Rintintin{

	public Chien(){

	}

	public Chien(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	}       

	@Override
	void crier() {
		System.out.println("J'aboie sans raison !");
	}

	@Override
	public void faireCalin() {
		System.out.println("Je te fais un GROS CÂLIN");
		
	}

	@Override
	public void faireLechouille() {
		System.out.println("Je te de grosse lechouilles");
	}

	@Override
	public void faireLeBeau() {
		System.out.println("Je te fais le beau");		
	}

}
