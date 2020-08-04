package em.java_.polymorphisme_jc;

import java.util.ArrayList;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		Flyable[] flyTab = new Flyable[] {new Moto(), new Cottage(), new Ship()};
		
		System.out.println("---------------- fly  -----------------");
		for(Flyable f : flyTab) {
			f.fly("GPL");
		}
		
		System.out.println("--------------  light ----------------");
		for(Flyable f : flyTab) {
			f.light("Batteries");
		}
		
		System.out.println("-------------- Building ----------------");
		Building[] build = new Building[] {new Cottage()};
		for(Building b : build) {
			b.build("ceramique");
		}
		
		System.out.println("--------------- Vehicule ----------------");
		Vehicule[] veh = new Vehicule[] {new Glider(), new Ship("Bateau veh", 100), new Moto()};
		for (Vehicule v : veh) {
			v.moveXY(10, 88);
		}
		System.out.println("--------------- One ship ----------------");	
		Ship aqua = new Ship("lounge", 175);
		aqua.toString();
		
		System.out.println("--------------- Pile de ship ----------------");		
		Stack<Ship> stackShip = new Stack<>();
		
		stackShip.push(new Ship("Aquaman1", 200));
		stackShip.push(new Ship("Aquaman2", 75));
		
		System.out.println("la pile a " + stackShip.size() + " qui sont " + stackShip.get(1));
		
		System.out.println("--------------- Array de ship ----------------");		
		ArrayList<Ship> arrayShip = new ArrayList<>();
		
		arrayShip.add(new Ship("Aquaman1", 199));
		arrayShip.add(new Ship());
		
		System.out.println("la pile a " + arrayShip.size() + " qui sont " + arrayShip);
		
		System.out.println("--------------- Pile de Integer ----------------");
        Stack<Integer> STACK = new Stack<>(); 
  
        // Use add() method to add elements 
        STACK.push(13); 
        STACK.push(15); 
        STACK.push(30); 
        STACK.push(20); 
        STACK.push(5); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK); 
  
        // Removing elements using pop() method 
        System.out.println("Popped element: " +  
                                         STACK.pop()); 
        System.out.println("Popped element: " +  
                                         STACK.pop()); 
  
        // Displaying the Stack after pop operation 
        System.out.println("Stack after pop operation "
                                             + STACK); 
    } 

}
