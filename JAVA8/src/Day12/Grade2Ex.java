package Day12;

import java.util.Scanner;

public class Grade2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		Grade2 me = new Grade2(kor, eng, mat);
		System.out.print("���: " + me.avg());	//avg()�� ����� ����Ͽ� ����
		
		sc.close();
	}
}
