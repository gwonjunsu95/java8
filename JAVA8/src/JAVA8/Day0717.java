package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1 = ���� 2 = ���� 3 = �� 4 = �����Դϴ�.");
		System.out.print("���ڸ� �Է����ּ��� : ");
		String user = "";
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		String com = "";
		int scr = 0;
		int life = 3;
		
		while(true) {
		do {
			int temp = sc.nextInt();
			switch(temp) {
				case 1 :
					user = ga;
					break;
				case 2 :
					user = ba;
					break;
				case 3 :
					user = bo;
					break;
				case 4 :
					System.out.println("4���� �����Ͽ� ���α׷��� �����մϴ�.");
					user = "quit";
					System.exit(0);
				default :
					System.out.println("�߸��Է��ϼ̽��ϴ�");
			}
		} while(user == "");
		Random rd = new Random();
		int temp1 = rd.nextInt(3);
		switch(temp1) {
			case 0 :
				com = ga;
				break;
			case 1 :
				com = ba;
				break;
			case 2 :
				com = bo;
				break;
		}
		
		if((com.equals(ga) && user.equals(ba))|| (com.equals(ba) && user.equals(bo))||(com.equals(bo) && user.equals(ga))) {
			scr += 100;
			System.out.println("��� ��!! ��� :" + user + " ��ǻ�� :" + com);
			System.out.println("�������� : " + scr + " ���� ���� : " + life);
		} else if((com.equals(ga) && user.equals(bo))|| (com.equals(ba) && user.equals(ga))||(com.equals(bo) && user.equals(ba))) {
			life--; 
			System.out.println("��ǻ�� ��!! ��� :" + user + " ��ǻ�� :" + com);
			System.out.println("�������� : " + scr + " ���� ���� : " + life);
		} else {
			scr += 10;
			System.out.println("�����ϴ�!! ��� :" + user + " ��ǻ�� :" + com);
			System.out.println("�������� : " + scr + " ���� ���� : " + life);
		}
		
		}
		if(life == 0) {
			System.out.println("������ �����մϴ�.");
			System.exit(0);
		}
		
	}
}
