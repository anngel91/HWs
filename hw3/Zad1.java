package hw3;

import java.util.Scanner;

public class Zad1 {

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

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min element with module of 3 is: " + min);
		sc.close();
	}

}
