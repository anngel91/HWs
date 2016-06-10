package hw1zad6;

import java.util.Scanner;

public class zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A1:");
		int a1 = sc.nextInt();
		System.out.println("Type A2:");
		int a2 = sc.nextInt();
		System.out.println("Type A3:");
		int a3 = sc.nextInt();
		System.out.println("Values before swap:");
		System.out.println("A1=" + a1 + " A2=" + a2 + " A3=" + a3);
		int blank = a1;
		a1 = a2;
		a2 = a3;
		a3 = blank;
		System.out.println("Values after swap:");
		System.out.println("A1=" + a1 + " A2=" + a2 + " A3=" + a3);
	}

}
