package hw3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of element 1 and 2: ");
		int n = sc.nextInt();
		int[] arr = new int[10];
		arr[0] = n;
		arr[1] = n;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
