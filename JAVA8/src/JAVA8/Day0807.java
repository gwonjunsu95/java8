package JAVA8;

import java.util.Scanner;

public class Day0807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 사이의 모든 정수의 합을 구합니다.");
		System.out.print("두 개의 정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a >= -10000000 && a <= 10000000) && (b >= -10000000 && b <= 10000000)) {
		} else {
			System.out.println("입력 범위를 초과하셨습니다.");
			System.exit(0);
		}
		int res = 0;

		if (a <= b) {
			for (int i = a; i <= b; i++) {
				res += i;
			}
			System.out.println("두 정수 사이의 모든 정수의 합은 : " + res + "입니다.");
		} else {
			for (int i = b; i <= a; i++) {
				res += i;
			}
			System.out.println("두 정수 사이의 모든 정수의 합은 : " + res + "입니다.");
		}
		sc.close();
	}
}
