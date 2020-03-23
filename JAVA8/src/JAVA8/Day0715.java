package JAVA8;

public class Day0715 {

	public static void main(String[] args) {
		System.out.print("1부터 100중의 5의 배수의 합은 : ");
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println(sum + "입니다.");
		
		for(int i = 1; i <= 50; i++) {
			if(i % 3 ==0) {
				System.out.println(i);
			}
		}
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 3 ==0) {
				sum1 += i;
				sum2 += 1;
			}
		}
		System.out.println("합계는 : " + sum1 + " 개수는 : " + sum2 + "개 입니다.");
		
		
	}
}
