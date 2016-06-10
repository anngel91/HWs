package hw3;

import java.util.Scanner;

public class Zad8 {

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
		int same = arr[0];
		int currentLength = 1;
		int longestLength = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == same) {
				currentLength++;
			} else {
				currentLength = 1;
				same = arr[i];
			}
			if (currentLength > longestLength)
				longestLength = currentLength;
		}
		sc.close();
		System.out.println(longestLength + " is the longest sequence of equal elements");
	}

}
