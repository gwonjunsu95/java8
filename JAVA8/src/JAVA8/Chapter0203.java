package JAVA8;

import java.util.Scanner;

public class Chapter0203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w, h;
		int a, p;
		System.out.print("너비를 입력해 주세요:");
		w = sc.nextInt();
		System.out.print("높이를 입력해 주세요:");
		h = sc.nextInt();
//		w = width h= height a = area p = perimeter
		a = w * h ;
		p = 2 * (w +h);
		
		System.out.println("사각형의 넓이:" + a);
		System.out.println("사각형의 둘레:" + p);
		
		sc.close();
	}
}
