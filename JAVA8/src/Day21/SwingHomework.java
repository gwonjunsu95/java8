package Day21;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingHomework extends JFrame {

	static JButton btn1 = new JButton("가위");
	static JButton btn2 = new JButton("바위");
	static JButton btn3 = new JButton("보");
	
	int com = (int) (Math.random()*3)+1;
	
	
	
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p1.add(p2);
		
		f.add(p1);
		f.setSize(300, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setResizable(false);
		
	}
}
