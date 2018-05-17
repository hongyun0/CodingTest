package Codility;

public class BinaryGap {

	class Solution {
		public int solution(int N) {
			int gap = 0;
			int max = 0;
			String binary = Integer.toBinaryString(N);
			String a[] = binary.split("1");
			if (binary.charAt(binary.length() - 1) == '0') {
				max = a.length - 1;
			} else {
				max = a.length;
			}
			for (int i = 0; i < max; i++) {
				if (gap < a[i].length()) {
					gap = a[i].length();
				}
			}
			return gap;
		}
	}
}
