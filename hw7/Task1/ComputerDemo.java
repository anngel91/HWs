package hw7;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc1 = new Computer(2015, 2000, 750, 248);
		Computer pc2 = new Computer(2009, 1000, 250, 200);

		if (pc1.comparePrice(pc2) == 1) {
			System.out.println("Pc2 is more expensive.");
		} else if (pc1.comparePrice(pc2) == -1) {
			System.out.println("Pc1 is more expensive.");
		} else {
			System.out.println("They have the same price.");
		}
	}

}
