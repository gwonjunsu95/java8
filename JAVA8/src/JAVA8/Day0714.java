package JAVA8;

import java.util.Scanner;

public class Day0714 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까?(홀수로 입력해주세요.) : ");
		int line = sc.nextInt();
		
		if(line % 2 !=0) {
		for(int i = 0; i <= line/2+1; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for(int i = line/2+1; i > 0; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		} else  {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		System.out.println();
		
		int up = line / 2;
		int down = line - up;
		
		for(int i = 0; i < up; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		for(int i = down; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
