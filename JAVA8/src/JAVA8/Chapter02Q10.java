package JAVA8;

import java.util.Scanner;

public class Chapter02Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� a,b�� ū���� ����մϴ�.");
		int a , b;
		System.out.print("�Է� a : ");
		a = sc.nextInt();
		System.out.print("�Է� b : ");
		b = sc.nextInt();
		
		String stra =  "a(" + a +")";
		String strb =  "b(" + b +")";
		System.out.println("�Է� : " + stra + "," + strb );
		
		String res = a >= b ? stra : strb;
		System.out.println("��� : " + res);
		
		
		sc.close();
	}
}
