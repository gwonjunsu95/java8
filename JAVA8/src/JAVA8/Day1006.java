package JAVA8;

public class Day1006 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
//		arr1 = {100, 200, 300, 400, 500};
		
		int[] arr2 = new int[5];	//0, 0, 0, 0, 0
//		arr2 = {10, 20, 30, 40, 50};
		
		int[] arr3 = new int[] {10, 20, 30, 40, 50};	//크기가 5인 배열
//		arr3 = {100, 200, 300, 400, 500};	//중괄호는 선언시 한번만 사용가능
		
		String str1 = "안녕하세요";
		str1 = "Hello";	//동일한 형태의 다른 객체를 대입할 수 있다.
		
		arr3 = new int[] {100, 200, 300, 400, 500};	//배열도 동일한 형태의 다른 객체를 대입할 수 있다.
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		arr2 = new int[10];	//자바는 배열을 다른 객체로 변환이 가능합니다.
							//크기를 늘이거나 줄이는게 아닌 삭제 후 생성 개념
		String str = "안녕하세요";
		System.out.println(str.length());
		
		
	}
}
