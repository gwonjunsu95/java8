package Day20;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJAppletEx2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����");

		ColorJApplet p = new ColorJApplet();
		p.init();

		f.setSize(500, 500);
		f.setBackground(Color.ORANGE);
//		f.setTitle("���ø� ù ����");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

	}
}
