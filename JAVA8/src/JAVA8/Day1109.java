package JAVA8;

import java.util.Scanner;

public class Day1109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 두 개 입력하세요 : ");
		int[] arr = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		System.out.println("작은 값 : " + arr[0] + " 큰 값 : " + arr[1]);

		sc.close();

	}
}
