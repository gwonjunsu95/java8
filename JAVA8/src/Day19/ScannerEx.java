package Day19;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		String name = null;
		int callNum = 0;
		PhoneNumber phone = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("공백으로 분리된 이름과 전화번호를 4개를 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print("이름, 전화번호: ");
			name = sc.next();
			callNum = sc.nextInt();
			phone = new PhoneNumber(name, callNum);
			
		}
		
		System.out.println("전화번호를 검색할 이름을 입력하십시오.");
		String in = sc.next();
		if(in.equals(phone.name)) {
			System.out.println(in + "의 전화번호는 "+ phone.number + "입니다.");
		}
		
		sc.close();
	}
}
