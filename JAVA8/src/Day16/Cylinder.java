package Day16;

public class Cylinder extends Circle {
	int height;
	
	public Cylinder(int r , int h) {
		super(r);
		this.height = h;
	}
	
	double volume () {
		return area() * height;
	}
	
	String showCylinder() {
		return showCircle() + ", height: " + height;
	}
}
