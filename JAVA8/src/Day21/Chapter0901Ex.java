package Day21;

import javax.swing.JFrame;

public class Chapter0901Ex {

	public static void main(String[] args) {
		JFrame t = new JFrame("²É ±×¸®±â");
		
		Chapter0901 p = new Chapter0901();
		
		t.add(p);
		t.setSize(500, 500);
		t.setResizable(false);
		t.getDefaultCloseOperation();
		t.setVisible(true);
		
		Thread f = new Thread(() -> {
			for (int i =0; i <100; i++) {
				p.setLocation(i, i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		});
		f.start();
	}
}
