package Day20;

public class JoinEx {

	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		try {
			Thread.sleep(10);
			t.join();	//�����Ҷ� ���� ��ٸ�
		} catch (InterruptedException e) {

		}
		System.out.println(t.getSum());

	}
}
