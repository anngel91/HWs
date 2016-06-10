package hw1zad4;

import java.util.Scanner;

public class zad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A:");
		int a = sc.nextInt();
		System.out.println("Type B:");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
	}
}
