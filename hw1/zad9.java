package hw1zad9;

import java.util.Scanner;

public class zad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A: ");
		int a = sc.nextInt();
		System.out.println("Type B: ");
		int b = sc.nextInt();
		int c = a * b;
		System.out.println("Multiplication: " + c);
		if (c % 2 == 0) {
			System.out.println("Even - " + c % 10);
		} else {
			System.out.println("Uneven - " + c % 10);
		}
	}
}
