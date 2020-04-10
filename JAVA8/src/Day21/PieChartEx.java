package Day21;

import java.awt.Color;

import javax.swing.JFrame;

public class PieChartEx {
	public static void main(String[] args) {
		JFrame t = new JFrame("실습문제1");
		
		PieChart pie = new PieChart();
		
		t.add(pie);
		t.setBackground(Color.LIGHT_GRAY);
		t.setSize(500, 500);
		t.setResizable(false);
		t.getDefaultCloseOperation();
		t.setVisible(true);
		
	}

}
