package Day13;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		/* �ڽ� */
		Integer ibox = new Integer(number); // �Ű������� �⺻�� �Ǵ� ���ڿ��� �Է��� �� �ִ�.
		Integer ibox2 = Integer.valueOf(number);

		/* ��ڽ� */
		number = ibox.intValue();

		/* �ڵ� �ڽ� */

		Integer ibox3 = number;

		/* �ڵ� ��ڽ� */
		int result = ibox3 + 10;
		System.out.println(result);
		
		List<Integer> list = new ArrayList();

	}
}
