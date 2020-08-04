package em.java_.polymorphisme_jc;

public class Glider extends Vehicule {

	@Override
	public void moveXY(int x, int y) {
		 System.out.println("Le planneur fend l'air vers (" + x + " ; " + y +" )");
	}

}
