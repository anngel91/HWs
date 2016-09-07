import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo2 {

	static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
		SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(new Comparator<Map.Entry<K, V>>() {
			@Override
			public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
				int res = e1.getValue().compareTo(e2.getValue());
				return res != 0 ? res : 1;
			}
		});
		sortedEntries.addAll(map.entrySet());
		return sortedEntries;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File war = new File("Voina_I_Mir.txt");
		Scanner sc = new Scanner(war);
		HashMap<String, Integer> map = new HashMap();
		while (sc.hasNextLine()) {
			String[] line = sc.nextLine().split(" ");
			for (int i = 0; i < line.length; i++) {
				if (!map.containsKey(line[i])) {
					map.put(line[i], 1);
				} else {
					map.put(line[i], map.get(line[i]) + 1);
				}
			}
		}

		System.out.println(entriesSortedByValues(map));

		System.out.println("Total distinct words: " + map.size());
	}

}
