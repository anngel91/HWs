package hw3;

public class Zad16 {

	public static void main(String[] args) {
		float[] arr = { -1.12f, -2.43f, 3.1f, 4.2f, 0, 6.4f, -7.5f, 8.6f, 9.1f, -4 };
		float[] arr2 = new float[10];
		System.out.println("Array 1: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array 2: ");
		for (int i = 0, j = 0; i < arr.length && j < arr2.length; i++, j++) {
			if (arr[i] < -0.231) {
				arr2[j] = ((i * i) + 41.25f);
			} else {
				arr2[j] = arr[i] * i;
			}
			System.out.print(arr2[j] + " ");
		}

	}

}
