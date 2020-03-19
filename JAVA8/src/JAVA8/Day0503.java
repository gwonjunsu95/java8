package JAVA8;

import java.util.Scanner;

public class Day0503 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 영어점수를 입력해주세요(0~100) : ");
		int score = sc.nextInt();
		String pass = "";
		
		if (score >= 90) {
			pass = "A학점";
		}  else if(score < 90 && score >= 80) {
			pass = "B학점";
		}  else if(score < 80 && score >= 70) {
			pass = "C학점";
		}  else if(score < 70 && score >= 60) {
			pass = "D학점";
		}  else if(score < 60) {
			pass = "F학점";
		}
		
		System.out.println("시험성적은"+ pass + "입니다.");		
		
		
		
		sc.close();
	}
}

/*
 * 90점 이상은 A학점
 * 90점미만 80점이상은 B학점
 * 80점미만 70점이상은 C학점
 * 70점미만 60점이상은 D학점
 * 60점미만 F학점
 */
   