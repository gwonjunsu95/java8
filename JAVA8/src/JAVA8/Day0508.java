package JAVA8;

import java.util.Scanner;

public class Day0508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����� �Է��ϼ���:");
		String grade = sc.next();
		
		switch(grade) {
			case "s":
			case "S":
				System.out.println("����� VIP�Դϴ�.");
				break;
			case "a":
			case "A":
				System.out.println("����� �������Դϴ�.");
				break;
			case "b":
			case "B":
				System.out.println("����� ��������Դϴ�.");
				break;
			default:
				System.out.println("����� �Ϲݰ����Դϴ�.");
		}
		
		
		
		
		sc.close();
	}
}