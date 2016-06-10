package hw1zad12;

import java.util.Scanner;

public class zad12 {

	public static void main(String[] args) {
		int CountDays = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Day: ");
		int day = sc.nextInt();
        System.out.println("Month: ");
		int month = sc.nextInt();
		System.out.println("Year: ");
		int year = sc.nextInt();
		switch (month) {
		case 2:
			CountDays = 28;
			if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
				CountDays=29;
			}
		break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			CountDays = 31;
		break;
		case 4:	
		case 6:
		case 9:
		case 11:
			CountDays = 30;
		break;
		}	
		
		day++;
		
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
			CountDays=29;
		}
		if (day>CountDays) {
			day =1;
			month++;
		}
		
		if (month>12) {
			day=1;
			month=1;
			year++;
		}
		System.out.println(day+" "+month+" "+year);
	}

}
