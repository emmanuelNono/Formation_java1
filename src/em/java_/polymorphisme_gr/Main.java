package em.java_.polymorphisme_gr;

public class Main {

	public static void main(String[] args) {
		Player player = new Player("Graven", 150);
		
		System.out.println("player est : " + player.getName() + " avec " + player.getHealth() + " de vie");
		player.sendMsg();
	}
}
