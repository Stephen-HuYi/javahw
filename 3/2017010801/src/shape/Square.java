package shape;

public class Square extends Rectangle {
	double side;
	Square() {}
	Square(double a) {
		side = a;
		width = a;
		height = a;
	}
	Square(double a,String s) {
		side = a;
		width = a;
		height = a;
		color = s;
	}
	double getSide() {
		return side;
	}
	void setSide(double a) {
		side = a;
		width = a;
		height = a;
	}
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}
	public String toString() {
		if(color == "") {
			return ("Square (#)");
		}
		else {
			return ("Square ("+ color +")");
		}
	}
}
