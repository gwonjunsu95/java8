package JAVA8;

public class Day0705 {

	public static void main(String[] args) {
		int num = 0;
		System.out.print("1부터 50까지의 수 중 3의 배수의 합은 : ");
		
		for(int i = 0; i <= 50; i++) {
			if (i % 3 !=0) {
				continue;
			}
		num += i;
		}
		System.out.println(num + "입니다.");
	}
}
