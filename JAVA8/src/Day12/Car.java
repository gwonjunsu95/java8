package Day12;

public class Car {
	/* 필드 */
	String company = "기아자동차";
	String model = "쏘울";
	String color = "파랑";
	int maxSpeed = 250;
	int speed = 0;
	
	/* 생성자 */
	Car() {	//생성자를 생성하지 않으면 기본 생성자가 자동으로 작성됩니다. 
//		this.company = "기아자동차";
//		this.color = "검정";
//		this.maxSpeed = 300;
		this("기아자동차", "검정", 300);
	}
	Car(String company, String col, int maxSpeed) {
		this.company = company;
		color = col;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String color, int maxSpeed){
		this("기아자동차", color, maxSpeed);
	}
	
	Car(int maxSpeed){
//		this.company = "기아자동차";
//		this.color = "검정";
//		this.maxSpeed = maxSpeed;
		this("기아자동차", "검정", maxSpeed);
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
	
	/*메소드(메서드)*/
	void accel() {
		speed += 10;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
		System.out.println("현재 속도" + speed);
	}
	
	void brake() {
		speed = 0;
		System.out.println("현재 속도" + speed);
	}
}
