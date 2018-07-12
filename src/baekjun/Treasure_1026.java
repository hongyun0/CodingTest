package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Treasure_1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		int answer = 0;

		String[] inputA = in.readLine().split(" ");
		String[] inputB = in.readLine().split(" ");
		for (int i = 0; i < inputA.length; i++) {
			A[i] = Integer.parseInt(inputA[i]);
			B[i] = Integer.parseInt(inputB[i]);
		}

		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			int max = 0;
			int index = 0;
			for (int j = 0; j < B.length; j++) {
				if (A[i] * B[j] > max) {
					max = A[i] * B[j];
					index = j;
				} else if (A[i] * B[j] == max) {
					if(B[j] > B[index]) {
						index = j;
					}
				}
			}
			answer += max;
			B[index] = 0;
		}

		System.out.println(answer);
	}
}
