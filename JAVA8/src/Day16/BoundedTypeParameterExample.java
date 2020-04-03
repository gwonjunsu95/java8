package Day16;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
//		String str;		//ctrl + t =상위계층확인 
//		String str = Util.compare("a", "b");
		
		int result1 = Util.compare(10, 20);	//t1과 t2가 int이므로 Integer로 유추가능
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);	//t1은 double, t2는 int이므로 Number로 유추가능
		System.out.println(result2);
		
		int result3 = Util.compare(100, 100);
		System.out.println(result3);
	}
}
