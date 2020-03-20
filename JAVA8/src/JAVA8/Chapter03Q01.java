package JAVA8;

import java.util.Scanner;

public class Chapter03Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val;
		int resval = 0;
		System.out.print("숫자를 입력하세요! : ");
		val = sc.nextInt();
		
		while(val >0) {
			resval = resval * 10;
			resval = resval + (val % 10) ; //1의 자리 복사
			val /= 10;  //1의 자리 제거
		}
		
		System.out.println("바뀐숫자 : " + resval);
		sc.close();
	}
}
