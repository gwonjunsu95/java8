package JAVA8;

public class Day0706 {

	public static void main(String[] args) {
		int num = 1;
		System.out.print("1부터 10까지의 수의 곱은 : ");
		
		for(int i = 1; i <= 10; i++) {
		 num *= i;
		} 
		System.out.println(num + "입니다.");
	}
}
