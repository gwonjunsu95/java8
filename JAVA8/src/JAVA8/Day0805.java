package JAVA8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ����ϰڽ��ϱ�?");
		System.out.print("Ȧ���� �Է����ּ���. : ");
		int line = sc.nextInt();
		int up = line / 2;
		int down = line - up;
		if (line % 2 != 0) {
			for (int i = 0; i < up; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int i = down; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			System.exit(0);
		}

		sc.close();
	}
}
