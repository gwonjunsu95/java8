package JAVA8;

import java.util.Scanner;

public class Day0202 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		int result;
		
		System.out.println("number1�� number2�ǰ��� ���ʴ�� �Է����ּ���.");
		System.out.println("�����̳� ����Ű�� ���� ������ �ּ���.");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		result = number1+number2;
		System.out.print("�� ���� �հ��");
		System.out.print(result);
		System.out.println("�Դϴ�.");
		sc.close();
		
	}
}
