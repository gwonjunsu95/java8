package Day14;

public class Animal {

	void speak() {
		System.out.println("울음소리를 냅니다.");
	}
	
	void run() {
		System.out.println("뛰어가다");
	}
	
	void haul(Animal animal) {
		animal.speak();
	}
}
