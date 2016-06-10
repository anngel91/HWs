package hw2;

import java.util.Scanner;

public class zad24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number (10-30000)");
		int n = 0;
		while (n < 10 || n > 30000) {
			n = sc.nextInt();
		}
		int i = 0;
		int b = n;
		do {
			i = ((i * 10) + (n % 10));
			n = n / 10;

		} while (n > 0);

		if (i == b) {
			System.out.println("Number is a palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		sc.close();
	}

}
