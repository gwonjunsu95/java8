package JAVA8;

import java.util.Scanner;

public class Day1112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("�⼮, ����, �߰����, �⸻��� ������ ������� �Է��ϼ���(100������) : ");
		int a = 0, b = 0, c = 0, d = 0;
		char grade;
		
		do {
			if (a < 0 || a > 100) {
				System.out.println("�Է� ������ �ʰ��ϼ̽��ϴ�.");
			}
			System.out.print("�⼮ ������ �Է��ϼ��� : ");
			a = sc.nextInt();
		} while (a < 0 || a > 100);

		do {
			if (b < 0 || b > 100) {
				System.out.println("�Է� ������ �ʰ��ϼ̽��ϴ�.");
			}
			System.out.print("���� ������ �Է��ϼ��� : ");
			b = sc.nextInt();
		} while (b < 0 || b > 100);

		do {
			if (c < 0 || c > 100) {
				System.out.println("�Է� ������ �ʰ��ϼ̽��ϴ�.");
			}
			System.out.print("�߰���� ������ �Է��ϼ��� : ");
			c = sc.nextInt();
		} while (c < 0 || c > 100);

		do {
			if (d < 0 || d > 100) {
				System.out.println("�Է� ������ �ʰ��ϼ̽��ϴ�.");
			}
			System.out.print("�⸻��� ������ �Է��ϼ��� : ");
			d = sc.nextInt();
		} while (d < 0 || d > 100);

		int score = (int) (a / 5 + b / 5 + c / 10 * 3 + d / 10 * 3);
		System.out.println("������" + score + " �Դϴ�.");
		
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
		
		System.out.println("����� ������ "+ grade +" �Դϴ�.");

//		int res;
//		int[] arr = new int[4];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		res = (arr[0] / 5) + (arr[1] / 5) + (arr[2] / 10 * 3) + (arr[3] / 10 * 3);
//
//		if (res >= 90) {
//			System.out.println("A����");
//		} else if (res >= 80) {
//			System.out.println("B����");
//		} else if (res >= 70) {
//			System.out.println("C����");
//		} else if (res >= 60) {
//			System.out.println("D����");
//		} else {
//			System.out.println("F����");
//		}
//		

		sc.close();
	}
}
