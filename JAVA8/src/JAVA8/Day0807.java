package JAVA8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ ��� ������ ���� ���մϴ�.");
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a >= -10000000 && a <= 10000000) && (b >= -10000000 && b <= 10000000)) {
		} else {
			System.out.println("�Է� ������ �ʰ��ϼ̽��ϴ�.");
			System.exit(0);
		}
		int res = 0;

		if (a <= b) {
			for (int i = a; i <= b; i++) {
				res += i;
			}
			System.out.println("�� ���� ������ ��� ������ ���� : " + res + "�Դϴ�.");
		} else {
			for (int i = b; i <= a; i++) {
				res += i;
			}
			System.out.println("�� ���� ������ ��� ������ ���� : " + res + "�Դϴ�.");
		}
		sc.close();
	}
}
