package Day14;

public class Animal {

	void speak() {
		System.out.println("�����Ҹ��� ���ϴ�.");
	}
	
	void run() {
		System.out.println("�پ��");
	}
	
	void haul(Animal animal) {
		animal.speak();
	}
}
