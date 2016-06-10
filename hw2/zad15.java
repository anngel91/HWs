package hw2;

import java.util.Scanner;

public class zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = 0;
		int i = 0;
		while (n <= 0) {
			n = sc.nextInt();
		}
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= n);
		System.out.println("Sum is: " + sum);
		sc.close();
	}

}
