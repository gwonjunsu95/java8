package JAVA8;

import java.util.Scanner;

public class Day1114 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("������ �Է��ϼ���: ");
		int price =sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		int amount = sc.nextInt();
		int res1 = price * amount;
		
		System.out.println("��ǰ �ܰ� : " + price + " ��ǰ ���� :"+ amount );
		
		int sale = 0;
		if(res1 >=1_000_000) {
			price *= 0.6;
			sale =40;
		} else if (res1 >= 500_000) {
			price *= 0.7;
			sale = 30;
		} 
		System.out.println("������ : "+ sale + "%");
		System.out.println("���ұݾ� : " + price * amount);
		
		
		
		
		sc.close();
	}
}
