package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter01Q02 {
	public static void main(String[] args) throws Exception  {
		int intnum;
		double dbnum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �Ǽ��� �Է��ϼ���! :");
		intnum = Integer.parseInt(br.readLine());
		dbnum = Double.parseDouble(br.readLine());
		System.out.println("�Է��� ������ " + intnum + "�Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + dbnum + "�Դϴ�.");
		
		br.close();
	}
}
