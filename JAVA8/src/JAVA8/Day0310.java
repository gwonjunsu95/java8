package JAVA8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수도입니까?(수도: 1,수도아님: 0) -");
		int capital = sc.nextInt();
		boolean isCapital = capital == 0 ? false : true; 
				
		System.out.print("인구(단위: 만) -");
		int citizens = sc.nextInt();
		
		System.out.print("부자의 수 (단위: 만) -");
		int riches = sc.nextInt();
		
		boolean isMetro1 = isCapital && (citizens >= 100);
		boolean isMetro2 = riches >= 50;
		
		boolean isMetro = isMetro1 || isMetro2;
		System.out.print("매트로폴리스 여부: " + isMetro);
		sc.close();
	}

}
