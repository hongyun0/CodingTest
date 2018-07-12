package NTS;

public class Palindrome {
	public static int solution(String s)
    {
		 int answer = 1;
	        if(s.length() == 1) {
	            return answer;
	        }
	        
	        char[] chars = s.toCharArray();
	        
	        for(int i = 0; i < chars.length; i++) {
	            int countOdd = 0;
	            int countEven = 0;
	            int j = 0;
	            
	            while((i - j) >= 0 && (i + j + 2) < chars.length && chars[i - j] == chars[i + j + 2]) {
                    countOdd += 2;
                    j++;
	            }
	            if(countOdd != 0) {
	            	countOdd++;
	            }
	            
	            j = 0;
            	while((i - j) >= 0 && (i + j + 1) < chars.length && chars[i - j] == chars[i + j + 1]) {
                    countEven += 2;
                    j++;
                }
            
            	if(countOdd < countEven) {
            		countOdd = countEven;
            	}
	            if(countOdd > answer) {
	                answer = countOdd;
	            }
	        }
	        
	        return answer;
    }
	
/*	public static int getPalindromeLength(char[] chars, int center, int ){
		
	}*/
	
	public static void main(String[] args) {
		System.out.println(solution("abcdcba") + " -> 7");
		System.out.println(solution("abacde") + " -> 3");
		System.out.println(solution("aaabc") + " -> 3");
		System.out.println(solution("aaa") + " -> 3");
		System.out.println(solution("aaaa") + " -> 4");
		System.out.println(solution("aaaaa") + " -> 5");
		System.out.println(solution("cbaabc") + " -> 6");

	}
}
