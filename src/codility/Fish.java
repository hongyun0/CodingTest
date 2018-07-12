package Codility;

import java.util.Stack;

/*
 * up 디폴트
	처음부터 훑어서 up이면 push()
	down만나면 일단 push()하고 downs++ 다음칸으로
	
	다음칸애가 down이면 push()하고 downs++ 다음칸
	
	downs가 0이 아닐때, 다음칸애가 up이면 peek()랑 크기비교
		peek()가 더 크면 다음칸으로 지나침
		up이 더 크면 pop()하고 downs--
	반복)downs가 0이 아니면 다시 up이랑 peek() 크기비교
	downs가 0이면 push()
	-> 다시 다음애부터 훑어서 up이면 push()
*/
public class Fish {
	 public static int solution(int[] A, int[] B) {
  	    Stack<Integer> stack = new Stack<Integer>();
	        final int UPSTREAM = 0;
	        int downs = 0;
	        for(int i = 0; i < A.length; i++) {
	        	if(B[i] == UPSTREAM) {
	        		stack.push(i);
	        	} else {
	        		while(i < A.length && B[i] != UPSTREAM){
	        			stack.push(i);
		        		downs++;
		        		i++;
	        		}
	
	        		while(i < A.length && B[i] == UPSTREAM && downs > 0) {
	        			if(A[i] > A[stack.peek()]){
		        			stack.pop();
		        			downs--;
	        			} else {
	        			    i++;
	        			}
	        		}
	        		if(i >= A.length) {
	        			break;
	        		}
	        		stack.push(i);
	        	}
	        }
			return stack.size();
	    }
	 
	 public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 1}, new int[]{1, 1}));
		System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
		
	}
}
