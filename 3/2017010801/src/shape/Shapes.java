package shape;

public class Shapes {
	Shape shapelist[];
	Shapes(Shape list[]) {
		shapelist = list;
	} 
	double getArea() {
		double area = 0;
		for(int i=0;i<shapelist.length;i++) {
			area += shapelist[i].getArea();
		}
		return area;
	}
	double getFilledArea() {
		double filledarea = 0;
		for(int i=0;i<shapelist.length;i++) {
			if(shapelist[i].color!="") {
				filledarea += shapelist[i].getArea();
			}			
		}
		return filledarea;
	}
	public String toString() {
		String s="[";
		for(int i=0;i<shapelist.length;i++) {
			s += shapelist[i].toString();
			if(i!=shapelist.length-1) {
				s += ", ";
			}
			else {
				s += "]";
			}
		}
		return s;
	}
}
