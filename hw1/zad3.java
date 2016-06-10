package hw1zad3;

import java.util.Scanner;

public class zad3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A:");
		int a = sc.nextInt();
		System.out.println("Type B:");
		int b = sc.nextInt();
		System.out.println("Value of A and B before swap respectively:" + a + " " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("Value of A and B after swap respectively:" + a + " " + b);
	}
}
