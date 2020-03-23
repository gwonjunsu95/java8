package JAVA8;

public class Day0709 {

	public static void main(String[] args) {
		int sum = 0;
		double res ;
		System.out.print("1부터 50까지의 합의 평균은 : ");
		for(int i =1; i <= 50; i++) {
				sum += i; 
		} 
//		int avg(average) = (double) sum / 50 ;	
		res = sum / 50.0;
		System.out.println(res + "입니다.");
	}
}
