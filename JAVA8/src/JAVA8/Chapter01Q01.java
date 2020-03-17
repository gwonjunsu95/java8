package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter01Q01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도를 입력하세요! : ");
		num = Integer.parseInt(br.readLine());
		System.out.println("입력한 년도는 " + num + "년 입니다.");
		
		br.close();
	}
}
