package JAVA8;

import java.util.Scanner;

public class Chapter02Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���簢���� ���ο� ���θ� �Է��ϼ��� : ");
		int w = 0;
		int h = 0;
		w = sc.nextInt();
		h = sc.nextInt();
		int res1 = w * h;
		int res2 = (w + h) * 2;
//		double res3 = Math.sqrt((w * w) + (h * h));	//������ ���ϱ�	
//		double res4 = Math.pow(w, 5);				//���� �ϱ�
		System.out.println("�簢���� ���̴� " + res1 +"�Դϴ�.");
		System.out.println("�簢���� �ѷ��� " + res2 +"�Դϴ�.");
//		System.out.println("�밢���� ���̴� " + res3 +"�Դϴ�.");
//		System.out.println(res4);
		
		sc.close();
	}
}
