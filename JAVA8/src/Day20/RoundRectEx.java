package Day20;

import javax.swing.JFrame;

public class RoundRectEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("둥근 사각형 그리기");

		RoundRect p = new RoundRect();

		f.add(p);
		f.setSize(500, 500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
