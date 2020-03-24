package JAVA8;

public class Day0801 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 ==0 && i % 5 ==0) {
				sum += i; 
			}
		}
		System.out.println("3과 5의 공배수의 합 : " + sum);
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 ==0) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println("1부터 100중에서 짝수는 더하고 홀수는 뺀 값 : " + sum );
		
	}
}
