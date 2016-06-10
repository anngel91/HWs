package hw1zad8;

import java.util.Scanner;

public class zad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a 4 digit number: ");
		int a = sc.nextInt();
		if (a < 1000 || a > 9999) {
			System.out.println("Invalid number.");
		}
		int b = a % 10; // edinici
		int c = ((a % 100) / 10); // desetici;
		int d = (a / 100) % 10; // stotici
		int e = a / 1000; // hilqdni

		int number1 = (e * 10) + b;
		System.out.println(number1);
		int number2 = (d * 10) + c;
		System.out.println(number2);

		if (number1 < number2) {
			System.out.println("number1<number2");
		} else if (number2 < number1) {
			System.out.println("number2<number1");
		} else {
			System.out.println("number1 = number2");
		}
	}

}
