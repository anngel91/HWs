package hw2;

import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			for (int t = a - 1; t > i; t--) {
				System.out.print(" ");

			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < a; i++) {
			for (int t = a - 1; t > i; t--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2 + 1); j++) {
				if (i > 0 && i < a - 1) {
					if (j > 1) {
						System.out.print(" ");
					}
					if (j == i * 2 || j == 1) {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		sc.close();

	}

}
