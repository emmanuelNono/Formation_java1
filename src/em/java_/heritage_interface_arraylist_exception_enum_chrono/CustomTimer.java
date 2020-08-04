package em.java_.heritage_interface_arraylist_exception_enum_chrono;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	private int time = 3;
	@Override
	public void run() {
		System.out.println("hello.." + time); //Affiche "hello" a 11 reprise
		
		if (time == 4) {
			System.out.println("compte a rebours 4 secondes..");
		}
		
		if(time == 0) {		//Jeu de doigts: affiche un nombre entre 1 et 10
			double moy = 0;
			Random r = new Random();
			
			for(int i=0; i<3; i++) {
				int alea = r.nextInt(25);
				moy += alea;
				System.out.println(alea);
			}
			System.out.println("la moyenne = " + (moy / 3));
			
			cancel();
			
			/*
			//-------------------  le jeu de dé ou de doigts  -----------------------
			Random r = new Random();
			int alea = r.nextInt(10 - 1) + 1;			// pr avoir un nombre aleatoire entre 1 et 10
			System.out.println("le nombre de doigts affichés est de : " + alea);
			cancel();									// stopper si le time arrive a 0
			*/
		}
		time--;
	}

}
