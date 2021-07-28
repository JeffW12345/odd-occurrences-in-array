// This is a solution to: https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

import java.util.HashMap;

public class CodilitySolution {

	public int solution(int[] A) {
		HashMap<Integer, Integer> entryToFrequencyMap = new HashMap<Integer, Integer>();
		for (int entry : A) {
			if (!entryToFrequencyMap.containsKey(entry)) {
				entryToFrequencyMap.put(entry, 1);
			} else {
				entryToFrequencyMap.put(entry, entryToFrequencyMap.get(entry) + 1);
			}
		}

		for (int keyEntry : entryToFrequencyMap.keySet()) {
			if (entryToFrequencyMap.get(keyEntry) % 2 != 0) {
				return keyEntry;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		TestProg test = new TestProg();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(test.solution(A));
	}
}
