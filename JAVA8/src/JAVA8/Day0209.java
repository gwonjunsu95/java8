package JAVA8;

import java.util.Random;
import java.util.Scanner;

public class Day0209 {

	public static void main(String[] args) {
		Random rd = new Random();
		int luck = 0;
		luck = rd.nextInt(51)+50; 
		luck = (int)(Math.random()*51)+50;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요:");
		String name = sc.next();	//String형은 문자열(텍스트)을 입력합니다.
									//초기화는 ""으로 할 수 있습니다.
		System.out.print(name+"님의 오늘의 행운은\'");
		String str = "%\'입니다."; 
		//String형에는 문자열을 저장할 수 있습니다.
		//String형은 참조형으로 그 값이 저장되는것이 아니라 값이 가지고 있는 메모리 주소가 저장됩니다.
		//작은 따옴표로 감까면 char형이고 큰따옴표로 감싸면 String형입니다.
		System.out.println(luck+str);
		sc.close();
	}
}
