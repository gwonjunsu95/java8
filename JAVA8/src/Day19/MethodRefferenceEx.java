package Day19;

import java.util.function.IntBinaryOperator;

public class MethodRefferenceEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;

		operator = new IntBinaryOperator() { // �͸�����ü

			@Override
			public int applyAsInt(int left, int right) {
				return Calculator.staticMethod(left, right);
			}
		};

		int result = operator.applyAsInt(10, 20);
		System.out.println(result);

		operator = (int left, int right) -> { // ���ٽ�
			return Calculator.staticMethod(left, right);
		};

		operator = (x, y) -> Calculator.staticMethod(x, y);
		;
		result = operator.applyAsInt(10, 20);
		System.out.println(result);

		operator = Calculator::staticMethod; // ���� �޼ҵ� ����
		result = operator.applyAsInt(10, 20);
		System.out.println(result);
		System.out.println();

		Calculator calc = new Calculator();

		operator = calc::instanceMethod; // �ν��Ͻ� �޼ҵ� ����
//		operator = Calculator :: instanceMethod;	//�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� �Ұ���
		result = operator.applyAsInt(10, 20);
		System.out.println(result);

	}
}
