
package JAVA8;

public class Day1003 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};	//선언시에는 마지막에 세미콜론을 사용합니다.
		int arr2[] = {60, 70, 80, 90, 100};	//2가지 생성방식을 혼용해도 문제되지 않습니다.
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}
		
		arr1[2] = 300;	//배열의 인덱스는 일반 변수처럼 값을 변경할 수 있다.
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
