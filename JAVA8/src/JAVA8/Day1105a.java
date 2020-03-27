package JAVA8;

import java.util.Arrays;

public class Day1105a {

	public static void main(String[] args) {
		int[] arr = new int[45];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

		for (int i = 0; i < 10000; i++) {
			int r = (int) (Math.random() * 45);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		
		System.out.println("로또 추첨기");
		int[] ary = Arrays.copyOf(arr, 7);
		Arrays.sort(ary);
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
		System.out.println(", 보너스번호 : " + arr[7]);

	}
}
