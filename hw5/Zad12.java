package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Zad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.close();
		int[] masiv = new int[n];
		generateArray(masiv);
		System.out.println(Arrays.toString(masiv));
	}

	static int[] generateArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

}
