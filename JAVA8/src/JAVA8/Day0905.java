package JAVA8;

public class Day0905 {

	public static void main(String[] args) {
		/*for���� ����Ͽ� a~z���� ����ϼ���
		 * abcdefghijklmnopqrstuvwxyz
		 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 ��Ʈ: ����ȯ�� �ʿ� Day0206����
		 */
		char a = 'a';
		char a2 = 'A';
		for(int i = 0; i < 26; i++) {
			char small = (char) (a + i);
			System.out.print(small + " ");
		}
		System.out.println();
		for(int i = 0; i < 26; i++) {
			char big = (char) (a2 + i);
			System.out.print(big + " ");
		}
	}
}
