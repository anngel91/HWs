package hw4;

public class Zad3 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, { 2, 3, 4, 5 } };
		float sum = 0;
		float count = 0;
		float average = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
				count++;
			}
		}
		average = sum / count;
		System.out.println("Sum of elements is " + sum + ", average is " + average);
	}

}
