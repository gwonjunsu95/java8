package JAVA8;

public class Day1006 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
//		arr1 = {100, 200, 300, 400, 500};
		
		int[] arr2 = new int[5];	//0, 0, 0, 0, 0
//		arr2 = {10, 20, 30, 40, 50};
		
		int[] arr3 = new int[] {10, 20, 30, 40, 50};	//ũ�Ⱑ 5�� �迭
//		arr3 = {100, 200, 300, 400, 500};	//�߰�ȣ�� ����� �ѹ��� ��밡��
		
		String str1 = "�ȳ��ϼ���";
		str1 = "Hello";	//������ ������ �ٸ� ��ü�� ������ �� �ִ�.
		
		arr3 = new int[] {100, 200, 300, 400, 500};	//�迭�� ������ ������ �ٸ� ��ü�� ������ �� �ִ�.
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		arr2 = new int[10];	//�ڹٴ� �迭�� �ٸ� ��ü�� ��ȯ�� �����մϴ�.
							//ũ�⸦ ���̰ų� ���̴°� �ƴ� ���� �� ���� ����
		String str = "�ȳ��ϼ���";
		System.out.println(str.length());
		
		
	}
}
