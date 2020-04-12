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
		super("가위 바위 보 게임");
		gameStart();
		
	}

	public void gameStart() {
		Container cpane = getContentPane();
		cpane.setLayout(null);
		Color bg = new Color(255, 255, 255);
		cpane.setBackground(bg);
		ga = new JButton("가위");
		ba = new JButton("바위");
		bo = new JButton("보");
		end = new JButton("종료");
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
			list.add("목숨을 모두 사용하셨습니다.");
			list.add("최종 점수: " + cnt);
			list.add("잠시후 게임을 종료합니다. ");

			try {
				Thread.sleep(5000);
				System.exit(0);
			} catch (InterruptedException e1) {
			}

		}

		if (e.getSource() == ba) {

			list.add("바위를 내셨군요.");

			getFight(com, "바위");

			list.add("남은 목숨 : " + life + " 점수 : " + cnt);
			list.add("");
		} else if (e.getSource() == bo) {

			list.add("보를 내셨군요.");

			getFight(com, "보");

			list.add("남은 목숨 : " + life + " 점수 : " + cnt);
			list.add("");
		} else if (e.getSource() == ga) {

			list.add("가위를 내셨군요.");

			getFight(com, "가위");

			list.add("남은 목숨 : " + life + " 점수 : " + cnt);
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
			com = "가위";
			break;

		case 1:
			com = "바위";
			break;

		default:
			com = "보";
			break;

		}

	}

	static void getFight(String com, String user) {

		if (com.equals("바위")) {

			if (user.equals("바위")) {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("비겼습니다.");

			} else if (user.equals("보")) {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("이겼습니다.");

				cnt++;
			} else {

				list.add("컴퓨터는 바위를 냈습니다.");

				list.add("졌습니다.");

				life--;
			}

		}

		if (com.equals("가위")) {

			if (user.equals("바위")) {

				list.add("컴퓨터는 가위를 냈습니다.");

				list.add("이겼습니다.");

				cnt++;
			} else if (user.equals("보")) {

				list.add("컴퓨터는 가위를 냈습니다.");

				list.add("졌습니다.");

				life--;
			} else {

				list.add("컴퓨터는 가위를 냈습니다.");

				list.add("비겼습니다.");

			}

		}

		if (com.equals("보")) {

			if (user.equals("바위")) {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("졌습니다.");

				life--;
			} else if (user.equals("보")) {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("비겼습니다.");

			} else {

				list.add("컴퓨터는 보를 냈습니다.");

				list.add("이겼습니다.");

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
