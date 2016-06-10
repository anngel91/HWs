package hw2;

import java.util.Scanner;

public class zad25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = 0;
		int i = 1;
		while (n < 1) {
			n = sc.nextInt();
		}
		int factoriel = 1;
		do {
			factoriel *= i;
			i++;
		} while (i <= n);
		System.out.println(factoriel);
		sc.close();
	}

}
