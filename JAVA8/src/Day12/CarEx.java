package Day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car ();	//Car 객체 생성(instance)

		System.out.println("데이터 입력 전");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company = "현대 자동차";
		myCar.model = "아반떼";
		myCar.color = "은색";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println("데이터 입력 후");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
		
		int num1 = 10;
		int num2 = 10;
		num1 = 100; 
		
	}
}
