package hw1zad5;

import java.util.Scanner;

public class zad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A:");
		int a = sc.nextInt();
		System.out.println("Type B:");
		int b = sc.nextInt();
		System.out.println("Type C:");
		int c = sc.nextInt();
		if ((a < b) && (b < c)) {
			System.out.println(c + " " + b + " " + a);

		}
		if ((a < c) && (c < b)) {
			System.out.println(b + " " + c + " " + a);
		}
		if ((b < a) && (a < c)) {
			System.out.println(c + " " + a + " " + b);
		}
		if ((b < c) && (c < a)) {
			System.out.println(a + " " + c + " " + b);

		}
		if ((c < a) && (a < b)) {
			System.out.println(b + " " + a + " " + c);

		}
		if ((c < b) && (b < a)) {
			System.out.println(a + " " + b + " " + c);

		}
	}
}
