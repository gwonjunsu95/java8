package JAVA8;

import java.util.Scanner;

public class Day0202 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1, number2;
		int result;
		
		System.out.println("number1과 number2의값을 차례대로 입력해주세요.");
		System.out.println("공백이나 엔터키로 값을 구분해 주세요.");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		result = number1+number2;
		System.out.print("두 값의 합계는");
		System.out.print(result);
		System.out.println("입니다.");
		sc.close();
		
	}
}
