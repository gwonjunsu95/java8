package JAVA8;

public class Day1104 {

	public static void main(String[] args) {
		int[][] arr = new int[5][7];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					sum += 1;
					arr[i][j] = sum;
					System.out.print(arr[i][j] + "\t");
				} else {
					sum = (i+1)*arr[i].length - j;
					arr[i][j] = sum;
					System.out.print(arr[i][j] + "\t");
					sum  = (i+1)*arr[i].length;
				}
			}
			System.out.println();
		}
		System.out.println();

	}
}
