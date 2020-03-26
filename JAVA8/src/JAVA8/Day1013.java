package JAVA8;

import java.util.Scanner;

public class Day1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력받아 최대값을 구하는 프로그램");
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1+"번째 정수를 입력하세요: ");
			arr[i] =sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max < num) {
				max = num;
			}
		}
		System.out.println("최대값: "+ max);
		
		/*
		int a, b, c, d, e;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		if (a > b && a > c && a > d && a > e) {
			System.out.println("입력하신 정수는 : " + a + "," + b + "," + c + "," + d + "," + e + "이며 최대값은 : " + a + "입니다.");
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println("입력하신 정수는 : " + a + "," + b + "," + c + "," + d + "," + e + "이며 최대값은 : " + b + "입니다.");
		} else if (c > b && c > a && c > d && c > e) {
			System.out.println("입력하신 정수는 : " + a + "," + b + "," + c + "," + d + "," + e + "이며 최대값은 : " + c + "입니다.");
		} else if (d > b && d > c && d > a && d > e) {
			System.out.println("입력하신 정수는 : " + a + "," + b + "," + c + "," + d + "," + e + "이며 최대값은 : " + d + "입니다.");
		} else {
			System.out.println("입력하신 정수는 : " + a + "," + b + "," + c + "," + d + "," + e + "이며 최대값은 : " + e + "입니다.");
		}
		*/
		sc.close();
	}
}
