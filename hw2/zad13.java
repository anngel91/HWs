package hw2;

import java.util.Scanner;

public class zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int sum = 0;
		while (sum < 2 || sum > 27) {
			sum = sc.nextInt();
		}
		for (int i = 100; i < 1000; i++) {
			if ((i % 10 + i / 100 + (i % 100) / 10) == sum) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
