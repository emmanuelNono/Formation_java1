package em.java_.polymorphisme_jc;

public class Moto extends Vehicule implements Flyable {
	
	public Moto() {
		System.out.println("Je suis un 2 roues.....");
	}

	@Override
	public void fly(String energy) {
		System.out.println("je suis à 250km/h sur ma moto et en casque grace au " + energy);
	}

	@Override
	public void light(String energy) {
		 System.out.println("je m'illumine grace au " + energy);
	}

	@Override
	public void moveXY(int x, int y) {
		System.out.println("Ma moto est en position " + x + " ; " + y);
	}
	

}
