package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		Random rd = new Random();
		int luck = 0;
		luck = rd.nextInt(51)+50; 
		luck = (int)(Math.random()*51)+50;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��� �ּ���:");
		String name = sc.next();	//String���� ���ڿ�(�ؽ�Ʈ)�� �Է��մϴ�.
									//�ʱ�ȭ�� ""���� �� �� �ֽ��ϴ�.
		System.out.print(name+"���� ������ �����\'");
		String str = "%\'�Դϴ�."; 
		//String������ ���ڿ��� ������ �� �ֽ��ϴ�.
		//String���� ���������� �� ���� ����Ǵ°��� �ƴ϶� ���� ������ �ִ� �޸� �ּҰ� ����˴ϴ�.
		//���� ����ǥ�� ����� char���̰� ū����ǥ�� ���θ� String���Դϴ�.
		System.out.println(luck+str);
		sc.close();
	}
}
