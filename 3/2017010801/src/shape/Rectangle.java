package shape;

public class Rectangle extends Shape{
	double width;
	double height;
	Rectangle() {}
	Rectangle(double d,double h) {
		width = d;
		height = h;
	}
	Rectangle(double d,double h,String s) {
		width = d;
		height = h;
		color = s;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double d) {
		width = d;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double h) {
		height = h;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public String toString() {
		if(color == "") {
			return ("Rectangle (#)");
		}
		else {
			return ("Rectangle ("+ color +")");
		}
	}
}
