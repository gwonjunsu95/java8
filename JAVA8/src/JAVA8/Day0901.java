package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̷ο� ������ �����մϴ�. (1~100)");
		Random rd = new Random();
		int com = rd.nextInt(100) + 1;
		int user = 0;
		int cnt = 0;
		
		
		long start =System.currentTimeMillis();
		
		while (true) {
			
			do {
				if (user != 0) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				System.out.print("���ڸ� �Է��ϼ��� : ");
				user = sc.nextInt();
			} while (user < 1 || user > 100);

			
			cnt++;
			if (com == user) {
				System.out.println("�����Դϴ�." + cnt + "ȸ �Է��Ͽ����ϴ�.");
				break;
			} else if (com > user) {
				System.out.println("up " + cnt + "ȸ �Է��Ͽ����ϴ�");
			} else if (com < user) {
				System.out.println("down " + cnt + "ȸ �Է��Ͽ����ϴ�");
			}

			if (cnt == 10) {
				System.out.println("���� ������ 0���Դϴ�. ������ �����մϴ�.");
				System.exit(0);
			}

		}
		
		
		long end = System.currentTimeMillis();
		long playTime = (end - start)/1000;
		double score = (int)((60 - playTime)/ 0.6);
		System.out.println("�÷��� �ð��� : " + playTime + "�� �̸� ���������� : " + score + "�� �Դϴ�.");
		
		sc.close();
	}
}
