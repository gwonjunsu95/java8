package JAVA8;

import java.util.Scanner;

public class Day1112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("출석, 과제, 중간고사, 기말고사 점수를 순서대로 입력하세요(100점기준) : ");
		int a = 0, b = 0, c = 0, d = 0;
		char grade;
		
		do {
			if (a < 0 || a > 100) {
				System.out.println("입력 범위를 초과하셨습니다.");
			}
			System.out.print("출석 점수를 입력하세요 : ");
			a = sc.nextInt();
		} while (a < 0 || a > 100);

		do {
			if (b < 0 || b > 100) {
				System.out.println("입력 범위를 초과하셨습니다.");
			}
			System.out.print("과제 점수를 입력하세요 : ");
			b = sc.nextInt();
		} while (b < 0 || b > 100);

		do {
			if (c < 0 || c > 100) {
				System.out.println("입력 범위를 초과하셨습니다.");
			}
			System.out.print("중간고사 점수를 입력하세요 : ");
			c = sc.nextInt();
		} while (c < 0 || c > 100);

		do {
			if (d < 0 || d > 100) {
				System.out.println("입력 범위를 초과하셨습니다.");
			}
			System.out.print("기말고사 점수를 입력하세요 : ");
			d = sc.nextInt();
		} while (d < 0 || d > 100);

		int score = (int) (a / 5 + b / 5 + c / 10 * 3 + d / 10 * 3);
		System.out.println("총점은" + score + " 입니다.");
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 "+ grade +" 입니다.");

//		int res;
//		int[] arr = new int[4];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		res = (arr[0] / 5) + (arr[1] / 5) + (arr[2] / 10 * 3) + (arr[3] / 10 * 3);
//
//		if (res >= 90) {
//			System.out.println("A학점");
//		} else if (res >= 80) {
//			System.out.println("B학점");
//		} else if (res >= 70) {
//			System.out.println("C학점");
//		} else if (res >= 60) {
//			System.out.println("D학점");
//		} else {
//			System.out.println("F학점");
//		}
//		

		sc.close();
	}
}
