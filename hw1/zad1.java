package hw1zad1;

import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A:");
		double a = sc.nextDouble();
		System.out.println("Type B:");
		double b = sc.nextDouble();
		System.out.println("Type C:");
		double c = sc.nextDouble();

		if ((c > a && c < b) || (c < a && c > b)) {
			System.out.println("C is between A and B");
		} else {
			System.out.println("C is not between A and B");
		}
	}

}
