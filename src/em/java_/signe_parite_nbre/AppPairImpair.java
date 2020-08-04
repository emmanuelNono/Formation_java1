package em.java_.signe_parite_nbre;

import java.util.Scanner;

public class AppPairImpair {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Entrer un nombre entier : ");
		int nber = s.nextInt();
		if (nber == 0) {
			System.out.println("Le nombre est zero et il est pair");
		}
		else {
			if(nber < 0) {
				System.out.print("Le nombre est negatif ");
				if(nber%2 == 0) {
					System.out.println("et pair");
				}else {
					System.out.println("et impair");
				}
			}else {
				System.out.print("Le nombre est positif ");
				if(nber%2 == 0) {
					System.out.println("et pair");
				}else {
					System.out.println("et impair");
				}
			}
		}
		s.close();
	}
}
