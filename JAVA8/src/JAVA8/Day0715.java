package JAVA8;

public class Day0715 {

	public static void main(String[] args) {
		System.out.print("1���� 100���� 5�� ����� ���� : ");
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 5 ==0) {
				sum += i;
			}
		}
		System.out.println(sum + "�Դϴ�.");
		
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
		System.out.println("�հ�� : " + sum1 + " ������ : " + sum2 + "�� �Դϴ�.");
		
		
	}
}
