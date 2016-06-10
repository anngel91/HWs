package hw1zad16;

import java.util.Scanner;

public class zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a 3 digit number: ");
		int a = sc.nextInt();
		if ((a < 100) && (a > 999)) {
			System.out.println("Number not with 3 digits.");

		}

		int q = a % 10;
		int w = ((a % 100) / 10);
		int e = a / 100;

		if ((q == w) && (w == e)) {
			System.out.println("Digits are equal.");
		} else if ((q > w) && (w > e)) {
			System.out.println("Digits are ascending.");
		} else if ((q < w) && (w < e)) {
			System.out.println("Digits are descending.");
		} else {
			System.out.println("No particular order.");
		}
	}

}
