package Day20;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJApplet  extends JPanel{
	public void init() {
		setSize(500, 500);
		setBackground(Color.ORANGE);
		//��� 1: �г� ���
		//Panel p1 = new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	}
	
	public void paint(Graphics g) {
		//��� 2: paint �޼ҵ忡�� fillRect ���
		// g.setColor(Color.orange);
		//g.fillRect(0, 0, getWidth(), getHeight());
		Color myColor = new Color(255, 0, 0);
		g.setColor(myColor);
		g.drawString("������ �۾��� �׸���.", 40, 100);
	}

}