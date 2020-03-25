package JAVA8;

import java.util.Scanner;

public class Day0904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ܰ����� �����մϴ�.");
		int score = 0;
		int user;

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 8) + 2;
			int num2 = (int) (Math.random() * 9) + 1;
			int quiz = num1 * num2;

			System.out.print(num1 + "x" + num2 + "= ");
			user = sc.nextInt();
			if (user == quiz) {
				System.out.println("�����Դϴ�. ���� ���� : " + score);
			} else {
				score += 5;
				System.out.println("�����Դϴ�. ���� ���� : " + score);
			}
		}

		long end = System.currentTimeMillis();
		long time = (end - start) /1000;
		long res = 200 - time - score; 
		if(res > 100) {
			res = 100;
		} else if(res < 0) {
			res = 0;
		}
		System.out.println("���� ������ " + res + " �Դϴ�.");
		sc.close();
	}
}
