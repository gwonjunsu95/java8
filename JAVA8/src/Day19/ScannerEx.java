package Day19;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String name = null;
		int callNum = 0;
		PhoneNumber phone = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ�� 4���� �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸�, ��ȭ��ȣ: ");
			name = sc.next();
			callNum = sc.nextInt();
			phone = new PhoneNumber(name, callNum);
			
		}
		
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻʽÿ�.");
		String in = sc.next();
		if(in.equals(phone.name)) {
			System.out.println(in + "�� ��ȭ��ȣ�� "+ phone.number + "�Դϴ�.");
		}
		
		sc.close();
	}
}
