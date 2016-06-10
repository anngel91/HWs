package hw2;

import java.util.Scanner;

public class zad21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number between 1 and 52");
		int a = 0;
		while (a < 1 || a > 52) {
			a = sc.nextInt();
		}

		for (int i = a; i <= 52; i++) {
			int b = (i - 1) / 4 + 1;
			int c = i % 4;

			switch (b) {
			case 1:
				System.out.print("2");
				break;
			case 2:
				System.out.print("3");
				break;
			case 3:
				System.out.print("4");
				break;
			case 4:
				System.out.print("5");
				break;
			case 5:
				System.out.print("6");
				break;
			case 6:
				System.out.print("7");
				break;
			case 7:
				System.out.print("8");
				break;
			case 8:
				System.out.print("9");
				break;
			case 9:
				System.out.print("10");
				break;
			case 10:
				System.out.print("Jack");
				break;
			case 11:
				System.out.print("Queen");
				break;
			case 12:
				System.out.print("King");
				break;
			case 13:
				System.out.print("Ace");
				break;
			}
			System.out.print(" of ");
			switch (c) {
			case 1:
				System.out.print("clubs");
				break;
			case 2:
				System.out.print("diamonds");
				break;
			case 3:
				System.out.print("hearts");
				break;
			case 0:
				System.out.print("spades");
				break;
			}
			if (i < 52) {
				System.out.print(", ");
			}
		}
		sc.close();
	}

}
