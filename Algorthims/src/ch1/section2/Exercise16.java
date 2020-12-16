package ch1.section2;

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Rational {
	private final long numerator;
	private final long denominator;
	
	public Rational(long numerator, long denominator) {
		long n = getGreatestCommonFactor(numerator, denominator);
		this.numerator = numerator/n;
		this.denominator = denominator/n;	
	}
	
	private long getGreatestCommonFactor(long numerator, long denominator) {
		boolean end = false;
		long a;
		long b;
		long n;
		
		if(numerator > numerator) {
			a = numerator;
			b = denominator;
		}else {
			a = denominator;
			b = numerator;
		}
		// gcd
		if(a%b == 1) end = true;
		
		while(!end) {
			if(a%b != 0) {
				n = a%b;
				a = b;
				b = n;
			}else {
				end = true;
			}
		}	

		return b;
	}
	
	public Rational plus(Rational b) {
		long numerator = (this.numerator * b.denominator ) + (b.numerator * this.denominator);
		long denominator = this.denominator * b.denominator;
		long n = getGreatestCommonFactor(numerator, denominator);
		numerator = numerator/n;
		denominator = denominator/n;
		return new Rational(numerator, denominator);
		
	}

	public Rational minus(Rational b) {
		
	}
	
	public Rational times(Rational b) {
		
	}
	
	public Rational divideBy(Rational b) {
		
	}
	
	public boolean equals(Object that) {
		
	}
	
	public String toString() {
		
	}
	
	
}
