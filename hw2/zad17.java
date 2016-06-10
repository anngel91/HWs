package hw2;

import java.util.Scanner;

public class zad17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How big is the side? ");
		int b = sc.nextInt();
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);

		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == b)
					System.out.print("*");
				else if (j == 1 || j == b)
					System.out.print("*");
				else {
					System.out.print(c);
				}
			}
			System.out.println();
		}
		sc.close();

	}
}
