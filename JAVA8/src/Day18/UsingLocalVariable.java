package Day18;

public class UsingLocalVariable {

	void method(int arg) {	//arg�� final Ư���� ����
		int localVar = 40;		//localVar�� finalƯ���� ����
		
//		arg = 31;				//final Ư�� ������ ���� �Ұ�
//		localVar = 41;		//final Ư�� ������ ���� �Ұ�
		
		//���ٽ�
		Functional fi = () -> {
			//���ú��� ���
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
		
	}
	
	void method2(int x) {
		System.out.println(x);
		x = 50;
		System.out.println(x);
	}
	
}
