package JAVA8;

import java.util.Scanner;

public class Day0711 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄을 출력하시겠습니까? : ");
		int line = sc.nextInt();
		
		for(int i = 0; i <= line; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		sc.close();
	}
}
