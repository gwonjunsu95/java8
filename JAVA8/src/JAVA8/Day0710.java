package JAVA8;

public class Day0710 {

	public static void main(String[] args) {
		System.out.println("1부터 100까지 출력합니다");
		for(int i = 1; i <=100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {	//3과 5의 공배수 =15 (i % 15 ==0)으로 대체가능
				System.out.println(i + "pingpong");
	    	} else if(i % 3 == 0) {
 			System.out.println(i + "ping");
			} else if(i % 5 == 0 ) {
				System.out.println( i +"pong");
			} else {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(i );
			if(i % 3 ==0) {
				System.out.print("ping");
			}
			if(i % 5 ==0) {
				System.out.print("pong");
			}
			System.out.println();
		}
		System.out.println();
		
		int j = 1;
		while(j <= 100) {
			if (j % 5 == 0 && j % 3 == 0) {
				System.out.println(j + "pingpong");
			} else if( j % 3 == 0) {
			System.out.println(j + "ping");
			} else  if (j % 5 == 0){
				System.out.println(j + "pong");
			} else {
				System.out.println(j);
			}
			j++;
		}
	}
}
