import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo2 {

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};
		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
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

		sortByValues(map);
		for (Iterator<Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
			Entry e1 = it.next();
			System.out.println(e1.getKey() + " " + e1.getValue());
		}

		System.out.println("Total distinct words: " + map.size());
	}

}
