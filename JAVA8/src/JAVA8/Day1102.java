package JAVA8;

public class Day1102 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int number : arr) {
			System.out.print(number);
		}
		System.out.println();
		
//		arr = new int [10];		//���ο� ��ü�� ����
		
		for(int i = 0; i < arr.length; i++) {	//������ ��Ҹ� 0���� ����
			arr[i] = 0;
			System.out.print(arr[i]);
		}
		System.out.println();

		for(int number : arr) {
			System.out.print(number);
		}
		System.out.println();
		

	}
}
