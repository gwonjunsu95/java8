package Day12;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		System.out.print("출력할 문자열을 입력하세요! : ");
		Scanner sc = new Scanner(System.in);
		String instr = sc.nextLine();
		StringBuffer str = new StringBuffer(instr);
		System.out.println("입력한 문자열 : " + str);

		str.reverse();
		System.out.println("리버싱 문자열 : " + str);

		sc.close();

	}
}
