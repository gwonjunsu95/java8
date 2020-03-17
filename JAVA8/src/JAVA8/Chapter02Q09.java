package JAVA8;

import java.util.Scanner;

public class Chapter02Q09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수 N과 M을 입력해주세요.");
		int n , m ;
		int temp;
		System.out.print("입력 N : ");
		n = sc.nextInt();
		System.out.print("입력 M : ");
		m = sc.nextInt();
		
		System.out.println("교환전: N =" + n + "  M = " + m);
		
		/* swap코드 (n = 10, m = 20으로 가정) */
//		n = m;
//		m = n;
		temp = n;
		n = m;
		m = temp;
		
		System.out.println("교환후: N =" + n + "  M = " + m);
		
		sc.close();
	}
}
