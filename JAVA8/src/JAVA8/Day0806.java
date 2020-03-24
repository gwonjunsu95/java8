package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �����մϴ�.");
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
				System.out.println("�����Դϴ�. ���� : " + score);
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�. ���� : " + score);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.print("�� �ҿ�� �ð��� ");
		System.out.println((end - start)/1000 + "�� �Դϴ�.");
		System.out.println("���� ������(100�� ����) : " + score + "�� �Դϴ�.");
		
		sc.close();
	}
}
