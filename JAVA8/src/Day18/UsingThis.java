package Day18;

public class UsingThis {
	public int outerField = 10;

	class Inner {
		int innerField = 20;

		void method() {

			Functional fi = () -> {		//���ٽ��� �޼��带����
				System.out.println("outerField: " + outerField);
				System.out.println("outerField: " + UsingThis.this.outerField + "\n");
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();

			Functional fi2 = new Functional() {	

				@Override
				public void method() {	//�͸�����ü�� ��ü�� ����
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
