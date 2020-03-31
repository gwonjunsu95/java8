package Day13;

public class CompareToEx {

	public static void main(String[] args) {
		String a = "Java Programming Very Good";
		String b = "Java Programming";
		int res = a.compareTo(b);
		System.out.println("비교결과 : " + res);
		
		String a2 = "aaa";
		String b2 = "Abc";
		int res2 = a2.compareTo(b2);
		System.out.println("비교결과 : " + res2);
	}
}
