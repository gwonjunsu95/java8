package JAVA8;

import java.util.Scanner;

public class Day0509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("A.아메리카노 L.카페라떼 M.카페모카 C.카푸치노");
		System.out.print("원하는 커피의 알파벳을 입력해주세요:");
		String coffee = sc.next();
		
		switch(coffee) {
			case "a":
			case "A":
				System.out.println("아메리카노를 주문하셨습니다.");
				break;
			case "c":
			case "C":
				System.out.println("카푸치노를 주문하셨습니다.");
				break;
			case "l":
			case "L":
				System.out.println("카페라떼를 주문하셨습니다.");
				break;
			default:
				System.out.println("카페모카를 주문하셨습니다.");
				
		}
		
		
		sc.close();
	}
}
