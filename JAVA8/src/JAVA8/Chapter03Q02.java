package JAVA8;

import java.util.Scanner;

public class Chapter03Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("������ �Ǻ��� �⵵ �Է�! : ");
		year = sc.nextInt();
		
		if( ((year%4 ==0) && (year%100 !=0)) || (year%400 == 0)) {
			System.out.println(year + "���� �����̴�.");
		} else {
			System.out.println(year + "���� ������ �ƴϴ�.");
		}
		
		
		
		sc.close();
	}
}
