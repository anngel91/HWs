package hw3;

import java.util.Scanner;

public class Zad18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Number of cells in array 1: ");
			n = sc.nextInt();
		} while (n < 1);
		int[] arr1 = new int[n];
		System.out.println("Enter elements of array 1: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m;
		do {
			System.out.println("Number of cells in array 2: ");
			m = sc.nextInt();
		} while (m < 1);

		int[] arr2 = new int[m];
		System.out.println("Enter elements of array 2: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3;
		if (n > m) {
			arr3 = new int[n];
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			}
			for (int i = arr2.length; i < arr1.length; i++) {
				arr3[i] = arr1[i];
			}
		} else {
			arr3 = new int[m];
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			}
			for (int i = arr1.length; i < arr2.length; i++) {
				arr3[i] = arr2[i];
			}
		}
		System.out.println("____");
		System.out.println("Elements of array 3");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		sc.close();
	}

}
