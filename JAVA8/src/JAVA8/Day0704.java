package JAVA8;

public class Day0704 {

	public static void main(String[] args) {
		int num = 0;
		System.out.print("1부터 10까지의 짝수의 합은 : ");
		
		for(int i = 0; i <= 10; i++) {
			if (i % 2 !=0) {
				continue;
			}
		num += i;
		}
		System.out.println(num + "입니다.");
	}
}
