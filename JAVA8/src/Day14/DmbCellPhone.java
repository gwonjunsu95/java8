package Day14;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	void turnOnDmb() {
		System.out.println("DBM�� �մϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DBM�� ���ϴ�.");
	}
	
	void setChannel(int channel) {
		this.channel =channel;
		System.out.println(channel +"���� ä���� �����մϴ�.");
	}
}
