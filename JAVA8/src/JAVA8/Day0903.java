/*
 * printf�� ����(format)�� �°� ����ϴ� �޼ҵ��Դϴ�.
 * printf�� C���� ������� ����ϴ� �޼ҵ��ε� �ڹٿ����� ����Ҽ� �ֽ��ϴ�.
 * ù��° �μ�(�Է°�)�� ��� ������ �Է��ϰ�
 * �ι�° ���ʹ� ������Ŀ� ������ ������ �Է��մϴ�.
 * 
 * ������ ������ %�� �����մϴ�.
 * d : decimal ������
 * f : float �Ǽ�
 * lf : long float => double �Ǽ�	//C���� �ڹٿ� ����
 * o : octa 8����
 * x : hexa 16����
 * b : binary 2���� (?)
 * s : string ���ڿ�
 * c : char ���� 1��
 * 
 * ������ �� �ִ� ��
 * ���ʿ� ���ڸ� �Է��ϸ� �ڸ����� ���մϴ�.
 * %2d => ������ 2�ڸ� ���, % 10d => ������ 10�ڸ� ��� 
 * ���ھտ� 0�� ���̸� ������� 0���� ä��ϴ�. 
 * ���� ���ʿ� -�� ���̸� ���� ���� �մϴ�.
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