package JAVA8;

import java.util.Scanner;

public class Chapter03Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val;
		int resval = 0;
		System.out.print("���ڸ� �Է��ϼ���! : ");
		val = sc.nextInt();
		
		while(val >0) {
			resval = resval * 10;
			resval = resval + (val % 10) ; //1�� �ڸ� ����
			val /= 10;  //1�� �ڸ� ����
		}
		
		System.out.println("�ٲ���� : " + resval);
		sc.close();
	}
}
