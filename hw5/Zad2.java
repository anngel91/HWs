package hw5;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1: ");
		String str1 = sc.nextLine();
		System.out.println("String 2: ");
		String str2 = sc.nextLine();
		sc.close();
		if (str1.length() < str2.length()) {
			System.out.print(str2.length() + ", ");
			String str3 = str1.substring(0, 5) + str2.substring(5, str2.length());
			System.out.println(str3);
		} else {
			System.out.print(str1.length() + ", ");
			String str3 = str2.substring(0, 5) + str1.substring(5, str1.length());
			System.out.println(str3);
		}
	}

}
