package Day13;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberSevice ms = new MemberSevice();
		Member hong = new Member("ȫ�浿", "hong");
		hong.password = "12345";
		hong.age = 30;
		
		if(ms.login("hong", "12345")){
			System.out.println("�α��� �Ͽ����ϴ�.");
			ms.logout("hong");
		}else {
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
		}
		
		
		Member lee = new Member("�̿���", "lee");
		lee.password = "12345";
		lee.age = 20;
		if(ms.login("lee", "12345")){
			System.out.println("�α��� �Ͽ����ϴ�.");
			ms.logout("lee");
		}else {
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
		}
		
	}
}