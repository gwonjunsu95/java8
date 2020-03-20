package JAVA8;

import java.util.Scanner;

public class Day0606 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("궁금하신 구구단을 입력해주세요(2~9) : ");
		
		int i = sc.nextInt();

		for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			
		
		
		sc.close();
	}
}
