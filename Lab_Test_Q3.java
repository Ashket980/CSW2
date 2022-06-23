import java.util.*;

public class Q3 {

	public static void main(String[] args) {

		int[] a = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputa = new ArrayList<>();

		for (int i : a) // i=present element
		{
			int count = map.getOrDefault(i, 0);
			map.put(i, count + 1);
			outputa.add(i);
		}

		SortComparator comp = new SortComparator(map);

		Collections.sort(outputa, comp);

		for (Integer i : outputa) {
			System.out.print(i + " ");
		}
	}
}

class SortComparator implements Comparator<Integer> {
	private final Map<Integer, Integer> freqMap;

	SortComparator(Map<Integer, Integer> tFreqMap) {
		this.freqMap = tFreqMap;
	}

	public int compare(Integer l1, Integer l2) {

		int freqCompare = freqMap.get(l2).compareTo(freqMap.get(l1));

		int valueCompare = l1.compareTo(l2);

		if (freqCompare == 0)
			return valueCompare;
		else
			return freqCompare;
	}
}
