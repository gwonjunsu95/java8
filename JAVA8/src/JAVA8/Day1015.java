package JAVA8;

import java.util.Scanner;

public class Day1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kimbab = 2000;
		final int dduk = 2000;
		final int odeng = 500;
		final int sundae = 2000;
		int a,b,c,d;
		
		System.out.println("�����н��Դϴ�. �޴��� ������ �����ϴ�.");
		System.out.println("��� 1�� : 2000��, ������ 1�κ� : 2000��");
		System.out.println("���� 1�� : 500��, ���� 1�κ� 2000��");
		System.out.println("��� ������ ���� ���� ������ �Է����ּ���.");
		
		System.out.print("����� �� �� �����Ͻðڽ��ϱ�?");
		a = sc.nextInt();
		System.out.print("�����̴� �� �κ� �����Ͻðڽ��ϱ�?");
		b = sc.nextInt();
		System.out.print("������ �� �� �����Ͻðڽ��ϱ�?");
		c = sc.nextInt();
		System.out.print("����� �� �κ� �����Ͻðڽ��ϱ�?");
		d = sc.nextInt();
		System.out.println();
		
		
		System.out.println("����� " + a + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("��� : " + kimbab * a);
		System.out.println("�����̴� " + b + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("������ : " + kimbab * b);
		System.out.println("������ " + c + "�� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + odeng * c);
		System.out.println("����� " + d + "�κ� �ֹ��ϼ̽��ϴ�.");
		System.out.println("���� : " + kimbab * d);
		System.out.println();
		
		System.out.println("�� �ݾ� : " + (kimbab * a + kimbab * b+kimbab * d+odeng * c));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] arr = new int[] {2000,2000,500,2000};
//		String[] arr2 = new String[] {"��� 1��","������ 1�κ�", "���� 1��", "����1�κ�"};
//		
//		int order = sc.nextInt();
//		for(int i = 0; i < arr.length; i++) {
//		System.out.println();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			
//		}
		
		
		
		
		sc.close();
	}
}
