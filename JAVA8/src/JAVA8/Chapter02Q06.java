package JAVA8;

import java.util.Scanner;

public class Chapter02Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�, �й�, ���������� �Է��ϼ���:");
		String name = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("���� �̸��� " + name +"�Դϴ�.");
		System.out.println("�й��� " + num1 +"�Դϴ�.");
		System.out.println("�׸��� ���������� " + num2 +"�� �Դϴ�.");
		
		sc.close();
	}
}
