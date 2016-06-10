package hw2;

import java.util.Scanner;

public class zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the number A you want to multiply (1 to 9)");
		int a = 0;
		while (a < 1 || a > 9) {
			a = sc.nextInt();
		}
		System.out.println("Type till which multiplier B you want to see the multiplication (1 to 9)");
		int b = 0;
		while (b < 1 || b > 9) {
			b = sc.nextInt();
		}
		int e;

		for (int i = 1; i <= b; i++) {
			e = a * i;
			System.out.println(i + "*" + a + "=" + e);
		}
		sc.close();
	}

}
