package Day12;

import java.util.Scanner;

public class Grade2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 순으로 3개의 정수 입력>> ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		Grade2 me = new Grade2(kor, eng, mat);
		System.out.print("평균: " + me.avg());	//avg()는 평균을 계산하여 리턴
		
		sc.close();
	}
}
