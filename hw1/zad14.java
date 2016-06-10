package hw1zad14;

import java.util.Scanner;

public class zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type position 1");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Type position 2");
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((a < 1) && (a > 8) && (b < 1) && (b > 8) && (c < 1) && (c > 8) && (d < 1) && (d > 8)) {
			System.out.println("Invalid coordinates.");
		}

		int q = a & 2;
		int w = b % 2;
		int e = c % 2;
		int r = d % 2;

		if (((q != 0) || (w != 0)) && ((e != 0) || (r != 0))) {
			System.out.println("Positions have different colors.");
		} else {
			System.out.println("Positions have the same colors.");
		}

	}

}
