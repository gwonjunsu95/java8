package JAVA8;

import java.util.Scanner;

public class Day1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 실행합니다.");
		System.out.print("1 =가위 2 = 바위 3 = 보 4 = 종료 :");
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String us = "";
		String co = "";
		int life = 3;
		int score = 0;
		
		while (true) {
			int user = sc.nextInt();
			int com = (int) (Math.random() * 3 + 1);

			if (user == 1) {
				us = ga;
			} else if (user == 2) {
				us = ba;
			} else if (user == 3) {
				us = bo;
			} else if (user == 4) {
				System.out.println("게임을 종료합니다.");
				System.out.println("최종 점수: "+score);
				System.exit(0);
			} else {
				System.out.println("잘 못 입력 하셨습니다.");
			}

			if (com == 1) {
				co = ga;
			} else if (com == 2) {
				co = ba;
			} else if (com == 3) {
				co = bo;
			}

			if ((co == ga && us == ba) || (co == ba && us == bo) || (co == bo && us == ga)) {
				score += 10;
				System.out.println("사람승!! 사람: " + us + " 컴퓨터: " + co);
				System.out.println("점수: "+score + " 남은 목숨: " + life);
			} else if (co == us) {
				score += 5;
				System.out.println("무승부!! 사람: " + us + " 컴퓨터: " + co);
				System.out.println("점수: "+score + " 남은 목숨: " + life);
			} else {
				life--;
				System.out.println("컴퓨터승!! 사람: " + us + " 컴퓨터: " + co);
				System.out.println("점수: "+score + " 남은 목숨: " + life);
			}

			if (life == 0) {
				System.out.println();
				System.out.println("목숨을 모두 사용하셨습니다.");
				System.out.println("최종 점수: "+score);
				break;
			}

		}

		sc.close();
	}
}
