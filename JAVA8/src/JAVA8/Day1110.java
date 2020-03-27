package JAVA8;

import java.util.Scanner;

public class Day1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요 : ");
		int[] arr = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr[0] * arr[1] > 500) {
			System.out.println("곱이 500이상입니다. 출력이 불가능합니다.");
			System.exit(0);
		} else {
			int res = arr[0] * arr[1];
			System.out.println("두 정수의 곱은 :" + res + " 입니다.");
		}

		sc.close();
	}
}
