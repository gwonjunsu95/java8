package Day16;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		exceptionTest();
	}

	static void exceptionTest() {
		int[] arr = new int[3];
		try {
			arr[2] = 100; // ���ܹ߻��� �ٷ� catch�� �ѱ��.
			System.out.println(arr[2]);
//			throw new NullPointerException();
//			throw new ArithmeticException();
//			throw new ArrayIndexOutOfBoundsException();		//���������� ���ܸ� �߻���Ű���� ��ü�� �����ؼ� throw�մϴ�.
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // ArrayIndexOutOfBoundsException <<< Exception
			System.out.println("���� ������ �Ұ��� �ϰų� �迭�� ������ ������ϴ�.");
//		} catch (ArithmeticException e) {		//���� ���� 
//			System.out.println("���� ������ �Ұ����մϴ�.");
		} catch (Exception e) {			//ó������ �� ��� ��� ���ܸ� ó���մϴ�. �׻� ���� �������� ���Ǿ�� �մϴ�. 
			System.out.println("�߻��� ��� ���ܸ� ó���մϴ�.");
//			e.printStackTrace();	//��������ǥ��
		} finally {					//���ܿ� ������� ������ �����ϴ� �����Դϴ�. ��������.
			System.out.println("finally �����Դϴ�.");
		}
		
		try {
			Thread.sleep(1000);	//����ó�� ���̴� ������ �Ұ����� �ڵ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
