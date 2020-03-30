package Day12;

public class Grade {

	int x;
	int y;
	int z;
	int res;
	
	Grade(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void avg() {
		res = (x + y + z)/3;
		System.out.println(res);
		return;
	}
}
