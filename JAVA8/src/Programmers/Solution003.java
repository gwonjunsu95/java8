package Programmers;

public class Solution003 {

	  public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] num1 = new int[10000];
	        int sum =0;
	        for(int i = 0; i < 10000 ; i++) {
	        	sum++;
	        	num1[i] = sum;
	        	if(sum == 5) {
	        		sum = 0;
	        	}
	        	System.out.println(num1[i]);
	        }	        		
	        for(int i = 0; i < 10000; i++) {
	        	answer[i] = (int) (Math.random()*5)+1;
	        }
	        return answer;
	  }
}
