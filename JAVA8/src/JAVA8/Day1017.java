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
			System.out.println("첫 번째 값을 입력해 주세요 : ");
			do {
				if (user[0] != 0) {
					System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
				}
				user[0] = sc.nextInt();
			} while (user[0] < 1 || user[0] > 9);

			do {
				if (user[0] == user[1]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.println("두 번째 값을 입력해 주세요 : ");
				do {
					if (user[1] != 0) {
						System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
					}
					user[1] = sc.nextInt();
				} while (user[1] < 1 || user[1] > 9);
			} while (user[0] == user[1]);

			do {
				if (user[0] == user[2] || user[1] == user[2]) {
					System.out.println("동일한 숫자는 입력할 수 없습니다.");
				}
				System.out.println("세 번째 값을 입력해 주세요 : ");
				do {
					if (user[2] != 0) {
						System.out.println("범위를 초과하였습니다. 다시 입력해 주세요.");
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
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.exit(0);
			}
			strike = ball = 0;
		}

		sc.close();

	}
}
