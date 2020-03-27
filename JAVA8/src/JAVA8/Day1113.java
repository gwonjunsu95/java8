package JAVA8;

import java.util.Scanner;

public class Day1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 단가와 수량을 입력하세요 : ");
		int cost = sc.nextInt();
		int cnt = sc.nextInt();
		int res = cost * cnt;
		int sell = 0;
		if (res >= 1_000_000) {
			sell = res - (res / 10 * 4);
			System.out.println("상품의 단가 : " + cost + "상품의 개수 : " + cnt);
			System.out.println("지불 금액은 : " + (sell * cnt) +"원 이며 할인율은 40%입니다.");
		} else if (res >= 500_000) {
			sell = res - (res / 10 * 3);
			System.out.println("상품의 단가 : " + cost + "상품의 개수 : " + cnt);
			System.out.println("지불 금액은 : " + (sell * cnt) +"원 이며 할인율은 30%입니다.");
		} else {
			System.out.println("상품의 단가 : " + cost + "상품의 개수 : " + cnt);
			System.out.println("지불 금액은 : " + res +"원 이며 할인은 없습니다.");
		}

		sc.close();
	}
}
