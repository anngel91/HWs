package hw2;

import java.util.Scanner;

public class zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A: ");
		int a = sc.nextInt();
		System.out.println("Type B: ");
		int b = sc.nextInt();
		int sum = 0;

		if (a > b) {
			System.out.println("A must be less than B");
			sc.close();
			return;
		}

		while (a < b) {
			
			a++;
			if (a % 3 == 0) {
				System.out.print("skip 3" + ",");
				continue;
			}
			System.out.print((a * a) + ",");
			sum += a;
			if (sum >= 200) {
				break;
			}

		}
		sc.close();

	}
}
