package JAVA8;

public class Day1115 {

	public static void main(String[] args) {
		String[][] arr = new String[8][9];

		for (int i = 2; i < 8; i++) {
			for (int j = 1; j < 9; j++) {
				int res = i * j;
				arr[i][j] = i+"x"+j +"=" +res;
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}

	}
}
