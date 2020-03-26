package JAVA8;

import java.util.Scanner;

public class Day1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자야구를 시작합니다.");
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
		System.out.print("1~9중 숫자 3개를 구분하여 입력하세요 : ");
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
				System.out.println("정답입니다!!");
				break;
			} else if(life == 0) {
				System.out.println("목숨을 모두 잃으셨습니다.");
				break;
			}
			System.out.println(strike + "strike " + ball + "ball " + out + "out 남은 목숨 : " + life);
			System.out.print("숫자를 입력하세요 : ");
		} while (com != user);
		
		sc.close();
	}
}
