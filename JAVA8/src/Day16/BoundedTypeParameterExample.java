package Day16;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
//		String str;		//ctrl + t =��������Ȯ�� 
//		String str = Util.compare("a", "b");
		
		int result1 = Util.compare(10, 20);	//t1�� t2�� int�̹Ƿ� Integer�� ���߰���
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);	//t1�� double, t2�� int�̹Ƿ� Number�� ���߰���
		System.out.println(result2);
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}
}
