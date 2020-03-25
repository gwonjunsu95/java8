package JAVA8;

import java.util.Scanner;

public class Day0902 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까 (홀수입력) : ");
		int line = sc.nextInt();
		*/
		
		/*
		int up = line / 2;
		int down = line - up;

		if (line % 2 != 0) {
			for (int i = 0; i < up; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int i = down; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		*/
		
		/*
		for (int i = 0; i < line; i++) {
			for (int j = line - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i = line; i > 0; i--) {
			for (int j = 0; j <= line; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			for (int j = line; j > i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		*/
		
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("@");
			}
			for(int j = 0; j < 4 - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 4 - i; j++) {
				System.out.print("@");
			}
			for(int j = 0; j < 3 - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		
		/*
		sc.close();
		*/
	}
}
