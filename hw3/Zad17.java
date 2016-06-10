package hw3;

import java.util.Scanner;

public class Zad17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array length:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		boolean isZigZag = true;

		for (int i = 1; i <= arr.length - 2; i++) {
			boolean isBiggerThanNeighbours = (arr[i] > arr[i + 1]) && (arr[i] > arr[i - 1]);
			boolean isLowerThanNeighbours = (arr[i] < arr[i + 1]) && (arr[i] < arr[i - 1]);

			if (!(isBiggerThanNeighbours || isLowerThanNeighbours)) {
				isZigZag = false;
				break;
			}
		}

		if (isZigZag) {
			System.out.println("Redicata e zigzagoobrazna nagore");
		} else {
			System.out.println("Redicata ne e zigzagoobrazna nagore");
		}
	}

}
