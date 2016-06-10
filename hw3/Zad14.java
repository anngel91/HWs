package hw3;

public class Zad14 {

	public static void main(String[] args) {
		double[] arr = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -3 && arr[i] < 3) {
				counter++;
			}
		}
		double[] arr2 = new double[counter];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] > -3 && arr[i] < 3) {
				arr2[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
