package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, quiz, answer;
		
		long startTime = System.currentTimeMillis();	//1000���� 1��
//		System.out.println(startTime);
		for (int i = 0; i < 10; i++) {
			num1 = (int) (Math.random() * 8) + 2;
			num2 = rd.nextInt(9) + 1;

			quiz = num1 * num2;

			System.out.print(num1 + "x" + num2 + "= ");
			answer = sc.nextInt();

			if (quiz == answer) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.exit(0);
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.print("��������ð� : ");
		System.out.println((endTime - startTime) / 1000 + "��");
		sc.close();
	}
}
