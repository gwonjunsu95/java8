package JAVA8;

import java.util.Scanner;

public class Day0713 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
		int line = sc.nextInt();
		
		for (int i = 1; i <= line; i++) {
			for (int j = line; j >= i; j--) {
				if (j % 2 ==0) {
					System.out.print("$");
				} else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
