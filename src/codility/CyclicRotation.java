package Codility;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		if (A.length == 0) {
			return A;
		}
		for (int i = 0; i < K; i++) {
			A = rotate(A);
		}
		return A;
	}

	public int[] rotate(int[] A) {
		int last = A[A.length - 1];
		for (int i = A.length - 1; i > 0; i--) {
			A[i] = A[i - 1];
		}
		A[0] = last;
		return A;
	}
}
