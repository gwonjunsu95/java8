package JAVA8;

public class Day0602 {

	public static void main(String[] args) {
		int sum = 0;
//		int i = 0; 
		
		for(int i = 1; i <= 100; i += 1) {		//블럭안의 변수는 밖에서 사용할 수 없다.
			sum += i;							//for문을 쓸 때는 관례적으로 i(index)를 사용한다.
		}										//(i++) = (i+=1) = (i=i+1)
		
		System.out.println("1부터 100까지의 합 : " + sum);
//		System.out.println("현제 i의 값 : " + i); //for문은 거짓일때 빠져나온다.
	}
}
