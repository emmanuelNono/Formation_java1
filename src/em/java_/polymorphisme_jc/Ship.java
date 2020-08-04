package em.java_.polymorphisme_jc;

public class Ship extends Vehicule implements Flyable {
	
	private String _name;
	private int _litreFuel;
	
	public Ship(String name, int litreFuel) {
		this._name = name;
		this._litreFuel = litreFuel;
		System.out.println("I am ship " + name);
	}
	
	public Ship() {
		this("Dolce-Vita", 200);
	}

	@Override
	public void moveXY(int x, int y) {
		System.out.println("Le navire brasse des flotsss et se deplace en " + x + " ; " + y);
	}

	@Override
	public void fly(String energy) {
		System.out.println("Le bateau se déplace grace au " + energy);
	}

	@Override
	public void light(String energy) {
		System.out.println("Le bateau eclaire par intermitence par " + energy);
	}

	@Override
	public String toString() {
		return "Ship [toString()=" + getNameShip() + "]" + "Ship carburant = " + getliterFuel();
	}

	public String getNameShip() {
		return this._name;
	}
	
	public int getliterFuel() {
		return this._litreFuel;
	}
	

}
