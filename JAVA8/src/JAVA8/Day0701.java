package JAVA8;

import java.util.Scanner;

public class Day0701 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num1, num2 ;
		 System.out.println("�ΰ��� �������� ������ �Ǻ��մϴ�.");
		 System.out.print("�ΰ��� ������ �����Ͽ� �Է��ϼ��� : ");
		 
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 
		 String res = (num1 == num2 ? "Same" : "Different");
		 
		 System.out.println(res);
		 
		 
		 if(num1 == num2) {
			 System.out.println("Same");
		 } else {
			 System.out.println("Different");
		 }
		 
		 
		 
		 
		 sc.close();
	}
}
