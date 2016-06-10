package hw5;

import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = sc.next();
		sc.close();
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Word is a palindrome.");
		} else {
			System.out.println("Word is not a palindrome.");
		}

	}

}
