package hw2;

public class zad12 {

	public static void main(String[] args) {
		int a = 99;

		while (a < 999) {
			a++;

			if ((a % 10 == a / 100) || ((a % 10) == ((a % 100) / 10)) || (((a % 100) / 10) == a / 100)) {
				continue;
			}
			System.out.println(a);

		}

	}

}
