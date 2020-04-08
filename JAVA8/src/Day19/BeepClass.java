package Day19;

import java.awt.Toolkit;

public class BeepClass {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		System.out.println("현재 스레드명: " + Thread.currentThread().getName());

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1 스레드명: " + Thread.currentThread().getName());
				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}

			}
		});

		t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("t1 스레드명: " + Thread.currentThread().getName());
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
		});
		t1.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("경고");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
