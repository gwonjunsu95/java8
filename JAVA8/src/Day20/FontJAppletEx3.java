package Day20;

import javax.swing.JFrame;

public class FontJAppletEx3 {

	public static void main(String[] args) {
		JFrame f = new JFrame("애플릿 첫 예제");

		FontJApplet p = new FontJApplet();
		p.init();

		f.setSize(600, 500);
//		f.setTitle("애플릿 첫 예제");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

	}
}
