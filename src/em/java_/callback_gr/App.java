package em.java_.callback_gr;

public class App {

	public static void main(String[] args) {
		System.out.println("-------------------------  soustraction avec callBack  ---------------------------------");
		soustraction(30, 39, new CalculListener() {		// we create anonymos function like parameter in function soustraction
			
			@Override
			public void onPositiveResult() {
				System.out.println("La reponse est +");
				
			}
			
			@Override
			public void onNegativeResult() {
				System.out.println("la reponse est -");
				
			}
		});
		
		System.out.println("-------------------------  timer avec callBack  ---------------------------------");
		
		CustomTime ctimer = new CustomTime();
		ctimer.start(new TimerListener() {
			
			@Override
			public void onStart() {
				System.out.println("Lancement du chrono !");
				
			}
			
			@Override
			public void onRun() {
				System.out.println("Loading.....");
				
			}
			
			@Override
			public void onFinish() {
				System.out.println("is finish !");
				
			}
		});
		
		
	}

	private static void soustraction(int i, int j, CalculListener Listener ) {
		int result = i - j;
		System.out.println("Le resultat de la soustraction est " + result);
		
		if (result < 0) {
			System.out.println("le resultat est négatif");
			Listener.onNegativeResult();		// call the anonymos function that is appropriate
		}else {
			System.out.println("le resultat est positif");
			Listener.onPositiveResult();
		}
	}

}
