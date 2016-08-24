import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	public static void main(String[] args) throws IOException {
		File war = new File("Voina_I_Mir.txt");
		for (int i = 1; i <= 10; i++) {
			try {
				countCommas(i, war);
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
			}
		}
	}

	static void countCommas(int numberOfThreads, File f) throws FileNotFoundException {
		ExecutorService exec = Executors.newFixedThreadPool(numberOfThreads);
		Runnable task = new Runnable() {
			@Override
			public void run() {
				long start = System.currentTimeMillis();
				Scanner sc;
				try {
					sc = new Scanner(f);
					int commaCounter = 0;
					while (sc.hasNextLine()) {
						for (char c : sc.nextLine().toCharArray()) {
							if (c == ',') {
								commaCounter++;
							}
						}
					}
					sc.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		};
		exec.execute(task);
	}
}
