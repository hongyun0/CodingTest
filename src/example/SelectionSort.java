package example;

public class SelectionSort {
	public static int[] solution(int[] A) {
		int temp;
		for(int i = 0; i < A.length - 1; i++) {
			for(int j = 1 + 1; j < A.length; j++) {
				if(A[i] > A[j]){
					temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
		
		return A;
	}
}
