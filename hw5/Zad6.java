package hw5;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		char[] arr = new char[text.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = text.charAt(i);
		}
		arr[0] = Character.toUpperCase(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ' && i + 1 < arr.length) {
				arr[i + 1] = Character.toUpperCase(arr[i + 1]);
			}
		}
		String text2 = new String(arr);
		System.out.println(text2);
	}

}
