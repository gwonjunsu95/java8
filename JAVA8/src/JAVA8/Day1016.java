package JAVA8;

import java.util.Scanner;

public class Day1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ھ߱��� �����մϴ�.");
		int[] com = new int[3];
		int[] user = new int[3];
		int life = 11;

		do {
		do {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1;
			}
		} while (com[0] == com[1]);
		} while (com[2] == com[0] || com[2]==com[1]);

		System.out.println(com[0]);
		System.out.println(com[1]);
		System.out.println(com[2]);
		System.out.print("1~9�� ���� 3���� �����Ͽ� �Է��ϼ��� : ");
		do {
			int strike = 0;
			int ball = 0;
			int out = 0;
			life -= 1;
			for (int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
				if (com[i] == user[i]) {
					strike += 1;
				} else if (com[0] == user[i] || com[1] == user[i] || com[2] == user[i]) {
					ball += 1;
				} else {
					out += 1;
				}
			}
			if(strike == 3) {
				System.out.println("�����Դϴ�!!");
				break;
			} else if(life == 0) {
				System.out.println("����� ��� �����̽��ϴ�.");
				break;
			}
			System.out.println(strike + "strike " + ball + "ball " + out + "out ���� ��� : " + life);
			System.out.print("���ڸ� �Է��ϼ��� : ");
		} while (com != user);
		
		sc.close();
	}
}
