package shape;

public abstract class Shape {
	String color="";
	Shape() {}
	Shape(String s) {
		color = s;
	}
	String getColor() {
		return color;
	}
	void setColor(String s) {
		color = s;
	}
	boolean isFilled() {
		return(color!="");
	}
	public abstract double getArea();
	public abstract double getPerimeter();
    public abstract String toString(); 
}
