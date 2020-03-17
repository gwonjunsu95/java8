package JAVA8;

import java.util.Scanner;

public class Chapter02Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름, 학번, 토플점수를 입력하세요:");
		String name = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("나의 이름은 " + name +"입니다.");
		System.out.println("학번은 " + num1 +"입니다.");
		System.out.println("그리고 토플점수는 " + num2 +"점 입니다.");
		
		sc.close();
	}
}
