package Codility;

import java.util.Stack;

public class Nesting {
	    public int solution(String S) {
	        char[] chars = S.toCharArray();
	        int result = 0;
	        if(chars[0] == ')'){
	        	return result;
        	}
	        
	        Stack<Character> stack = new Stack<Character>();
	        
	        for(int i = 0; i < chars.length; i++){
	        	if(chars[i] == ')'){
	        		stack.pop();
	        	} else if(chars[i] == '('){
	        		stack.push(chars[i]);
	        	}
	        }
	        if(stack.size() == 0) {
	        	result = 1;
	        }
	        return result;
	    }
}
