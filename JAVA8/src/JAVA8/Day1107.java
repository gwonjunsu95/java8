package JAVA8;

import java.util.Scanner;

public class Day1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int user = sc.nextInt();
		int num = 0;
		int sum = 0;

		for (int i = 1; i <= user; i++) {
			if (i % 5 == 0) {
				sum += i;
				num += 1;
			}
		}
		System.out.println("�Է°� : " + user + " 5�� ����� ���� :" + num + " 5�� ����� �� : " + sum);

		sc.close();
	}
}
