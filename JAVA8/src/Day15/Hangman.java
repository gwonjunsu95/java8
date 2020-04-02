package Day15;

import java.util.Scanner;

public class Hangman {

	private String hidden; // ����
	private StringBuffer outputString; // ���
	private StringBuffer inputString; // �Է��� ���ڿ�
	private int remainder; // ���� ���ڿ�
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
		System.out.println("��� ������ �����մϴ�.");
		show();
		do {
		do {
			setInputData();
		} while (checkChar(inputData));
		processGame();
		show();
		} while(failed < 6 && remainder > 0);
		System.out.println("��� ������ �����մϴ�.");
	}

	private void show() {
		System.out.println("Ʋ�� Ƚ��: " + failed + "/6");
		System.out.println(outputString);
		System.out.println();
	}

	private void setInputData() {
		System.out.print("���ڸ� �Է��� �ּ���: ");
		this.inputData = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputData) {
		if (inputString.indexOf(inputData) == -1) {
			inputString.append(inputData);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�.");
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
