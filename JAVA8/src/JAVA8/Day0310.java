package JAVA8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Դϱ�?(����: 1,�����ƴ�: 0) -");
		int capital = sc.nextInt();
		boolean isCapital = capital == 0 ? false : true; 
				
		System.out.print("�α�(����: ��) -");
		int citizens = sc.nextInt();
		
		System.out.print("������ �� (����: ��) -");
		int riches = sc.nextInt();
		
		boolean isMetro1 = isCapital && (citizens >= 100);
		boolean isMetro2 = riches >= 50;
		
		boolean isMetro = isMetro1 || isMetro2;
		System.out.print("��Ʈ�������� ����: " + isMetro);
		sc.close();
	}

}
