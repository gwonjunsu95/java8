package Day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car ();	//Car ��ü ����(instance)

		System.out.println("������ �Է� ��");
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company = "���� �ڵ���";
		myCar.model = "�ƹݶ�";
		myCar.color = "����";
		myCar.maxSpeed = 300;
		myCar.speed = 100;
		
		System.out.println("������ �Է� ��");
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
