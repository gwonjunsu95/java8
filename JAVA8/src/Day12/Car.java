package Day12;

public class Car {
	/* �ʵ� */
	String company = "����ڵ���";
	String model = "���";
	String color = "�Ķ�";
	int maxSpeed = 250;
	int speed = 0;
	
	/* ������ */
	Car() {	//�����ڸ� �������� ������ �⺻ �����ڰ� �ڵ����� �ۼ��˴ϴ�. 
//		this.company = "����ڵ���";
//		this.color = "����";
//		this.maxSpeed = 300;
		this("����ڵ���", "����", 300);
	}
	Car(String company, String col, int maxSpeed) {
		this.company = company;
		color = col;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed){
		this("����ڵ���", color, maxSpeed);
	}
	
	Car(int maxSpeed){
//		this.company = "����ڵ���";
//		this.color = "����";
//		this.maxSpeed = maxSpeed;
		this("����ڵ���", "����", maxSpeed);
	}
//	
//	Car(String company, int maxSpeed , String color){
//	
//	}
//	
//	Car(String color, int speed , int maxSpeed){
//	
//	}
//	
//	Car(String company, String color, int maxSpeed, int speed){
//	
//	}
//	
//	Car(int speed, String color, String company){
//	
//	}
	
	/*�޼ҵ�(�޼���)*/
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("���� �ӵ�" + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("���� �ӵ�" + speed);
	}
}
