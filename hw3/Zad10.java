package hw3;

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for cell " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int average = sum / 7;
		System.out.println(average + " is the average.");
		int min = Integer.MAX_VALUE;
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			int closest = average - arr[i];
			if (closest < min && closest >= 0) {
				min = closest;
				element = arr[i];
			}
		}
		System.out.println(element + " is closest to average.");
		sc.close();
	}

}
