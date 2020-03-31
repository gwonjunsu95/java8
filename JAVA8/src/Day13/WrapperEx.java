package Day13;

import java.util.ArrayList;
import java.util.List;

public class WrapperEx {

	public static void main(String[] args) {
		int number = 10;
		/* 박싱 */
		Integer ibox = new Integer(number); // 매개변수는 기본값 또는 문자열을 입력할 수 있다.
		Integer ibox2 = Integer.valueOf(number);

		/* 언박싱 */
		number = ibox.intValue();

		/* 자동 박싱 */

		Integer ibox3 = number;

		/* 자동 언박싱 */
		int result = ibox3 + 10;
		System.out.println(result);
		
		List<Integer> list = new ArrayList();

	}
}
