import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		File war = new File("Voina_i_mir.txt");
		for (int i = 1; i <= 200; i++) {
			long start = System.currentTimeMillis();
			countCommas(i, war);
			long end = System.currentTimeMillis();
			System.out.println("Time to complete with " + i + " threads: " + (end - start));
		}

	}

	static void countCommas(int numberOfThreads, File f)
			throws FileNotFoundException, InterruptedException, ExecutionException {
		StringBuilder book = new StringBuilder();
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			book.append(sc.nextLine());
		}
		sc.close();
		int partLength = book.length() / numberOfThreads;
		int from = 0;
		int to = from + partLength;
		ArrayList<String> parts = new ArrayList<>();
		while (to <= book.length()) {
			parts.add(book.substring(from, to));
			from = to;
			to = from + partLength;
		}
		ExecutorService exec = Executors.newFixedThreadPool(numberOfThreads);
		Set<Future<Integer>> futures = new HashSet<>();
		for (int i = 0; i < parts.size(); i++) {
			RunCommas commas = new RunCommas(parts.get(i));
			Future<Integer> future = exec.submit(commas);
			futures.add(future);
		}
		exec.shutdown();
		int numberOfCommas = 0;
		for (Future<Integer> future : futures) {
			numberOfCommas += future.get();
		}
		System.out.println("Number of commas: " + numberOfCommas);
	}
}
