package JAVA8;

public class Day0602 {

	public static void main(String[] args) {
		int sum = 0;
//		int i = 0; 
		
		for(int i = 1; i <= 100; i += 1) {		//������ ������ �ۿ��� ����� �� ����.
			sum += i;							//for���� �� ���� ���������� i(index)�� ����Ѵ�.
		}										//(i++) = (i+=1) = (i=i+1)
		
		System.out.println("1���� 100������ �� : " + sum);
//		System.out.println("���� i�� �� : " + i); //for���� �����϶� �������´�.
	}
}
