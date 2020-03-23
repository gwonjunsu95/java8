package JAVA8;

public class Day0707 {

	public static void main(String[] args) {
		int num = 0;	//cnt = count 수를 셀때의 변수기본값
		System.out.print("1부터 50까지의 수 중 3의 배수의 개수는 : ");
		
		for(int i = 1; i <= 50; i++) {
			if (i % 3 ==0) {
				num +=1;	//cnt++ 와 동일
			}
		}
		System.out.println(num + "개 입니다.");
	}
}
