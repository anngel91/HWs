package hw1zad2;

import java.util.Scanner;

public class zad2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A:");
		int a = sc.nextInt();
		System.out.println("Type B:");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sums is: "+c);
		int d = a-b;
		System.out.println("Susbtraction is: "+d);
		int e = a*b;
		System.out.println("Multiplication is: "+e);
		int f = a&b;
		System.out.println("Modulus is: "+f);
		int g = a/b;
		System.out.println("Division is: "+g);
	}
}
