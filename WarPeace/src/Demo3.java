import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException {
		File war = new File("Voina_I_Mir.txt");
		Scanner sc = new Scanner(war);
		TreeSet<String> tree = new TreeSet(new ComparatorByLength());
		int warCounter = 0;
		int peaceCounter = 0;
		while (sc.hasNextLine()) {

			String[] line = sc.nextLine().split(" ");
			for (String word : line) {
				word.toLowerCase();
				if (word.equalsIgnoreCase("война")) {
					warCounter++;
				}
				if (word.equalsIgnoreCase("мир")) {
					peaceCounter++;
				}
				tree.add(word);
			}
		}
		for (String word : tree) {
			System.out.println(word);
		}

		if (warCounter > peaceCounter) {
			System.out.println("War - " + warCounter);
			System.out.println("Peace - " + peaceCounter);
			System.out.println("Word 'war' is met more frequently.");
		} else if (warCounter < peaceCounter) {
			System.out.println("War - " + warCounter);
			System.out.println("Peace - " + peaceCounter);
			System.out.println("Word 'peace' is met more frequently.");
		} else {
			System.out.println("War - " + warCounter);
			System.out.println("Peace - " + peaceCounter);
			System.out.println("Words have the same frequency.");
		}

	}

}
