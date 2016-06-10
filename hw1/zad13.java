package hw1zad13;

import java.util.Scanner;

public class zad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the temperature?");
		int temperature = sc.nextInt();
		if (temperature < -100 || temperature > 100) {
			System.out.println("You're in hell!");
		}
		if (temperature >= -100 && temperature < -20) {
			System.out.println("Ice cold!");
		}
		if (temperature >= -20 && temperature < 0) {
			System.out.println("Cold!");
		}
		if (temperature > 0 && temperature < 15) {
			System.out.println("Chilly!");
		}
		if (temperature >= 15 && temperature < 25) {
			System.out.println("Warm!");
		}
		if (temperature >= 25 && temperature < 100) {
			System.out.println("Hot!");
		}
	}

}
