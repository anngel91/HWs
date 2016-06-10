package hw3;

import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Enter number of elements in array 1 and 2: ");
			n = sc.nextInt();
			m = sc.nextInt();
		} while (n < 1 && m < 1);
		int[] arr = new int[n];
		int[] arr2 = new int[m];
		if (n != m) {
			System.out.println("Arrays are have different lengths.");
			sc.close();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value of cell " + (i + 1) + " for array 1: ");
			arr[i] = sc.nextInt();
			System.out.println("Enter value of cell " + (i + 1) + " for array 2: ");
			arr2[i] = sc.nextInt();
		}
		boolean areEqual = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr2[i]) {
				System.out.println("Arrays are not equal.");
				areEqual = false;
				break;
			}
		}
		if (areEqual) {
			System.out.println("Arrays are equal.");
		}
		sc.close();
	}

}
