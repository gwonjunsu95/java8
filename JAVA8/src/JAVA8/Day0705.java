package JAVA8;

public class Day0705 {

	public static void main(String[] args) {
		int num = 0;
		System.out.print("1���� 50������ �� �� 3�� ����� ���� : ");
		
		for(int i = 0; i <= 50; i++) {
			if (i % 3 !=0) {
				continue;
			}
		num += i;
		}
		System.out.println(num + "�Դϴ�.");
	}
}
