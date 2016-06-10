package hw4;

public class Zad7OneLoop {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum = 0;
		int rowsSum = 0;
		int rowIndex = 0;
		for (int i = 0; i < arr.length * arr.length; i++) {
			System.out.print(arr[i / arr.length][i % arr.length] + " ");
			sum += arr[i / arr.length][i % arr.length];
			if (i % 6 == 5) {
				System.out.println();
				System.out.println("Sum of row " + (rowIndex + 1) + " is: " + sum);
				rowsSum += sum;
				sum = 0;
				rowIndex++;
			}

		}
		System.out.println();
		System.out.println("Sum of all rows is: " + rowsSum);
	}

}
