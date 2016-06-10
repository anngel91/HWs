package hw5;

import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		// ¬карва в масив
		char arr[] = str.toCharArray();
		int numSum = 0;
		boolean isNegative = false;
		for (int i = 0; i < arr.length; i++) {
			int number = 0;

			if ((arr[i] >= '0' && arr[i] <= '9') || arr[i] == '-') {
				if (arr[i] == '-') {
					isNegative = true;
					if (i + 1 < arr.length) {
						i++;
					}
				}
				for (; i < arr.length; i++) {
					if (arr[i] >= '0' && arr[i] <= '9') {
						number = number * 10 + Character.getNumericValue(arr[i]);
						if (i + 1 == arr.length) {
							numSum += number;
						}
					} else {
						if (isNegative && number > 0) {
							number *= -1;
						}
						isNegative = false;
						numSum += number;
						break;
					}
				}

			}
		}
		System.out.println("Sum is : " + numSum);
	}

}
