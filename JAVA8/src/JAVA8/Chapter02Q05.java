package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter02Q05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int r ;
		double π = 3.14159;
		double res;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름을 입력해 주세요 :");
		r = Integer.parseInt(br.readLine());
		res = r * 2 * π;
		System.out.println("원의 둘레는 " + res + "입니다.");
		
//		Math.PI = 파이의 절대값 3.141592.....
		
		br.close();
	}
}
