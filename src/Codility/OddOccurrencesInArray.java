package Codility;

import java.util.*;

class OddOccurrencesInArray {
	public int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			if (set.contains(A[0])) {
				set.remove(A[0]);
			} else {
				set.add(A[0]);
			}
		}
		for (int s : set) {
			result = s;
		}
		return result;
	}
}