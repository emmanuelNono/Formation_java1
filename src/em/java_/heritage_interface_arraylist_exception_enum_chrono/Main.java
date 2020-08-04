package em.java_.heritage_interface_arraylist_exception_enum_chrono;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;

//----ici on traite :  Interfaces, HashMaps, Enumerations, chronometre, Exceptions, ---
public class Main {
	public static void main(String[] args) {
		//------------------------------  Les chronometres  --------------------------
		Timer chrono = new Timer();
		chrono.schedule(new CustomTimer(), 3000, 1000);// le 1er affichage aps 3 sec, ensuite ttes les 1 sec
		
	}
}
/*
		
		//------------------------------      Exceptions        --------------------------
		
		int[] numbers = {4,7,5,9};
		int calcul = 5+2;
		
		try {
			System.out.println(numbers[5]);			// si erreur on affiche la 1ere exception
			calcul /= 0;			// si erreur on affiche la 2nd exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("l'erreur est ici...");
		}catch (ArithmeticException e) {
			System.out.println("erreur de calcul. Division par 0");
		}
		
		//-------------------------------           Exception sur les meth       --------
		double balance0 = 5000;
		double price0 = 300;
		
		try {
			buy_0(balance0, price0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//-----------------------------         notre propre Class Exception       --------
		double balance1 = 5000;
		double price1 = 5300;
		try {
			buy_1(balance1, price1);
		} catch (NoMoneyException e) {
			//System.out.println("erreur de paiement");				
			e.printStackTrace();
		}
		

	}

	private static void buy_1(double balance1, double price1) throws NoMoneyException {	
		// si on ajoute une exception a l'entete d'une meth, alos on ajoute le try catch a la déclaration de la meth
			double b = balance1 - price1;
			if(b<0) {
				throw new NoMoneyException();
			}
			System.out.println(b);
	}

	private static void buy_0(double balance, double price) throws Exception {
		// si on ajoute une exception a l'entete d'une meth, alos on ajoute le try catch a la déclaration de la meth
		double b = balance - price;
		if(b<0) {
			throw new Exception();
		}
		System.out.println(b);
		
		*/

		/*
	}
		//---------------------          HashMaps : comme les ArrayList mais avec [key, Value]          -----------------------

		Map<String, Integer> ages = new HashMap<>();
		ages.put("Graven", 18);
		ages.put("Michel", 55);
		ages.put("Bob", 27);
		ages.put("Tager", 422);
		
		System.out.println(ages.toString() + " avec aux total " + ages.size() + " elements");			// 4 elts
		System.out.println(ages.get("Michel"));			//55
		
		ages.remove("Bob");
		
		System.out.println(ages.toString() + " avec aux total " + ages.size() + " elements");			// 4 elts
		System.out.println(ages.get("Michel"));			//55
		
		if(ages.containsKey("Michel")) {			//on verifie que une key existe
			System.out.println("la clef existe");
		}else {
			System.out.println("la clef n'existe pas du tout");
		}
		
		if(ages.containsValue(26)) {			//on verifie que une value existe
			System.out.println("la clef existe");
		}else {
			System.out.println("la clef n'existe pas du tout");
		}
		
		for(Entry<String, Integer> elts : ages.entrySet()) {
			System.out.println("La clé est : " + elts.getKey() + ", Son age est : " + elts.getValue());
		}
		
		int moy = 0;
		for(Entry<String, Integer> elts : ages.entrySet()) {
			moy += elts.getValue();
		}
		System.out.println("La moyenne est " + (moy / ages.size()));
		*/
		

/*
		//----------------------------    ArrayList     -----------------------------------
		ArrayList<String> list = new ArrayList<>();		//on fait la générecité en def un type generique dans ArrayList
		list.add("Bonjour");
		list.add("Tu es reveillé");
		list.add("8h");
		list.add("J'y vais");
		list.add("Vous nenez avec moi?");
		
		System.out.println(list.get(1));			// Tu es reveillé
		System.out.println(list);					// affiche la liste dans un tableau
		
		list.remove(1);
		System.out.println(list);
		System.out.println("---------------------------------------------");
		
		if(list.contains("Vous nenez avec moi?")) {
			System.out.println("l'elt apparait a une position ");
		}
		
		if (list.size() > 0) {			//verifie la taille de la liste
			list.set(2, "Football");	// remplace le l'elt a l'index 1
			System.out.println(list.get(1));
		}else {
			System.out.println("la liste est vide");
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("---------------------------------------------");
		
		list.clear();			//vide la liste
		System.out.println(list);
		
		if (list.size() > 0) {
			System.out.println(list.get(1));
		}else {
			System.out.println("la liste est vide");
		}
		
*/
		
		
	//------------------------           heritage et interface       ----------------------------------
	
/*
	public static void main(String[] args) {
	
		Apple apple = new Apple("Pomme de france");
        apple.taste();
        System.out.println("la pomme contient des pepins :" + apple.hasSeed());
        System.out.println("la taille de la pomme est " + apple.getSize());
        if (!(apple instanceof PeelFruit)) {
            System.out.println("ce fruit n'implemente pas l'interface PeelFruit");
        }
        System.out.println("---------------------------------------------");

        PineApple pineApple = new PineApple();
        pineApple.taste();
        System.out.println("la taille de l'ananas est " + pineApple.getSize());
        System.out.println("l'anans contient des pepins :" + pineApple.hasSeed());
        pineApple.miam();
        System.out.println("on peut epulcher l'ananas :" + pineApple.isPeeled());
        if (!(pineApple instanceof PeelFruit)) {
            System.out.println("ce fruit n'implemente pas l'interface PeelFruit");
        }else {
        	System.out.println("ce fruit implemente bien l'interface PeelFruit");
        	PeelFruit fruit = pineApple;
        	// transforme la class Apple en un objet interface de Fruit. on a acces au meth de l'interface
        	System.out.println("ananas transformé en interface fruit. comme " + fruit.getSkinType());
        }
      
        System.out.println();
        System.out.println("---------------------------------------------");

        Strawberry sberry = new Strawberry();
        sberry.taste();
        System.out.println("---------------------------------------------");

        Kiwi kiwi = new Kiwi();
        kiwi.taste();
        System.out.println("---------------- ENUM -----------------------------");
        
        Day moment = Day.MATIN;
        System.out.println(moment.name( ));
        
        moment = Day.MIDI;
        System.out.println("Nous sommes " + moment.name().toLowerCase() + " et il est " + moment.getHour() +"h donc " + moment.getMsg() );
        System.out.println("---------------- Afficher tout les ENUM -----------------------------");
        
        for(Day instant_T : Day.values()) {
        	if (!instant_T.equals(Day.MIDI)) {// affiche tt sauf MIDI
        		System.out.println("Nous sommes " + instant_T.name().toLowerCase() + ". Il est " + instant_T.getHour() +"h, donc " + instant_T.getMsg() );
        	}
        }

	}
*/
