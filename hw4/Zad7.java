package hw4;

public class Zad7 {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum = 0;
		int rowsSum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + j) % 2 == 0) {
					sum += arr[i][j];
				}
			}
			rowsSum += sum;
			System.out.println("Sum of row " + (i + 1) + " is:" + sum);
		}
		System.out.println();
		System.out.println("Sum of elements is: " + rowsSum);
	}

}
