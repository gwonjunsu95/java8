package JAVA8;

import java.util.Scanner;

public class Chapter02Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� a,b�� ū���� ����մϴ�.");
		int a , b;
		int c;
		System.out.print("�Է� a : ");
		a = sc.nextInt();
		System.out.print("�Է� b : ");
		b = sc.nextInt();
		System.out.println("�Է� : a(" + a +"),b("+ b +")");
		c = a >= b ? a : b;
		System.out.println("��� :" + c);
		
		
		sc.close();
	}
}
