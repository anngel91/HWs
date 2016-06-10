package hw2;

import java.util.Scanner;

public class zad22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = 0;
		while (a < 1 || a > 999) {
			a = sc.nextInt();
		}
		int counter = 1;
		for (int i = a;; i++) {
			if (counter > 10) {
				break;
			}
			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				System.out.println(counter + ":" + i);
				counter++;
			}
		}
		sc.close();
	}

}
