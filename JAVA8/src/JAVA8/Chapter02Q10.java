package JAVA8;

import java.util.Scanner;

public class Chapter02Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 a,b중 큰수를 출력합니다.");
		int a , b;
		System.out.print("입력 a : ");
		a = sc.nextInt();
		System.out.print("입력 b : ");
		b = sc.nextInt();
		
		String stra =  "a(" + a +")";
		String strb =  "b(" + b +")";
		System.out.println("입력 : " + stra + "," + strb );
		
		String res = a >= b ? stra : strb;
		System.out.println("결과 : " + res);
		
		
		sc.close();
	}
}
