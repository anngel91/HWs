package hw4;

public class Zad5 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int sum = 0;
		int maxRow = Integer.MIN_VALUE;
		int maxCol = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if (maxRow < sum) {
				maxRow = sum;
			}
		}
		System.out.println("Biggest sum of elements in each row is (MaxRow) " + maxRow);
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
			}
			if (maxCol < sum) {
				maxCol = sum;
			}
		}
		System.out.println("Biggest sum of elements in each column is (MaxCol) " + maxCol);
		if (maxCol > maxRow) {
			System.out.println("MaxCol>MaxRow");
		} else {
			System.out.println("MaxRow>MaxCol");
		}
	}

}
