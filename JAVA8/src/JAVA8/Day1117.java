package JAVA8;

import java.util.Scanner;

public class Day1117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� ������ �����մϴ�.");
		System.out.print("1 =���� 2 = ���� 3 = �� 4 = ���� :");
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String us = "";
		String co = "";
		int life = 3;
		int score = 0;
		
		while (true) {
			int user = sc.nextInt();
			int com = (int) (Math.random() * 3 + 1);

			if (user == 1) {
				us = ga;
			} else if (user == 2) {
				us = ba;
			} else if (user == 3) {
				us = bo;
			} else if (user == 4) {
				System.out.println("������ �����մϴ�.");
				System.out.println("���� ����: "+score);
				System.exit(0);
			} else {
				System.out.println("�� �� �Է� �ϼ̽��ϴ�.");
			}

			if (com == 1) {
				co = ga;
			} else if (com == 2) {
				co = ba;
			} else if (com == 3) {
				co = bo;
			}

			if ((co == ga && us == ba) || (co == ba && us == bo) || (co == bo && us == ga)) {
				score += 10;
				System.out.println("�����!! ���: " + us + " ��ǻ��: " + co);
				System.out.println("����: "+score + " ���� ���: " + life);
			} else if (co == us) {
				score += 5;
				System.out.println("���º�!! ���: " + us + " ��ǻ��: " + co);
				System.out.println("����: "+score + " ���� ���: " + life);
			} else {
				life--;
				System.out.println("��ǻ�ͽ�!! ���: " + us + " ��ǻ��: " + co);
				System.out.println("����: "+score + " ���� ���: " + life);
			}

			if (life == 0) {
				System.out.println();
				System.out.println("����� ��� ����ϼ̽��ϴ�.");
				System.out.println("���� ����: "+score);
				break;
			}

		}

		sc.close();
	}
}
