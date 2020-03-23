package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("1 = 가위 2 = 바위 3 = 보 4 = 종료입니다.");
		System.out.print("숫자를 입력해주세요 : ");
		String user = "";
		final String ga = "가위";
		final String ba = "바위";
		final String bo = "보";
		String com = "";
		int scr = 0;
		int life = 3;
		
		while(true) {
		do {
			int temp = sc.nextInt();
			switch(temp) {
				case 1 :
					user = ga;
					break;
				case 2 :
					user = ba;
					break;
				case 3 :
					user = bo;
					break;
				case 4 :
					System.out.println("4번을 선택하여 프로그램을 종료합니다.");
					user = "quit";
					System.exit(0);
				default :
					System.out.println("잘못입력하셨습니다");
			}
		} while(user == "");
		Random rd = new Random();
		int temp1 = rd.nextInt(3);
		switch(temp1) {
			case 0 :
				com = ga;
				break;
			case 1 :
				com = ba;
				break;
			case 2 :
				com = bo;
				break;
		}
		
		if((com.equals(ga) && user.equals(ba))|| (com.equals(ba) && user.equals(bo))||(com.equals(bo) && user.equals(ga))) {
			scr += 100;
			System.out.println("사람 승!! 사람 :" + user + " 컴퓨터 :" + com);
			System.out.println("현재점수 : " + scr + " 남은 생명 : " + life);
		} else if((com.equals(ga) && user.equals(bo))|| (com.equals(ba) && user.equals(ga))||(com.equals(bo) && user.equals(ba))) {
			life--; 
			System.out.println("컴퓨터 승!! 사람 :" + user + " 컴퓨터 :" + com);
			System.out.println("현재점수 : " + scr + " 남은 생명 : " + life);
		} else {
			scr += 10;
			System.out.println("비겼습니다!! 사람 :" + user + " 컴퓨터 :" + com);
			System.out.println("현재점수 : " + scr + " 남은 생명 : " + life);
		}
		
		}
		if(life == 0) {
			System.out.println("게임을 종료합니다.");
			System.exit(0);
		}
		
	}
}
