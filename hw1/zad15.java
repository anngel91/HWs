package hw1zad15;

import java.util.Scanner;

public class zad15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number: ");
		int number = sc.nextInt();
		if (number < 0 && number > 24) {
			System.out.println("Invalid number.");
		}
		if (number >= 4 && number < 9) {
			System.out.println("Good morning!");
		}
		if (number >= 9 && number < 18) {
			System.out.println("Goof afternoon!");
		}
		if ((number >= 18 && number <= 24) || (number >= 0 && number < 4)) {
			System.out.println("Good evening!");
		}
	}
}
