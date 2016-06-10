package hw5;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word: ");
		String str = sc.nextLine();
		sc.close();
		char[] arr = str.toCharArray();
		int[] ascii = new int[str.length()];
		for (int i = 0; i < ascii.length; i++) {
			ascii[i] = (int) arr[i];
			ascii[i] += 5;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) ascii[i];
		}
		String newstr = new String(arr);
		System.out.println(newstr);
	}

}
