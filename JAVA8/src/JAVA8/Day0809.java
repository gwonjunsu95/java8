package JAVA8;

import java.util.Scanner;

public class Day0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ���� ���ڸ� ������ �����Դϴ�.");
		System.out.println("��ǻ�ʹ� 1~100�� ���ڸ� ���Ե˴ϴ�.");
		int com = (int) (Math.random() * 100) + 1;
		while (true) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int user = 0;
		user = sc.nextInt();

			if (user > com) {
				System.out.println("down");
			} else if (user < com) {
				System.out.println("up");
			} else {
				System.out.println("same");
				break;
			}
		}
		
		sc.close();
	}
}
