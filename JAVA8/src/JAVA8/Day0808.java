package JAVA8;

import java.util.Scanner;

public class Day0808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �ִ������� �ּ� ������� ����մϴ�.");
		System.out.print("�� ���� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res1 = 0;
		int res2 = 0;

		for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				res1 = i;
				break;
			}
		}
		res2 = (num1*num2) / res1;
		System.out.println("�ּ� ����� = " + res1 + " �ִ� ����� = " + res2);

		sc.close();
	}
}
