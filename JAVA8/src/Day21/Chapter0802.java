package Day21;

public class Chapter0802 extends Thread {

	int delay;

	public Chapter0802(String name, int delay) {
		super(name);
		this.delay = delay;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; 0 < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			System.out.println("error");
			return;
		}
	}

	public static void main(String[] args) {
		Chapter0802 t1 = new Chapter0802("쓰레드1", 300);
		Chapter0802 t2 = new Chapter0802("쓰레드2", 800);
		Chapter0802 t3 = new Chapter0802("쓰레드3", 400);

		t1.start();
		t2.start();
		t3.start();
	}
}
