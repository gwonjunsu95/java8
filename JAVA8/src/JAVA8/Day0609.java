package JAVA8;

import java.util.Scanner;

public class Day0609 {
	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int life = 3;
		
		
		while (true) {
			// ����Է� ������ ��������
			System.out.print("���� ���� �� �� �ϳ��� �����ϼ���.(����=a, ����=b, ��=c, ����=q):");
			user = sc.next();

			switch (user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "b":
			case "B":
				user = ba;
				break;
			case "c":
			case "C":
				user = bo;
				break;
			case "Q":
			case "q":
				user = "quit";
				break;
			default:
				user = "error";
			}
			
			if (user == "error") {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�, ������ �����ϰڽ��ϴ�.");
				System.exit(0);
			} else if (user == "quit") {
				System.out.println("������ �����ϰڽ��ϴ�.");
				break;
			}

			int num = (int) (Math.random() * 3);
			switch (num) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}
//		com.equals(ga); String�� �ڷᰡ ������ Ȯ���Ҷ����.
			if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
					|| (user.equals(bo) && com.equals(ba))) {
				System.out.println("�����! ���:" + user + ", ��ǻ��:" + com);
				score += 10;
			} else if (user.equals(com)) {
				System.out.println("�����ϴ�! ���:" + user + ", ��ǻ��:" + com);
				score += 1;
			} else {
				System.out.println("��ǻ�ͽ�! ���:" + user + ", ��ǻ��:" + com);
				life -= 1;
			}
			System.out.println("���� ���� : " + score + "���� ������ : " + life );
			System.out.println();
			
			if(life == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
		}
//		System.out.println("������ ����Ǿ����ϴ�.");
		sc.close();
	}
}