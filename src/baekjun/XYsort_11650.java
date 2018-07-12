package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XYsort_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = in.readLine();
		int N = Integer.parseInt(input);
		int[][] coordinates = new int[N][2];

		for (int i = 0; i < N; i++) {
			input = in.readLine();
			String[] coordinate = input.split(" ");
			coordinates[i][0] = Integer.parseInt(coordinate[0]);
			coordinates[i][1] = Integer.parseInt(coordinate[1]);
		}

		int[] temp = new int[2];
		for (int j = 1; j < N; j++) {
			temp = coordinates[j];
			int k = j - 1;
			while (k >= 0 && temp[0] < coordinates[k][0]) {
				coordinates[k + 1] = coordinates[k];
				k--;
			}
			while (k >= 0 && temp[1] < coordinates[k][1]){
				coordinates[k + 1] = coordinates[k];
				k--;
			}
			coordinates[k + 1] = temp;
		}

		for (int i = 0; i < coordinates.length; i++) {
			System.out.println(coordinates[i][0]+" "+coordinates[i][1]);
		}
	}
}
