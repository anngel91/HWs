package hw3;

import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] > 5) {
				counter++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(" - " + counter + " numbers.");
		sc.close();
	}

}
