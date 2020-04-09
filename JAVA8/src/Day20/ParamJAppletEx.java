package Day20;

import javax.swing.JFrame;

public class ParamJAppletEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("애플릿 첫 예제");

		ParamJApplet p = new ParamJApplet();
		p.init("애플릿 실행");

		f.setSize(500, 500);
//		f.setTitle("애플릿 첫 예제");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);

	}
}
