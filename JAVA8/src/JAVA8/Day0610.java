package JAVA8;

import java.util.Scanner;

public class Day0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		String inputString;
		
		
		do {
			System.out.print("> ");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		System.out.println();
		System.out.println("���α׷� ����");
		
		sc.close();
	}
}
