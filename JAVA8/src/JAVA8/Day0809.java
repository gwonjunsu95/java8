package JAVA8;

import java.util.Scanner;

public class Day0809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터의 숫자를 맞히는 게임입니다.");
		System.out.println("컴퓨터는 1~100의 숫자를 갖게됩니다.");
		int com = (int) (Math.random() * 100) + 1;
		while (true) {
		System.out.print("숫자를 입력하세요 : ");
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
