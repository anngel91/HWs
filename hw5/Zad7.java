package hw5;

import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a text: ");
		String str = sc.nextLine();
		sc.close();
		String[] arr = str.split(" ");
		String longest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		System.out.println("Number of words: " + arr.length);
		System.out.println("Longest is: " + longest + ", with " + longest.length() + " symbols.");
	}

}
