package complex;

public class Complex {
	double realPart;
	double imaginaryPart;
	Complex(double re,double im) {
		realPart = re;
		imaginaryPart = im;
	}
	void add(Complex B) {
		realPart += B.realPart;
		imaginaryPart += B.imaginaryPart;		
	}
	void sub(Complex B) {
		realPart -=  B.realPart ;
		imaginaryPart -= B.imaginaryPart ;
	}
	void print() {
		if(imaginaryPart>=0)
			System.out.println(realPart+"+"+imaginaryPart+"i");
		else
			System.out.println(realPart+"-"+(-imaginaryPart)+"i");
	}
}
