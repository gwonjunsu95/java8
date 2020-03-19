package JAVA8;

import java.util.Scanner;

public class Day0508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 등급을 입력하세요:");
		String grade = sc.next();
		
		switch(grade) {
			case "s":
			case "S":
				System.out.println("당신은 VIP입니다.");
				break;
			case "a":
			case "A":
				System.out.println("당신은 우대고객입니다.");
				break;
			case "b":
			case "B":
				System.out.println("당신은 우수고객입니다.");
				break;
			default:
				System.out.println("당신은 일반고객입니다.");
		}
		
		
		
		
		sc.close();
	}
}
