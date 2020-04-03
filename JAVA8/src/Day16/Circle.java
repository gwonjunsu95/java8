package Day16;

public class Circle {

	static final double pi = Math.PI;
	int r;

	public Circle(int r) {
		this.r = r;
	}
	
	double area() {
		return pi * r * r;
	}
	
	String showCircle() {
		return "Radius: " + r;
	}
}
