package JAVA8;

public class Day0208 {
	
	public static void main(String[] args) {
		int dice = 0;	//����� ���ÿ� �ʱ�ȭ�� �ϸ� ���Ŀ� ������ ���ϼ� �ֽ��ϴ�.
		dice = (int)(Math.random()*6)+1;	//Math.random()�� 0�̻� 1�̸��� �Ǽ�(double)�� ����.
		//����ȯ�� ��Ģ���꺸�� �켱�մϴ�.
		//dice 0~5 => 1~6
		System.out.println(dice);
		
	}
	
}