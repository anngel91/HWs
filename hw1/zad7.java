package hw1zad7;

import java.util.Scanner;

public class zad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the time?");
		int time = sc.nextInt();
		System.out.println("How much money do I have?");
		double money = sc.nextDouble();
		System.out.println("Am I sick (true/false) ?");
		boolean isSick = sc.nextBoolean();
		if (isSick == true) {
			int medicinePrice = 20;
			if (money > medicinePrice) {
				System.out.println("Won't go out. Will buy medicine.");
			} else {
				System.out.println("Won't go out. Will drink tea.");
			}
		} else {
			int cinemaTicketPrice = 10;
			if (money > cinemaTicketPrice) {
				System.out.println("Will go to the cinema.");
			} else {
				System.out.println("Will go to a cafe.");
			}
		}

	}

}
