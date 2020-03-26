package JAVA8;

public class Day1008 {

	public static void main(String[] args) {
		int[][] ary1 = new int[][] { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		System.out.println(ary1.length);
		System.out.println(ary1[0].length);
		System.out.println(ary1[1].length);
		System.out.println(ary1[2].length);
		System.out.println();
		
		int[][] ary2 = new int[3][2];
		System.out.println(ary2.length);
		System.out.println(ary2[0].length);
		System.out.println(ary2[1].length);
		System.out.println(ary2[2].length);
		System.out.println();
		
		/* 길이가 다른 2차원배열*/
		int[][] ary3 = new int[3][];	//내부 배열의 크기가 정해지지 않음
		ary3[0] = new int[5];
		ary3[1] = new int[3];
		ary3[2] = new int[10];
		System.out.println(ary3.length);
		System.out.println(ary3[0].length);
		System.out.println(ary3[1].length);
		System.out.println(ary3[2].length);
		
		
		
	}
}
