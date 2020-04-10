package Day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Chapter0901 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(50, 50, 150, 150);
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(115, 200, 20, 40);
		g.fillArc(75, 200, 40, 40, 135, 180);
		g.fillArc(135, 200, 40, 40, 225, 180);
		
		g.setColor(Color.orange);
		g.fillOval(250, 250, 150, 150);
		g.setColor(Color.MAGENTA);
		g.fillOval(300, 300, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(315, 400, 20, 40);
		g.fillArc(275, 400, 40, 40, 135, 180);
		g.fillArc(335, 400, 40, 40, 225, 180);
	}
}
