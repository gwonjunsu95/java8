package JAVA8;

public class Day0506 {

	public static void main(String[] args) {
		System.out.println("주사위 게임을 시작합니다.");
		int dice = (int) (Math.random()*6)+1;
		System.out.println("주사위를 던집니다.");
		
//		if(dice == 1) {
//			System.out.println("주사위의 눈금은 1입니다.");
//		} else if (dice == 2) {
//			System.out.println("주사위의 눈금은 2입니다.");
//		} else if (dice == 3) {
//			System.out.println("주사위의 눈금은 3입니다.");
//		} else if (dice == 4) {
//			System.out.println("주사위의 눈금은 4입니다.");
//		} else if (dice == 5) {
//			System.out.println("주사위의 눈금은 5입니다.");
//		} else {
//			System.out.println("주사위의 눈금은 6입니다.");
//		}
		
		switch(dice) {
			case 1 :
				System.out.println("주사위의 눈금은 1입니다.");
				break;
			case 2 :
				System.out.println("주사위의 눈금은 2입니다.");
				break;
			case 3 :
				System.out.println("주사위의 눈금은 3입니다.");
				break;
			case 4 :
				System.out.println("주사위의 눈금은 4입니다.");
				break;
			case 5 :
				System.out.println("주사위의 눈금은 5입니다.");
				break;
			default :	//나머지값
				System.out.println("주사위의 눈금은 6입니다.");
		}
		
		System.out.println("게임을 종료합니다.");
		
	}

}
