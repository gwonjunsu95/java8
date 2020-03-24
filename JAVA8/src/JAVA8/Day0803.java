package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		long startTime = System.currentTimeMillis();	//1000분의 1초
//		System.out.println(startTime);
		for (int i = 0; i < 10; i++) {
			num1 = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;

			quiz = num1 * num2;

			System.out.print(num1 + "x" + num2 + "= ");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
				System.exit(0);
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.print("게임진행시간 : ");
		System.out.println((endTime - startTime) / 1000 + "초");
		sc.close();
	}
}
