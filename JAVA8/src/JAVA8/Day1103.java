package JAVA8;

public class Day1103 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 1) {
				sum = 0;
				sum = arr[i-1]+arr[i-2];
				arr[i] = sum;
				System.out.print(arr[i] + "\t");
			} else {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println();
		
		for (int i =2; i < arr.length; i++) {
			arr[i]= arr[i-1] + arr[i-2];
		}
		
		for (int num : arr) {
			System.out.println(num);
		}
		
	}
}
