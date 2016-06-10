package hw3;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter number of elements in array: ");
			n = sc.nextInt();
		} while (n < 1);
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value of cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		boolean isPalindrome = true;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			if (arr[i] == arr[j]) {
				continue;
			} else {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Array is a palindrome.");
		} else {
			System.out.println("Array is not a palindrome.");
		}
		sc.close();
	}

}
