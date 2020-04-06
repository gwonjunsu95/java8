package Programmers;

import java.util.Arrays;
//import java.util.Scanner;

public class Solution001 {


	public int[] solution(int[] array, int[][] commands) {
//		Scanner sc = new Scanner(System.in);
//		int i, j, k;
//		i = sc.nextInt();
//		j = sc.nextInt();
//		k = sc.nextInt();
//		int arrayLength = (int) (Math.random()*100+1);
//		int commandsLength = (int) (Math.random()*50+1);
//		array = new int[arrayLength];
//		commands = new int[commandsLength][3];
//		int[] copy = Arrays.copyOfRange(array, i-1, j-1);
		
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int [] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
			Arrays.parallelSort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
		return answer;

	}

}
