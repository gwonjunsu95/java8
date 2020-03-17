package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter01Q02 {
	public static void main(String[] args) throws Exception  {
		int intnum;
		double dbnum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수와 실수를 입력하세요! :");
		intnum = Integer.parseInt(br.readLine());
		dbnum = Double.parseDouble(br.readLine());
		System.out.println("입력한 정수는 " + intnum + "입니다.");
		System.out.println("입력한 실수는 " + dbnum + "입니다.");
		
		br.close();
	}
}
