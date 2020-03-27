package JAVA8;

import java.util.Scanner;

public class Day1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		while (true) {
			System.out.print("두개의 정수를 입력해주세요 : ");
			x = sc.nextInt();
			y = sc.nextInt();

			res = x * y;
			System.out.println("두 정수의 곱은 : " + res + " 입니다.");

			if (res > 500) {
				break;
			}
		}
		sc.close();
	}
}
