package JAVA8;

import java.util.Scanner;

public class Day0802 {

	public static void main(String[] args) {
		/*
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello, world " + i);
		}
		System.out.println();
		
		for(int i = 9; i >= 0; i--) {
			System.out.println("Hello, world " + i);
		}
		System.out.println();
		
		for(int i = 0; i < 7; i++) {
			System.out.println("@@@@@");
		}
		System.out.println();
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 7; i++) {
				System.out.println("@#@#@");
		}
		System.out.println();
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j <5; j++) {
				if(j % 2 == 0) {
					System.out.print("@");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��� �ּ���.");
		System.out.print("�Է� > ");
		String str = sc.nextLine();
//		���ڿ��� for������ ����ϱ�
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		/*
		for(int i = 0; i < 0; i++) {
			for(int j = 0; j < 0; j++) {
				
			}
		}
		System.out.println();
		*/
		
		sc.close();
	}
}
