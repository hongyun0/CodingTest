package baekjun;

public class SortInside_1427 {
	public static int selectionSort(int A) {
		int answer = 0;
		int[] array = new int[String.valueOf(A).length()];
		int i = array.length - 1;
		while (A > 0) {
			array[i] = A % 10;
			A /= 10;
			i--;
		}
		int temp;
		for (int j = 0; j < array.length - 1; j++) {
			for (int k = j + 1; k < array.length; k++) {
				if (array[j] < array[k]) {
					temp = array[k];
					array[k] = array[j];
					array[j] = temp;
				}
			}
		}
		int tenth = 1;
		for (int a = array.length - 1; a >= 0; a--) {
			answer += array[a] * tenth;
			tenth *= 10;
		}
		return answer;
	}

	public static int insertionSort(int A) {
		int answer = 0;
		int[] array = new int[String.valueOf(A).length()];
		int i = array.length - 1;
		while (A > 0) {
			array[i] = A % 10;
			A /= 10;
			i--;
		}
		int temp;
		for (int j = 1; j < array.length; j++) {
			temp = array[j];
			int k = j - 1;
			while (k >= 0 && temp > array[k]) {
				array[k + 1] = array[k];
				k--;
			}
			array[k + 1] = temp;
		}
		int tenth = 1;
		for (int a = array.length - 1; a >= 0; a--) {
			answer += array[a] * tenth;
			tenth *= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(selectionSort(347465));
		System.out.println(insertionSort(347645));
	}
}
