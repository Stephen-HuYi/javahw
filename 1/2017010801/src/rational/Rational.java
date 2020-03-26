package rational;

public class Rational {
	int numerator;
	int denominator;
	int gcd(int a,int b) {
		int k = 0;
		do {
			k = a % b;
			a = b;
			b = k;
		} while (k != 0);
		return a;
	}
	Rational(int a,int b){
		int k = gcd(a,b);
		a /= k;
		b /= k;
		numerator = a;
		denominator = b;
	} 
	void add(Rational B) {
		numerator = numerator * B.denominator + B.numerator * denominator;
		denominator = denominator*B.denominator;
		int k = gcd(numerator,denominator);
		numerator /= k;
		denominator /= k;	
	}
	void sub(Rational B) {
		numerator = numerator * B.denominator - B.numerator * denominator;
		denominator = denominator*B.denominator;
		int k = gcd(numerator,denominator);
		numerator /= k;
		denominator /= k;
	}
	void mul(Rational B) {
		numerator *= B.numerator;
		denominator *= B.denominator;
		int k = gcd(numerator,denominator);
		numerator /= k;
		denominator /= k;
	}
	void div(Rational B) {
		numerator *= B.denominator;
		denominator *= B.numerator;
		int k = gcd(numerator,denominator);
		numerator /= k;
		denominator /= k;
	}
	void printRational() {
		if(denominator!=1&&denominator!=-1) 	
			System.out.println(numerator+"/"+denominator);
		else 
			System.out.println(numerator*denominator);		
	}
	void printReal() {
		System.out.println((double)numerator/denominator);	
	}
}
