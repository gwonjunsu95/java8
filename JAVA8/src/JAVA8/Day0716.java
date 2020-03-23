package JAVA8;

import java.util.Scanner;

public class Day0716 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 할 구구단을 입력하세요(2~9) : ");
//		int res = 0;
//		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				res = i*j;
//				System.out.print(j + "x" + i + "=" + res + " ");
//			}
//			System.out.println();
//		}
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
				System.out.println(num + "x" + i + "=" + (num * i));
		}
		System.out.println();
		
		
		sc.close();
	}
}
