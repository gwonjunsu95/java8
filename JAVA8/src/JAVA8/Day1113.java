package JAVA8;

import java.util.Scanner;

public class Day1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ�� �ܰ��� ������ �Է��ϼ��� : ");
		int cost = sc.nextInt();
		int cnt = sc.nextInt();
		int res = cost * cnt;
		int sell = 0;
		if (res >= 1_000_000) {
			sell = res - (res / 10 * 4);
			System.out.println("��ǰ�� �ܰ� : " + cost + "��ǰ�� ���� : " + cnt);
			System.out.println("���� �ݾ��� : " + (sell * cnt) +"�� �̸� �������� 40%�Դϴ�.");
		} else if (res >= 500_000) {
			sell = res - (res / 10 * 3);
			System.out.println("��ǰ�� �ܰ� : " + cost + "��ǰ�� ���� : " + cnt);
			System.out.println("���� �ݾ��� : " + (sell * cnt) +"�� �̸� �������� 30%�Դϴ�.");
		} else {
			System.out.println("��ǰ�� �ܰ� : " + cost + "��ǰ�� ���� : " + cnt);
			System.out.println("���� �ݾ��� : " + res +"�� �̸� ������ �����ϴ�.");
		}

		sc.close();
	}
}
