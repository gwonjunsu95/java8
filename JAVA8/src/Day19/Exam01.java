package Day19;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �и��� �̸��� ��ȭ��ȣ�� 4���� �Է��ϼ���.");
		Map<String,String> map = new Hashtable<>();
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸�, ��ȭ��ȣ: ");
			String key = sc.next();
			String value = sc.next();
			map.put(key, value);
		}
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻʽÿ�.");
		String search = sc.next();
		String tel = map.getOrDefault(search, "��ϵ��� ���� ����");
		System.out.println(search + "�� ��ȭ��ȣ�� "+ tel +"�Դϴ�.");
		sc.close();
	}
}
