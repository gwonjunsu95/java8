package JAVA8;

public class Day0708 {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		for (int i = 10; i >=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
//		
//		for (int i = 0; i <= 10; i++) {
//			System.out.print(10 - i + " ");
//		}
//		System.out.println();
//		
		for (int i = 1; i <=10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i = 10; i >=1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
