package Day21;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JComboBoxTest extends JFrame{
	JComboBox<String> jcb;
	JCheckBox jcb1, jcb2, jcb3;
	JComboBox jcm1;
	JPanel jp1;
	String[] title = {"C", "비주얼베이직","JAVA프로그래밍", "자료구조", "이산수학"};
	JComboBoxTest(){
		super("콤보박스만들기");
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jcb1 = new JCheckBox("컴퓨터공학", true);
		jcb2 = new JCheckBox("전자상거래", true);
		jcb3 = new JCheckBox("경영학", false);
		jp1.add(jcb1);jp1.add(jcb2);jp1.add(jcb3);
		add(jcm1);
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JComboBoxTest();
	}
}
