package hw2;

import java.util.Scanner;

public class zad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N (10~200): ");
		int n = 0;
		while (n < 10 || n > 200) {
			n = sc.nextInt();
		}
		for (int i = n; i >= 0; i--) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
