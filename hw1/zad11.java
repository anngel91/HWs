package hwzad11;

import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int number = sc.nextInt();

		int c = number / 100; // 100-ci
		int d = ((number % 100) / 10); // 10-ci
		int k = number % 10; // 1-ci

		if (number < 100 || number > 999) {
			System.out.println("Invalid number");
		}
		if (c == 0 || d == 0 || k == 0) {
			System.out.println("Number must not have 0.");
		}
		if (number % c == 0 && number % d == 0 && number % k == 0) {
			System.out.println("Number can be divided by each of its digits.");
		}
		else {
			System.out.println("Number can't be divided by each of its digits.");
		}
	}

}
