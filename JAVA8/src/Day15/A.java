package Day15;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	// 인스턴스 멤버 클래스
	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static void method2(){}
	}

	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		/* 로컬 클래스 */
		class D {
			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;
			// static int field2;

			void method1() {

			}
			// static void methos2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

	// 인스턴스 필드
	B outerField1 = new B();
	C outerField2 = new C();

	// 인스턴스 메서드
	void method1() {
		B var1 = new B();
		C var2 = new C();	
	}

	// 정적 필드 초기화
	// static B outerField3 = new B(); //A객체 없음
	static C outerField4 = new C(); // 정적은가능

	static void method2() {
//		B var1 = new B();	//A객체 없음
		C var2 = new C(); // 정적은가능
	}

}
