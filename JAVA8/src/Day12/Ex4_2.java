package Day12;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		System.out.print("����� ���ڿ��� �Է��ϼ���! : ");
		Scanner sc = new Scanner(System.in);
		String instr = sc.nextLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("�Է��� ���ڿ� : " + str);

		str.reverse();
		System.out.println("������ ���ڿ� : " + str);

		sc.close();

	}
}
