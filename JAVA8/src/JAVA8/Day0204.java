package JAVA8;

public class Day0204 {
	public static void main(String[] args) {
		double number1;
		number1 = 3.14;
		double number2 = 1.23;
		double result = number1+number2;
		System.out.println(result);
		
		float result2 = (float)(number1+number2);
		System.out.println(result2);
		
		double result3 = 3.14+1.23;
		System.out.println(result3);
		
		float result4 = 3.14f+1.23f;	//�Ǽ��� �⺻���� double�̱� ������ ����ȯ�� �ʿ��ϴ�.
		System.out.println(result4);	//float�� ������ ������ ���� f�� ���δ�. 
		
		double result5 = 3.14f + 1.23;	//���� �ٸ� �ڷ����� �����ϰ� �Ǹ� ū �ڷ�������
										//�ڵ� ����ȯ �մϴ�.
		long result6 = 10 + 20L;	//������ �����ϰ� ���� �ٸ� �ڷ����� �����ϰԵǸ�
									//ū������ �ڵ�����ȯ �մϴ�.
		int num1 = 100;
		System.out.println(num1);
		num1 = 200;
		System.out.println(num1);
		num1 = 300;
		System.out.println(num1);
	}
}
