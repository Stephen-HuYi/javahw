package shape;

public class Circle extends Shape{
	double radius;
	Circle() {}
	Circle(double r) {
		radius = r;
	}
	Circle(double r,String s) {
		radius = r;
		color = s;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public String toString() {
		if(color == "") {
			return ("Circle (#)");
		}
		else {
			return ("Circle ("+ color +")");
		}
	}
}
