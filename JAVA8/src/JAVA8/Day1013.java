package JAVA8;

import java.util.Scanner;

public class Day1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�");
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"��° ������ �Է��ϼ���: ");
			arr[i] =sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("�ִ밪: "+ max);
		
		/*
		int a, b, c, d, e;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		if (a > b && a > c && a > d && a > e) {
			System.out.println("�Է��Ͻ� ������ : " + a + "," + b + "," + c + "," + d + "," + e + "�̸� �ִ밪�� : " + a + "�Դϴ�.");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("�Է��Ͻ� ������ : " + a + "," + b + "," + c + "," + d + "," + e + "�̸� �ִ밪�� : " + b + "�Դϴ�.");
		} else if (c > b && c > a && c > d && c > e) {
			System.out.println("�Է��Ͻ� ������ : " + a + "," + b + "," + c + "," + d + "," + e + "�̸� �ִ밪�� : " + c + "�Դϴ�.");
		} else if (d > b && d > c && d > a && d > e) {
			System.out.println("�Է��Ͻ� ������ : " + a + "," + b + "," + c + "," + d + "," + e + "�̸� �ִ밪�� : " + d + "�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ : " + a + "," + b + "," + c + "," + d + "," + e + "�̸� �ִ밪�� : " + e + "�Դϴ�.");
		}
		*/
		sc.close();
	}
}
