package Day13;

public class CompareToEx {

	public static void main(String[] args) {
		String a = "Java Programming Very Good";
		String b = "java Programming";
		int res = a.compareTo(b);
		System.out.println("비교결과 : " + res);

		String a2 = "aaa";
		String b2 = "Abc";
		int res2 = a2.compareTo(b2);
		System.out.println("비교결과 : " + res2);

		String c = "Java Programming Very Good";
		String d = "java Programming";

		boolean compare1 = c.regionMatches(false, 5, d, 5, 11);
		boolean compare2 = c.regionMatches(true, 0, d, 0, 4);
		boolean compare3 = c.regionMatches(false, 0, d, 0, 4);
		System.out.println(compare1);
		System.out.println(compare2);
		System.out.println(compare3);

	}
}
