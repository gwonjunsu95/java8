package JAVA8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter02Q05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int r ;
		double �� = 3.14159;
		double res;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������� �Է��� �ּ��� :");
		r = Integer.parseInt(br.readLine());
		res = r * 2 * ��;
		System.out.println("���� �ѷ��� " + res + "�Դϴ�.");
		
//		Math.PI = ������ ���밪 3.141592.....
		
		br.close();
	}
}
