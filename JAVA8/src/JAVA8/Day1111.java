package JAVA8;

import java.util.Scanner;

public class Day1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		while (true) {
			System.out.print("�ΰ��� ������ �Է����ּ��� : ");
			x = sc.nextInt();
			y = sc.nextInt();

			res = x * y;
			System.out.println("�� ������ ���� : " + res + " �Դϴ�.");

			if (res > 500) {
				break;
			}
		}
		sc.close();
	}
}
