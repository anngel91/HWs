package hw2;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number");
		int num = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		sc.close();
	}

}
