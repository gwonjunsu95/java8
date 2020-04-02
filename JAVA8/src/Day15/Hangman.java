package Day15;

import java.util.Scanner;

public class Hangman {

	private String hidden; // 문제
	private StringBuffer outputString; // 결과
	private StringBuffer inputString; // 입력한 문자열
	private int remainder; // 맞힐 문자열
	private int failed; //
	private Scanner sc;
	private String inputData;

	public Hangman() {
		this("hello");
	}

	public Hangman(String solution) {
		hidden = solution;
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hidden.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputData = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("-");
		}
	}

	public void playGame() {
		System.out.println("행맨 게임을 시작합니다.");
		show();
		do {
		do {
			setInputData();
		} while (checkChar(inputData));
		processGame();
		show();
		} while(failed < 6 && remainder > 0);
		System.out.println("행맨 게임을 종료합니다.");
	}

	private void show() {
		System.out.println("틀린 횟수: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}

	private void setInputData() {
		System.out.print("문자를 입력해 주세요: ");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData) == -1) {
			inputString.append(inputData);
			return false;
		}
		System.out.println("이미 입력한 문자입니다.");
		return true;

	}
	
	private void processGame() {
		if(hidden.indexOf(inputData) == -1) {
			failed++;
		} else {
			int index = hidden.indexOf(inputData);
			do {
			outputString.setCharAt(index, inputData.charAt(0));
			remainder--;
			index = hidden.indexOf(inputData, index +1);
			} while (index != -1);
		}
	}
}
