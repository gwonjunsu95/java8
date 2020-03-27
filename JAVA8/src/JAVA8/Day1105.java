package JAVA8;

public class Day1105 {

	public static void main(String[] args) {
		int[] arr = new int[45];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*45) +1;
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
				i--;
				break;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
