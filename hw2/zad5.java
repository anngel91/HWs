package hw2;

import java.util.Scanner;

public class zad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of number A: ");
		int a = sc.nextInt();
		System.out.println("Value of number B: ");
		int b = sc.nextInt();
		if (a<b) {
			while (a<=b) {
				System.out.print(a+" ");
				a++;
			}
		}
		else if (a>b) {
			while (a>=b) {
				System.out.print(b+" ");
				b++;
			}
		}
		sc.close();
		
	}

}
