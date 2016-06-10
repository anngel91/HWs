package hw1zad10;

import java.util.Scanner;

public class zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type volume: ");
		int volume = sc.nextInt();
		if (volume < 10 || volume > 9999) {
			System.out.println("Volume must be between 10 and 9999");
		}
		int k = volume / 5;
		int a = volume % 2;
		int b = volume % 3;

		System.out.println("Times needed to fill: " + k);

		if (k % 2 != 0) {
			System.out.println("Extra time with 2l bucket: " + a);
		}
		if (k % 3 != 0) {
			System.out.println("Extra time with 3l blucket: " + b);
		}
	}

}
