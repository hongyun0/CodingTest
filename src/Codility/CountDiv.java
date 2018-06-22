package Codility;

public class CountDiv {
	public int solution(int A, int B, int K) {
		int count = 0;
		int i = 0;
		if (A % K == 0) {
			i = A;
		} else if (A >= K) {
			i = A + (A % K);
		} else {
			i = K;
		}

		if (i >= 0 && i <= B) {
			count = (B - i) / K + 1;
		}
		return count;
	}
}
