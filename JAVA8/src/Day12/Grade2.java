package Day12;

public class Grade2 {
	
	int kor, eng, mat;
	
	Grade2(int kor,int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int avg() {
		int sum = kor + eng +mat;
		return sum/3;
	}
	
	
	
	
	
	
	
	
	
}
