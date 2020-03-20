package JAVA8;

import java.util.Scanner;

public class Day0511 {
	public static void main(String[] args) {
		String ga = "가위";
		String ba = "바위";
		String bo = "보";
		String user = "";
		String com = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 중 하나를 선택하세요.(가위=a, 바위=b, 보=c):");
		user = sc.next();
		
		switch(user) {
			case "a":
			case "A":
				user = ga;
				break;
			case "b":
			case "B":
				user = ba;
				break;
			case "c":
			case "C":
				user = bo;
				break;
			default:
				user = "error";
		}
		
		
					
		int num = (int)(Math.random()*3) ;
		 switch(num) {
			case 0:
			 	com = ga;
			 	break;
			case 1:
			 	com = ba;
			 	break;
		 	case 2:
			 	com = bo;
			 	break;
		} 
//		com.equals(ga); String의 자료가 같은지 확인할때사용.
		if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
				|| (user.equals(bo) && com.equals(ba))){
			 System.out.println( "사람승! 사람:" +  user + ", 컴퓨터:" + com);
		}  else if (user.equals(com)) {
			 System.out.println("비겼습니다! 사람:" + user + ", 컴퓨터:" + com);
		} else {
			System.out.println("컴퓨터승! 사람:" + user + ", 컴퓨터:" + com);
			
		}
		
		
		sc.close();
	}
}
