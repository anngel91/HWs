package hw3;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array's length: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element for cell " + (i + 1));
			arr[i] = sc.nextDouble();
		}
		sc.close();
		double sum = 0;
		double maxSum = Integer.MIN_VALUE;
		double element1 = 0;
		double element2 = 0;
		double element3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = arr[i] * -1;
			}
		}
		for (int i = 0; i < arr.length - 2; i++) {
			sum = arr[i] + arr[i + 1] + arr[i + 2];
			if (sum > maxSum) {
				element1 = arr[i];
				element2 = arr[i + 1];
				element3 = arr[i + 2];
			}
		}
		System.out.println(element1 + " " + element2 + " " + element3);
	}

}
