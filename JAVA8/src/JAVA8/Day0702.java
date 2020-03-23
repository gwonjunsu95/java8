package JAVA8;

import java.util.Scanner;

public class Day0702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자가 홀수인지 판별합니다.");
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 !=0) {
			System.out.println("입력하신 숫자 : "+ num + "은(는) 홀수입니다.");
		} else {
			System.out.println("입력하신 숫자 : "+ num + "은(는) 짝수입니다.");
		}
		
		String res = num % 2 != 0 ? "홀수" : "짝수" ;
		System.out.println("입력하신 숫자 : "+ num + "은(는) "+ res + "입니다.");
		
		
		
		
		
		
		
		
		sc.close();
	}
}
