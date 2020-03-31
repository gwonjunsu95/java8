package Day13;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberSevice ms = new MemberSevice();
		Member hong = new Member("홍길동", "hong");
		hong.password = "12345";
		hong.age = 30;
		
		if(ms.login("hong", "12345")){
			System.out.println("로그인 하였습니다.");
			ms.logout("hong");
		}else {
			System.out.println("정보를 잘못입력하셨습니다.");
		}
		
		
		Member lee = new Member("이연희", "lee");
		lee.password = "12345";
		lee.age = 20;
		if(ms.login("lee", "12345")){
			System.out.println("로그인 하였습니다.");
			ms.logout("lee");
		}else {
			System.out.println("정보를 잘못입력하셨습니다.");
		}
		
	}
}
