package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day1017 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] com = new int[3];

		com[0] = rd.nextInt(9) + 1;
		do {
			com[1] = rd.nextInt(9) + 1;
		} while (com[0] == com[1]);
		do {
			com[2] = rd.nextInt(9) + 1;
		} while (com[0] == com[2] || com[1] == com[2]);

		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		int strike = 0;
		int ball = 0;

		for (int j = 0; j < 11; j++) {
			System.out.println("ù ��° ���� �Է��� �ּ��� : ");
			do {
				if (user[0] != 0) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
				}
				user[0] = sc.nextInt();
			} while (user[0] < 1 || user[0] > 9);

			do {
				if (user[0] == user[1]) {
					System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
				}
				System.out.println("�� ��° ���� �Է��� �ּ��� : ");
				do {
					if (user[1] != 0) {
						System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					}
					user[1] = sc.nextInt();
				} while (user[1] < 1 || user[1] > 9);
			} while (user[0] == user[1]);

			do {
				if (user[0] == user[2] || user[1] == user[2]) {
					System.out.println("������ ���ڴ� �Է��� �� �����ϴ�.");
				}
				System.out.println("�� ��° ���� �Է��� �ּ��� : ");
				do {
					if (user[2] != 0) {
						System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					}
					user[2] = sc.nextInt();
				} while (user[2] < 1 || user[2] > 9);
			} while (user[0] == user[2] || user[1] == user[2]);

			for (int i = 0; i < 3; i++) {
				if (com[i] == user[i]) {
					strike += 1;
				}
			}

			if (com[0] == user[1] || com[0] == user[2]) {
				ball += 1;
			}
			if (com[1] == user[0] || com[1] == user[2]) {
				ball += 1;
			}
			if (com[2] == user[1] || com[2] == user[0]) {
				ball += 1;
			}
			System.out.println(strike + "strike" + ball + "ball");
			if (strike == 3) {
				System.out.println("�����Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}
			strike = ball = 0;
		}

		sc.close();

	}
}
