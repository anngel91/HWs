package hw2;

public class zad20 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(j);
			}
			for (int q = 0; q < i; q++) {
				System.out.print(q);
			}

			System.out.println();

		}
	}

}
