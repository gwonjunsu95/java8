package JAVA8;

import java.util.Scanner;

public class Day0509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A.�Ƹ޸�ī�� L.ī��� M.ī���ī C.īǪġ��");
		System.out.print("���ϴ� Ŀ���� ���ĺ��� �Է����ּ���:");
		String coffee = sc.next();
		
		switch(coffee) {
			case "a":
			case "A":
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case "c":
			case "C":
				System.out.println("īǪġ�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case "l":
			case "L":
				System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("ī���ī�� �ֹ��ϼ̽��ϴ�.");
				
		}
		
		
		sc.close();
	}
}
