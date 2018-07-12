package codility;

import java.util.Stack;

public class StoneWall {
	public static int solution(int[] H) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < H.length; i++) {
			while (!stack.isEmpty() && H[i] < stack.peek()) {
				stack.pop();
				answer++;
			}
			
			if (stack.isEmpty() || H[i] > stack.peek()) {
				stack.push(H[i]);
			}
		}
		
		answer += stack.size();

		return answer;
	}

	public static void main(String[] args) {
		int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(H));
	}
}
