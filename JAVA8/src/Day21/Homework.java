package Day21;

import java.awt.Color;
import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Homework extends JFrame implements ActionListener {

	static String user = "";
	static String com = "";
	static int co = 0;
	static int cnt = 0;
	static int life = 5;

	JButton ga;
	JButton ba;
	JButton bo;
	JButton end;
	JButton reset;
	static List list;

	public Homework() {
		super("���� ���� �� ����");
		gameStart();
		
	}

	public void gameStart() {
		Container cpane = getContentPane();
		cpane.setLayout(null);
		Color bg = new Color(255, 255, 255);
		cpane.setBackground(bg);
		ga = new JButton("����");
		ba = new JButton("����");
		bo = new JButton("��");
		end = new JButton("����");
		reset = new JButton("reset");
		list = new List();
		ga.setBounds(30, 250, 70, 30);
		ba.setBounds(130, 250, 70, 30);
		bo.setBounds(230, 250, 70, 30);
		end.setBounds(330, 250, 70, 30);
		reset.setBounds(330, 220, 70, 30);
		list.setBounds(30, 20, 370, 180);
		cpane.add(ga);
		cpane.add(ba);
		cpane.add(bo);
		cpane.add(end);
		cpane.add(list);
		cpane.add(reset);
		ga.addActionListener(this);
		ba.addActionListener(this);
		bo.addActionListener(this);
		end.addActionListener(this);
		reset.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (life == 0) {
			list.add("����� ��� ����ϼ̽��ϴ�.");
			list.add("���� ����: " + cnt);
			list.add("����� ������ �����մϴ�. ");

			try {
				Thread.sleep(5000);
				System.exit(0);
			} catch (InterruptedException e1) {
			}

		}

		if (e.getSource() == ba) {

			list.add("������ ���̱���.");

			getFight(com, "����");

			list.add("���� ��� : " + life + " ���� : " + cnt);
			list.add("");
		} else if (e.getSource() == bo) {

			list.add("���� ���̱���.");

			getFight(com, "��");

			list.add("���� ��� : " + life + " ���� : " + cnt);
			list.add("");
		} else if (e.getSource() == ga) {

			list.add("������ ���̱���.");

			getFight(com, "����");

			list.add("���� ��� : " + life + " ���� : " + cnt);
			list.add("");
		} else if (e.getSource() == reset) {

			list.removeAll();

			startMix();

		} else if (e.getSource() == end) {

			System.exit(0);

		}

	}

	static void startMix() {

		co = (int) (Math.random() * 3);

		switch (co) {

		case 0:
			com = "����";
			break;

		case 1:
			com = "����";
			break;

		default:
			com = "��";
			break;

		}

	}

	static void getFight(String com, String user) {

		if (com.equals("����")) {

			if (user.equals("����")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

			} else if (user.equals("��")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�̰���ϴ�.");

				cnt++;
			} else {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

				life--;
			}

		}

		if (com.equals("����")) {

			if (user.equals("����")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�̰���ϴ�.");

				cnt++;
			} else if (user.equals("��")) {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

				life--;
			} else {

				list.add("��ǻ�ʹ� ������ �½��ϴ�.");

				list.add("�����ϴ�.");

			}

		}

		if (com.equals("��")) {

			if (user.equals("����")) {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("�����ϴ�.");

				life--;
			} else if (user.equals("��")) {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("�����ϴ�.");

			} else {

				list.add("��ǻ�ʹ� ���� �½��ϴ�.");

				list.add("�̰���ϴ�.");

				cnt++;
			}

		}

		startMix();

	}

	public static void main(String args[]) {

		startMix();

		Homework hw = new Homework();

		hw.setSize(450, 330);
		hw.setVisible(true);

	}
}
