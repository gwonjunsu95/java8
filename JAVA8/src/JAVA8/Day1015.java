package JAVA8;

import java.util.Scanner;

public class Day1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kimbab = 2000;
		final int dduk = 2000;
		final int odeng = 500;
		final int sundae = 2000;
		int a,b,c,d;
		
		System.out.println("영남분식입니다. 메뉴는 다음과 같습니다.");
		System.out.println("김밥 1줄 : 2000원, 떡볶이 1인분 : 2000원");
		System.out.println("오뎅 1개 : 500원, 순대 1인분 2000원");
		System.out.println("김밥 떡볶이 오뎅 순대 순으로 입력해주세요.");
		
		System.out.print("김밥은 몇 줄 구매하시겠습니까?");
		a = sc.nextInt();
		System.out.print("떡볶이는 몇 인분 구매하시겠습니까?");
		b = sc.nextInt();
		System.out.print("오뎅은 몇 개 구매하시겠습니까?");
		c = sc.nextInt();
		System.out.print("순대는 몇 인분 구매하시겠습니까?");
		d = sc.nextInt();
		System.out.println();
		
		
		System.out.println("김밥은 " + a + "줄 주문하셨습니다.");
		System.out.println("김밥 : " + kimbab * a);
		System.out.println("떡볶이는 " + b + "인분 주문하셨습니다.");
		System.out.println("떡볶이 : " + kimbab * b);
		System.out.println("오뎅은 " + c + "개 주문하셨습니다.");
		System.out.println("오뎅 : " + odeng * c);
		System.out.println("순대는 " + d + "인분 주문하셨습니다.");
		System.out.println("순대 : " + kimbab * d);
		System.out.println();
		
		System.out.println("총 금액 : " + (kimbab * a + kimbab * b+kimbab * d+odeng * c));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] arr = new int[] {2000,2000,500,2000};
//		String[] arr2 = new String[] {"김밥 1줄","떡볶이 1인분", "오뎅 1개", "순대1인분"};
//		
//		int order = sc.nextInt();
//		for(int i = 0; i < arr.length; i++) {
//		System.out.println();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			
//		}
		
		
		
		
		sc.close();
	}
}
