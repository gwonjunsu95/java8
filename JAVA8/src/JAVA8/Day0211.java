package JAVA8;

public class Day0211 {

	public static void main(String[] args) {
		char ch;
		String str;
		ch = 'A'+'1';	//A는 65, 1은 49
		System.out.println(ch);
		int res = ch;
		System.out.println(res);
		str = "A"+"1";
		//문자열은 아무것도 없거나 한 개의 문자만 있어도 쌍따옴표로 감싸면 문자열입니다.
		System.out.println(str);	//문자열의 덧셈음 하나의 문자열로 합치게 됩니다.
		String str2 = "10";
		int num2 = 10;
		//문자열과 다른 자료형이 합치게 되면 하나의 문자열이 됩니다.
		String res2 = str2+num2;
		System.out.println(res2);
		
		int num3 = 10;
		int num4 = 20;
		System.out.println(num3+""+num4);	//숫자를 문자로 변경하는 방법1
		String str3 = num3+"";
		System.out.println(str3);
		String str4 = String.valueOf(num3);	//숫자를 문자로 변형하는 방법2
		
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
 ctrl+방향키 위아래=  휠  ctrl+방향키좌우= 한단어씩 이동
 ctrl+l=줄 숫자이동    shift alt A= 여러줄 동시 타자가능
  
 */                   