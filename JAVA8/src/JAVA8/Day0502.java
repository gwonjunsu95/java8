package JAVA8;

import java.util.Scanner;

public class Day0502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputnumber = 0;
		System.out.println("홀수와 짝수를 판별하는 프로그램 입니다.");
		System.out.println("숫자를 입력해 주세요:");
		inputnumber = sc.nextInt();
		
		String result = ""; 
		
		if(inputnumber % 2 == 0) {	
			result = "짝수";
			System.out.println("짝수인지 판별중입니다.");
		} else {
			result = "홀수";
			System.out.println("홀수인지 판별중입니다.");
		}
		
		System.out.println("입력하신 숫자는 " + inputnumber +"이고, 이 숫자는 "
							+ result + "입니다.");
		
		
		sc.close();
	}
}
