package Day14;

public class OverrideChild extends OverrideParent {
	void method3 () {
		System.out.println("자식 메서드3");
	}
	
	@Override
	void method2() {
		System.out.println("자식 메서드2");
	}
}
