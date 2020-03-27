package JAVA8;

import java.util.Random;

public class Day1106 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random rd = new Random();

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;
			for(int j = 0; j < i; j++){
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		int temp = 0;
		for( int i = 0 ; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		

//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = 0; j < lotto.length; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.println(lotto[i]+"\t");
//		}

//		lotto[0] = rd.nextInt(45)+1;
//		do {
//			lotto[1] = rd.nextInt(45)+1;
//		}while(lotto[0] == lotto[1]);
	}
}
