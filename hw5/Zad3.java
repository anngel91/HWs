package hw5;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		String str2;
		do {
			System.out.println("String 1: ");
			str1 = sc.nextLine();
			System.out.println("String 2: ");
			str2 = sc.nextLine();
		} while (str1.contains(" ") || str2.contains(" "));
		sc.close();
		if (str1.length() == str2.length()) {
			System.out.println("The two strings have the same length.");
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) == str2.charAt(i)) {
					continue;
				} else {
					System.out.println((i + 1) + " " + str1.charAt(i) + "-" + str2.charAt(i));
				}
			}
		} else {
			System.out.println("The two strings have different length.");
		}

	}

}
