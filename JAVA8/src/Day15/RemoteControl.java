package Day15;

public interface RemoteControl {

	public static int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;				//public static 자동생성
	
	
	abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	default void setMute(boolean mute) {			//default로 일반 메소드 생성가능
		if(mute) {
			System.out.println("음소거 상태로 설정합니다");
		} else {
			System.out.println("음소거 상태를 해제합니다");
		}
	}
	
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
