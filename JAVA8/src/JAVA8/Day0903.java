/*
 * printf는 형식(format)에 맞게 출력하는 메소드입니다.
 * printf는 C언어에서 출력으로 사용하는 메소드인데 자바에서도 사용할수 있습니다.
 * 첫번째 인수(입력값)는 출력 형식을 입력하고
 * 두번째 부터는 출력형식에 대입할 변수를 입력합니다.
 * 
 * 형식의 시작은 %로 시작합니다.
 * d : decimal 십진수
 * f : float 실수
 * lf : long float => double 실수	//C언어용 자바에 없음
 * o : octa 8진수
 * x : hexa 16진수
 * b : binary 2진수 (?)
 * s : string 문자열
 * c : char 문자 1개
 * 
 * 조합할 수 있는 것
 * 앞쪽에 숫자를 입력하면 자리수를 뜻합니다.
 * %2d => 십진수 2자리 출력, % 10d => 십진수 10자리 출력 
 * 숫자앞에 0을 붙이면 빈공간을 0으로 채웁니다. 
 * 제일 앞쪽에 -를 붙이면 좌측 정렬 합니다.
 */
package JAVA8;

public class Day0903 {

	public static void main(String[] args) {
		/*
		for(int i = 1; i <=25; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
			} else {
				System.out.println(i);
			}
		}
		*/
		
		/*
		int cnt = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				//System.out.print(cnt + "\t");
				System.out.printf("%02d", cnt);
				cnt++;
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i % 2 ==0) {
				System.out.print((i*5) + j + 1 + "\t");
				} else {
					System.out.print((i+1)* 5 - j + "\t");
				}
			}
			System.out.println();
		}
		*/
		
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j) {
				System.out.print("@");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}