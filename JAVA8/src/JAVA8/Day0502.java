package JAVA8;

import java.util.Scanner;

public class Day0502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnumber = 0;
		System.out.println("Ȧ���� ¦���� �Ǻ��ϴ� ���α׷� �Դϴ�.");
		System.out.println("���ڸ� �Է��� �ּ���:");
		inputnumber = sc.nextInt();
		
		String result = ""; 
		
		if(inputnumber % 2 == 0) {	
			result = "¦��";
			System.out.println("¦������ �Ǻ����Դϴ�.");
		} else {
			result = "Ȧ��";
			System.out.println("Ȧ������ �Ǻ����Դϴ�.");
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� " + inputnumber +"�̰�, �� ���ڴ� "
							+ result + "�Դϴ�.");
		
		
		sc.close();
	}
}
