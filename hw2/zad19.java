package hw2;

import java.util.Scanner;

public class zad19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = 0;
		while (a < 10 || a > 99) {
			a = sc.nextInt();
		}
		while (a != 1) {
			if (a % 2 == 0) {
				a /= 2;
			} else {
				a = (a * 3) + 1;
			}
			System.out.print(a + " ");
		}
		sc.close();
	}

}
