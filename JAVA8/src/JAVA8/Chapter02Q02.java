package JAVA8;

import java.util.Scanner;

public class Chapter02Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직사각형의 가로와 세로를 입력하세요 : ");
		int w = 0;
		int h = 0;
		w = sc.nextInt();
		h = sc.nextInt();
		int res1 = w * h;
		int res2 = (w + h) * 2;
//		double res3 = Math.sqrt((w * w) + (h * h));	//제곱근 구하기	
//		double res4 = Math.pow(w, 5);				//제곱 하기
		System.out.println("사각형의 넓이는 " + res1 +"입니다.");
		System.out.println("사각형의 둘레는 " + res2 +"입니다.");
//		System.out.println("대각선의 길이는 " + res3 +"입니다.");
//		System.out.println(res4);
		
		sc.close();
	}
}
