package JAVA8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڰ� Ȧ������ �Ǻ��մϴ�.");
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		if (num % 2 !=0) {
			System.out.println("�Է��Ͻ� ���� : "+ num + "��(��) Ȧ���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���� : "+ num + "��(��) ¦���Դϴ�.");
		}
		
		String res = num % 2 != 0 ? "Ȧ��" : "¦��" ;
		System.out.println("�Է��Ͻ� ���� : "+ num + "��(��) "+ res + "�Դϴ�.");
		
		
		
		
		
		
		
		
		sc.close();
	}
}
