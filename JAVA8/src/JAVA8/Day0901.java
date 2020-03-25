package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하이로우 게임을 시작합니다. (1~100)");
		Random rd = new Random();
		int com = rd.nextInt(100) + 1;
		int user = 0;
		int cnt = 0;
		
		
		long start =System.currentTimeMillis();
		
		while (true) {
			
			do {
				if (user != 0) {
					System.out.println("잘못 입력하셨습니다.");
				}
				System.out.print("숫자를 입력하세요 : ");
				user = sc.nextInt();
			} while (user < 1 || user > 100);

			
			cnt++;
			if (com == user) {
				System.out.println("정답입니다." + cnt + "회 입력하였습니다.");
				break;
			} else if (com > user) {
				System.out.println("up " + cnt + "회 입력하였습니다");
			} else if (com < user) {
				System.out.println("down " + cnt + "회 입력하였습니다");
			}

			if (cnt == 10) {
				System.out.println("최종 점수는 0점입니다. 게임을 종료합니다.");
				System.exit(0);
			}

		}
		
		
		long end = System.currentTimeMillis();
		long playTime = (end - start)/1000;
		double score = (int)((60 - playTime)/ 0.6);
		System.out.println("플레이 시간은 : " + playTime + "초 이며 최종점수는 : " + score + "점 입니다.");
		
		sc.close();
	}
}
