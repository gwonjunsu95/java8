package JAVA8;

public class Day0709 {

	public static void main(String[] args) {
		int sum = 0;
		double res ;
		System.out.print("1���� 50������ ���� ����� : ");
		for(int i =1; i <= 50; i++) {
				sum += i; 
		} 
//		int avg(average) = (double) sum / 50 ;	
		res = sum / 50.0;
		System.out.println(res + "�Դϴ�.");
	}
}
