package JAVA8;

import java.util.Scanner;

public class Day0511 {
	public static void main(String[] args) {
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String user = "";
		String com = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �� �� �ϳ��� �����ϼ���.(����=a, ����=b, ��=c):");
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
//		com.equals(ga); String�� �ڷᰡ ������ Ȯ���Ҷ����.
		if ((user.equals(ga) && com.equals(bo)) || (user.equals(ba) && com.equals(ga))
				|| (user.equals(bo) && com.equals(ba))){
			 System.out.println( "�����! ���:" +  user + ", ��ǻ��:" + com);
		}  else if (user.equals(com)) {
			 System.out.println("�����ϴ�! ���:" + user + ", ��ǻ��:" + com);
		} else {
			System.out.println("��ǻ�ͽ�! ���:" + user + ", ��ǻ��:" + com);
			
		}
		
		
		sc.close();
	}
}
