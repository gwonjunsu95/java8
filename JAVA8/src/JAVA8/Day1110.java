package JAVA8;

import java.util.Scanner;

public class Day1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int[] arr = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		if (arr[0] * arr[1] > 500) {
			System.out.println("���� 500�̻��Դϴ�. ����� �Ұ����մϴ�.");
			System.exit(0);
		} else {
			int res = arr[0] * arr[1];
			System.out.println("�� ������ ���� :" + res + " �Դϴ�.");
		}

		sc.close();
	}
}
