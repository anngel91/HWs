package hw5;

import java.util.Arrays;

public class Zad13 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 123, 123, 55, 2 };
		int[] arr3 = mergeArrays(arr, arr2);
		System.out.println(Arrays.toString(arr3));
	}

	static int[] mergeArrays(int[] arr, int[] arr2) {
		int[] arr3 = new int[arr.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		for (int i = arr.length, j = 0; i < arr3.length; i++, j++) {
			arr3[i] = arr2[j];
		}
		return arr3;
	}
}
