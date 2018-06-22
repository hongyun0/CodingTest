package NTS;

public class Array {
	public boolean solution(int[] arr) {
        boolean answer = true;

        int[] check = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] < 1 || arr[i] > arr.length){
        		answer = false;
        		break;
        	}
        	
            if(check[arr[i] - 1] == 0) {
            	arr[i] = 1;
            } else {
            	answer = false;
            	break;
            }
        }
        
        return answer;
    }
}

