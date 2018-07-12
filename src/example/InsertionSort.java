package example;

public class InsertionSort {
	public static int[] solution(int[] A) {
		int temp;
		for (int i = 1; i < A.length; i++) {
			temp = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > temp) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}

		return A;
	}
}
