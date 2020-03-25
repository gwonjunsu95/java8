package JAVA8;

public class Day0905 {

	public static void main(String[] args) {
		/*for문을 사용하여 a~z까지 출력하세요
		 * abcdefghijklmnopqrstuvwxyz
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 힌트: 형변환이 필요 Day0206참고
		 */
		char a = 'a';
		char a2 = 'A';
		for(int i = 0; i < 26; i++) {
			char small = (char) (a + i);
			System.out.print(small + " ");
		}
		System.out.println();
		for(int i = 0; i < 26; i++) {
			char big = (char) (a2 + i);
			System.out.print(big + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 26; j++) {
					char small = (char) (a + j);
					System.out.print(small + " ");
				}
				System.out.println();
			} else {
				for(int j = 0; j < 26; j++) {
					char big = (char) (a2 + j);
					System.out.print(big + " ");
				}
				System.out.println();
			}
		}
	}
}
