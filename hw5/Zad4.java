package hw5;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int commaIndex = 0;
		do {
			System.out.println("Enter 2 people's three names: ");
			str = sc.nextLine();
		} while (!str.contains(","));
		sc.close();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',') {
				commaIndex = i;
				break;
			}
		}
		String str1 = str.substring(0, commaIndex);
		String str2 = str.substring((commaIndex + 1), str.length());
		int ascii1 = 0;
		int ascii2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ' ') {
				continue;
			} else {
				int c = (int) str1.charAt(i);
				ascii1 += c;
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == ' ') {
				continue;
			} else {
				int d = (int) str2.charAt(i);
				ascii2 += d;
			}
		}
		if (ascii1 > ascii2) {
			System.out.println("ASCII of " + str1 + " is longer.");
		} else {
			System.out.println("ASCII of " + str2 + " is longer.");
		}
	}

}
