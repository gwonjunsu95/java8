package JAVA8;

import java.util.Scanner;

public class Day1108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > y) {
			System.out.println("입력하신 정수는 : " + x + "," + y + "입니다.");
			System.out.println("이중 큰값은 : " + x + " 작은 값은 : " + y + "입니다.");
		} else {
			System.out.println("입력하신 정수는 : " + x + "," + y + "입니다.");
			System.out.println("이중 큰값은 : " + y + " 작은 값은 : " + x + "입니다.");
		}

		sc.close();
	}
}
