package hw3;

public class Zad9 {

	public static void main(String[] args) {
		int[] arr = { 1, 52, 34, 123, 62, 131, 213, 86, 3476, 324 };
		int[] arr2 = new int[arr.length];
		for (int i = arr.length - 1, j = 0; j < arr.length; i--, j++) {
			arr2[j] = arr[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		// without extra array
		for (int i = arr.length - 1, j = 0; j < i; i--, j++) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
