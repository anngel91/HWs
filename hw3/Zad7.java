package hw3;

public class Zad7 {

	public static void main(String[] args) {
		int[] arr = { 1, 52, 34, 123, 62, 131, 213, 86, 3476, 324 };
		int[] arr2 = new int[arr.length];
		arr2[0] = arr[0];
		arr2[arr2.length - 1] = arr[arr.length - 1];
		for (int i = 1; i < arr.length - 1; i++) {
			arr2[i] = arr[i - 1] + arr[i + 1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
