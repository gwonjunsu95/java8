package Day12;

public class MemberSevice {
	boolean login(String id, String password){
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(id.equals("hong")) {
			System.out.println(id + "�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}