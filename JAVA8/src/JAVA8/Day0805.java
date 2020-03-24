package JAVA8;

import java.util.Scanner;

public class Day0805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력하겠습니까?");
		System.out.print("홀수로 입력해주세요. : ");
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
			System.out.println("잘못입력하셨습니다.");
			System.exit(0);
		}

		sc.close();
	}
}
