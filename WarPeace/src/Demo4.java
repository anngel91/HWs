import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo4 {

	public static void main(String[] args) throws FileNotFoundException {
		File war = new File("Voina_I_Mir.txt");
		TreeSet<String> tree = new TreeSet(new ComparatorByLength());
		Scanner sc = new Scanner(war);
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().toLowerCase().trim().split("[-_.,\\s\\d/?!:„;()×—*=“«…\uFEFF№]+");
			for (String word : line) {
				word.toLowerCase();
				tree.add(word);
			}
		}
		for (String word : tree) {
			int currentLength = word.length();
			String fileName = "words with length" + currentLength + ".txt";
			File currentFile = new File(fileName);
			if (!currentFile.exists()) {
				try {
					currentFile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				FileWriter fileWriter = new FileWriter(currentFile, true);
				fileWriter.write(word + ", ");
				fileWriter.flush();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
