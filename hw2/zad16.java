package hw2;

import java.util.Scanner;

public class zad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = 0;
		while (n < 10 || n > 5555) {
			n = sc.nextInt();
		}
		System.out.println("Enter m: ");
		int m = 0;
		while (m < 10 || m > 5555) {
			m = sc.nextInt();
		}
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
