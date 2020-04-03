package Day16;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {

	public void getData(String file) {
		try(
				Scanner sc = new Scanner(new File(file));	//여러개의 자동 닫힘 소스를 작성할 수 있다.
				Scanner sc2 = new Scanner(System.in)) {		//자동으로 닫아줘야 할것을 ()안에 매개변수처럼 넣어줘야한다.
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("예외발생");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TryWithResources2 twr = new TryWithResources2();
		twr.getData("test.txt");
	}
}
