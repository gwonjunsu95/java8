package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter01Q01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�⵵�� �Է��ϼ���! : ");
		num = Integer.parseInt(br.readLine());
		System.out.println("�Է��� �⵵�� " + num + "�� �Դϴ�.");
		
		br.close();
	}
}
