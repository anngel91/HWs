package hw2;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type n: ");
		int n = sc.nextInt();
		if (n>4) {
			System.out.println("n must be <= 4");
			sc.close();
			return;
		}
		int k = 1; // umnojenie
		int q = 0; // sbor
		int w = n - 1;
		if (n < 1) {
			System.exit(0);
		}
		for (int j = 0; j < n; j++) {
			q += k;
			k *= 10;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(q * w);
			w += 2;
		}
		sc.close();

	}


}
