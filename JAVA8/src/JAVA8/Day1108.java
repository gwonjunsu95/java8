package JAVA8;

import java.util.Scanner;

public class Day1108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			System.out.println("�Է��Ͻ� ������ : " + x + "," + y + "�Դϴ�.");
			System.out.println("���� ū���� : " + x + " ���� ���� : " + y + "�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ : " + x + "," + y + "�Դϴ�.");
			System.out.println("���� ū���� : " + y + " ���� ���� : " + x + "�Դϴ�.");
		}

		sc.close();
	}
}
