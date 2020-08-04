package em.java_.polymorphisme_jc;

public class Cottage extends Building implements Flyable {
	
	public Cottage() {
		System.out.println("Le cottage a une parcelle en bois");
	}

	@Override
	public void fly(String energy) {
		System.out.println("Le cottage se deplace grace au " + energy);

	}

	@Override
	public void light(String energy) {
		System.out.println("Le cottage est illumine grace au " + energy);

	}

	@Override
	public void build(String materiel) {
		System.out.println("construit avec du " + materiel);

	}

}
