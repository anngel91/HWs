package hw4;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter n: ");
			n = sc.nextInt();
		} while (n < 1);
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter value:");
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("___________");
		System.out.println("Diagonals: ");
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			System.out.print(arr[i][j] + " ");
		}
	}

}
