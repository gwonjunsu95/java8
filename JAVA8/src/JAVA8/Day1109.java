package JAVA8;

import java.util.Scanner;

public class Day1109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� �� �Է��ϼ��� : ");
		int[] arr = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		System.out.println("���� �� : " + arr[0] + " ū �� : " + arr[1]);

		sc.close();

	}
}
