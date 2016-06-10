package hw5;

import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Word 1:");
		String word1 = sc.nextLine();
		System.out.println("Word 2:");
		String word2 = sc.nextLine();
		sc.close();
		char[] arr = new char[word1.length()];
		char[] arr2 = new char[word2.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = word1.charAt(i);
			arr[i] = Character.toLowerCase(arr[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = word2.charAt(i);
			arr2[i] = Character.toLowerCase(arr2[i]);
		}
		arr[0] = Character.toUpperCase(arr[0]);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == arr2[0]) {
				System.out.print(arr[i] + word2.substring(1, word2.length()));
				System.out.println();
			} else {
				System.out.println(arr[i]);
			}
		}
	}

}
