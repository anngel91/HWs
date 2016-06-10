package hw3;

public class Zad2 {

	public static void main(String[] args) {

		int[] arr = { 1, 52, 34, 123, 62, 131, 213, 86, 3476, 324 };
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length / 2; i++) {
			arr2[i] = arr[i];
		}
		for (int i = arr2.length - 1, j = arr2.length / 2; i >= arr2.length / 2; i--, j++) {
			arr2[j] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
