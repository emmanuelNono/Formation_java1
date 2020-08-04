package em.java_.polymorphisme_gr;

public class Player {
	private String name;
	private double health;

	public Player(String name, double health) {
		this.name = name;
		this.health=health;
	}
	
	public Player(String name) {	//default Ctor with name. call the first Ctor above.
		this(name, 500);		// This make reference to : Player(String name, double health)
	}	

	public String getName() {
		return name;
	}

	public void sendMsg() {
		sendMsg("Vous etes " + this.name + " et avez " + this.health + " de vie");
	}
	
	public void sendMsg(String message) {
		System.out.println(this.name + " : " + message );
	}

	public double getHealth() {
		return health;
	}
}
