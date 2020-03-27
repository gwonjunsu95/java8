package JAVA8;

import java.util.Scanner;

public class Day1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 정수를 입력하세요 : ");
		int user = sc.nextInt();
		int num = 0;
		int sum = 0;

		for (int i = 1; i <= user; i++) {
			if (i % 5 == 0) {
				sum += i;
				num += 1;
			}
		}
		System.out.println("입력값 : " + user + " 5의 배수의 개수 :" + num + " 5의 배수의 합 : " + sum);

		sc.close();
	}
}
