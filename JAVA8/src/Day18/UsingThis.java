package Day18;

public class UsingThis {
	public int outerField = 10;

	class Inner {
		int innerField = 20;

		void method() {

			Functional fi = () -> {		//람다식은 메서드를생성
				System.out.println("outerField: " + outerField);
				System.out.println("outerField: " + UsingThis.this.outerField + "\n");
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();

			Functional fi2 = new Functional() {	

				@Override
				public void method() {	//익명구현객체는 객체를 생성
					System.out.println("outerField: " + outerField);
					System.out.println("outerField: " + UsingThis.this.outerField + "\n");
					System.out.println("innerField: " + innerField);
					System.out.println("innerField: " + Inner.this.innerField + "\n");
				}
			};
			fi2.method();
		}
	}

}
