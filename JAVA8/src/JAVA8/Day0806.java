package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 게임을 시작합니다.");
		Random rd = new Random();
		int num1, num2, quiz, answer;
		int score = 0;

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10; i++) {
			num1 = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;
			quiz = num1 * num2;
			
			System.out.print(num1 + "x" + num2 + "=");
			answer = sc.nextInt();

			if (answer == quiz) {
				score += 10;
				System.out.println("정답입니다. 점수 : " + score);
			} else {
				System.out.println("틀렸습니다. 점수 : " + score);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.print("총 소요된 시간은 ");
		System.out.println((end - start)/1000 + "초 입니다.");
		System.out.println("최종 점수는(100점 만점) : " + score + "점 입니다.");
		
		sc.close();
	}
}
