package Day15;

public interface RemoteControl {

	public static int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;				//public static �ڵ�����
	
	
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	default void setMute(boolean mute) {			//default�� �Ϲ� �޼ҵ� ��������
		if(mute) {
			System.out.println("���Ұ� ���·� �����մϴ�");
		} else {
			System.out.println("���Ұ� ���¸� �����մϴ�");
		}
	}
	
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
