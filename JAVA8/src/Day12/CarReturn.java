package Day12;

public class CarReturn {
	// 필드
	int gas;

	// 생성자 - 생략되면 기본생성자 생성

	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. (gas잔량: " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량: " + gas + ")");
				System.out.println("임시출력");
				return;
//				System.out.println("리턴 후 출력");	//불필요한 부분
			}
		}
	}
}
