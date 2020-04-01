package Day14;

public class PromoEx {

	public static void main(String[] args) {
	
		PromoChild pc = new PromoChild();
		pc.method1();
		pc.method2();
		pc.method3();
		
		
		PromoParent pp = pc;	//�ڽ��� �θ� ������ �����մϴ�.(�ڵ� ����ȯ)
		pp.method1();
		pp.method2();
//		pp.method3();	//�θ��� �����̱� ������ �θ𿡴� method3�� �����ϴ� �׷��� ����� �Ұ����մϴ�.
		
		pc =(PromoChild) pp;	//�ڽĿ� �θ� ������ �� �����ϴ�. ���� ����ȯ�� �����ϴ�.
		pc.method1();			//�θ��� ��ü�� �ڽ��� ��ü�� ���Ե� ���� �������� �ڽİ�ü����߸� �մϴ�.
		pc.method2();
		pc.method3();
		
		
		PromoParent pp2 = new PromoParent();
		if(pp2 instanceof PromoChild) {	//instanceof �� ����ȯ�� �������� boolean������ ��ȯ�մϴ�.
			pc = (PromoChild)pp2;	//������ ���·θ� ��������ȯ�� �����մϴ�.
			pc.method3();
		} else {
			System.out.println("���� ����ȯ�� ����� �� �����ϴ�.");
		}
		
	}
}
