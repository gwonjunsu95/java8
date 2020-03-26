package JAVA8;

public class Day1012 {

	public static void main(String[] args) {
		int[] arr = new int[350_000_000];
		int sum = 0; 
		int sum2 = 0;
		
		System.out.println("C형 for문");
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < arr.length; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println();
		
		long start2 = System.currentTimeMillis();
		System.out.println("향상된 for문");
		for(int number : arr) {
			sum2 += number ;
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
		System.out.println();
		
		
		
		
	}
}
