package hw3;

import java.util.Scanner;

public class Zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int binary = number;
		int counter = 0;
		while (number > 0) {
			number /= 2;
			counter++;
		}
		int[] arr = new int[counter];
		int[] arr2 = new int[counter];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = binary % 2;
			binary /= 2;
		}
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr2[j] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i]);
		}
		sc.close();
	}

}
