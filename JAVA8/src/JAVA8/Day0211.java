package JAVA8;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A'+'1';	//A�� 65, 1�� 49
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A"+"1";
		//���ڿ��� �ƹ��͵� ���ų� �� ���� ���ڸ� �־ �ֵ���ǥ�� ���θ� ���ڿ��Դϴ�.
		System.out.println(str);	//���ڿ��� ������ �ϳ��� ���ڿ��� ��ġ�� �˴ϴ�.
		String str2 = "10";
		int num2 = 10;
		//���ڿ��� �ٸ� �ڷ����� ��ġ�� �Ǹ� �ϳ��� ���ڿ��� �˴ϴ�.
		String res2 = str2+num2;
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20;
		System.out.println(num3+""+num4);	//���ڸ� ���ڷ� �����ϴ� ���1
		String str3 = num3+"";
		System.out.println(str3);
		String str4 = String.valueOf(num3);	//���ڸ� ���ڷ� �����ϴ� ���2
		
		String str5 = "100";
		System.out.println(str5+100);
		
		int num5 = Integer.valueOf(str5);
		double d1 = Double.valueOf(str5);
		
		System.out.println(num5);
		int num6 = Integer.parseInt(str5);
		double d2 = Double.parseDouble(str5);
		
//		String str6 = "Hello";
//		int num7 = Integer.valueOf(str6);
//		int num7 = Integer.parseInt(str6);
//		System.out.println(num7);
		
		}
}
/*
 ctrl+����Ű ���Ʒ�=  ��  ctrl+����Ű�¿�= �Ѵܾ �̵�
 ctrl+l=�� �����̵�    shift alt A= ������ ���� Ÿ�ڰ���
  
 */                   