package JAVA8;

import java.util.Arrays;
import java.util.Scanner;

public class Day1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] r = new int[10];
		int number;

		System.out.print("���� 10���� �Է��ϼ���! : ");

		for (int x = 0; x < r.length; x++) {
			r[x] = sc.nextInt();
		}
		System.out.println("�Է� �����Ͱ� : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

//		for (int i = 0; i < r.length; i++) {	//��������
//			for (int j = 0; j < r.length - 1; j++) {
//				if (r[i] < r[j]) {
//					int temp = r[i];
//					r[i] = r[j];
//					r[j] = temp;
//				}
//			}
//		}
		
		Arrays.parallelSort(r);	//Arrays Ŭ�������� �����ϴ� ���� �޼���
		Arrays.sort(r);

		System.out.print("�������� ������ �� : ");
		for (int x = 0; x < r.length; x++) {
			System.out.print(r[x] + "..");
		}
		System.out.println();

		System.out.print("�� �� : " );
		int sum = 0;
		for (int x = 0; x < r.length; x++) {
			sum += r[x];
		}
		System.out.println(sum);
		System.out.println("��� : " + (sum / r.length));

		sc.close();
	}
}
