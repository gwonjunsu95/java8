
package JAVA8;

public class Day1003 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};	//����ÿ��� �������� �����ݷ��� ����մϴ�.
		int arr2[] = {60, 70, 80, 90, 100};	//2���� ��������� ȥ���ص� �������� �ʽ��ϴ�.
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}
		
		arr1[2] = 300;	//�迭�� �ε����� �Ϲ� ����ó�� ���� ������ �� �ִ�.
		for(int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}
		
		int arr3[] = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < 6; i++) {
			System.out.println(arr3[i]);
		}
//		arr3[6] = 7;
//		System.out.println(arr3[6]);
	}
}