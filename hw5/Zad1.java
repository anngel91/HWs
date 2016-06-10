package hw5;

import java.util.Scanner;

public class Zad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		do {
			System.out.println("String 1:");
			str1 = sc.nextLine();
			System.out.println("String 2:");
			str2 = sc.nextLine();
		} while (str1.length() > 40 || str2.length() > 40);
		sc.close();

		String str3 = str1.toUpperCase();
		String str4 = str1.toLowerCase();
		String str5 = str2.toUpperCase();
		String str6 = str2.toLowerCase();

		System.out.print(str3 + " " + str4 + " " + str5 + " " + str6);
	}
}
