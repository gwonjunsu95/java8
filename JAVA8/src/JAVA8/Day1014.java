package JAVA8;

import java.util.Arrays;
import java.util.Scanner;

public class Day1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] r = new int[10];
		int number;

		System.out.print("정수 10개를 입력하세요! : ");

		for (int x = 0; x < r.length; x++) {
			r[x] = sc.nextInt();
		}
		System.out.println("입력 데이터값 : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

//		for (int i = 0; i < r.length; i++) {	//버블정렬
//			for (int j = 0; j < r.length - 1; j++) {
//				if (r[i] < r[j]) {
//					int temp = r[i];
//					r[i] = r[j];
//					r[j] = temp;
//				}
//			}
//		}
		
		Arrays.parallelSort(r);	//Arrays 클래스에서 제공하는 정렬 메서드
		Arrays.sort(r);

		System.out.print("오름차순 데이터 값 : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

		System.out.print("합 계 : " );
		int sum = 0;
		for (int x = 0; x < r.length; x++) {
			sum += r[x];
		}
		System.out.println(sum);
		System.out.println("평균 : " + (sum / r.length));

		sc.close();
	}
}
