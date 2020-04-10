package Day21;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PieChart extends JPanel {
	int[] input = {30, 15, 45, 10};
	String[] title = {"Äá", "¹Ð", "½Ò", "¿Á¼ö¼ö"};
	Color[] color = {Color.RED, Color.ORANGE, Color.BLUE, Color.GRAY};
	
	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize;
		int subtot = 0;
		
		for (int i = 0; i < input.length; i++) {
			Color col = color[i];
			pieSize = input[i] *360 /100;
			g.setColor(col);
			g.fillArc(20, 20, 150, 150, startAngle, pieSize);
			startAngle += pieSize;
		}
		for (int i = 0; i < input.length; i++) {
			Color col = color[i];
			g.setColor(col);
			g.fillRect(300, 20 + i* 20,15, 15);
			
		}
		for (int i = 0; i < input.length; i++) {
			g.setColor(Color.BLACK);
			g.drawString(title[i], 320, 30+ i * 20);
		}
	}

	
}
