package hw2;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int a = sc.nextInt();
		int startNumber = 3;
		for (int i = 1; i <= a; i++) {
			if (i == a) {
				System.out.println(startNumber);
			} else {
				System.out.print(startNumber + ",");
			}
			startNumber += 3;
		}
		sc.close();
	}

}
