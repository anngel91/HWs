package hw2;

public class zad23 {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 10) {
			int b = a;
			while (b <= 10) {
				System.out.print((a + "*" + b + "=" + a * b + "\t"));
				b++;
			}
			System.out.println(" ");
			a++;
		}
	}

}
