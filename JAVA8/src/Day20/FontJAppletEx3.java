package Day20;

import javax.swing.JFrame;

public class FontJAppletEx3 {

	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����");

		FontJApplet p = new FontJApplet();
		p.init();

		f.setSize(600, 500);
//		f.setTitle("���ø� ù ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

	}
}
