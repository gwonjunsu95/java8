package JAVA8;

import java.util.Scanner;

public class Chapter0203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		int a, p;
		System.out.print("�ʺ� �Է��� �ּ���:");
		w = sc.nextInt();
		System.out.print("���̸� �Է��� �ּ���:");
		h = sc.nextInt();
//		w = width h= height a = area p = perimeter
		a = w * h ;
		p = 2 * (w +h);
		
		System.out.println("�簢���� ����:" + a);
		System.out.println("�簢���� �ѷ�:" + p);
		
		sc.close();
	}
}
