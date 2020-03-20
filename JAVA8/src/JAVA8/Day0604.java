package JAVA8;

public class Day0604 {

	public static void main(String[] args) {
		int i, j, k;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 5; j++) {
//				for(i = 0; i < 5; i++) {	//같은 변수를 중첩할 수 없다.
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i = 0; i < 3; i++) {		//같은 동의선상의 for문은 같은 변수를 사용할수있다.
			System.out.println("안녕하세요.");
		}
	}
}
