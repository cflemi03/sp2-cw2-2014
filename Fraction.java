package fractions;

/**
 * Chris Fleming's submission for Coursework 2 - SP2
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); 
	    // this should use exceptions
            return;
        }
        int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
    }

    public Fraction(double abs) {
		
	}

	@Override
    public String toString() {
        if (getDenominator() == 1){
        	return String("" + getNumerator());
        }
		return "" + getNumerator() + '/' + getDenominator();
    }

    public String String(String numerator2) {
		return null;
	}

	public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public Fraction multiply(Fraction other) {

        int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
    }
    
    public Fraction add(Fraction other){
    	int num = 0;
    	int denom = 0;
		if (this.getDenominator() == other.getDenominator()) {
			num = this.getNumerator() + other.getNumerator();
			denom = this.getDenominator();
		}
		else {
			while (this.getDenominator() != other.getDenominator()) {
				denom = (this.getDenominator() * other.getDenominator());
				num = (this.getNumerator() * other.getDenominator());
				int num2 = (other.getNumerator() * this.getDenominator());
				num += num2;
			}
		}
		return new Fraction(num, denom);
    }
    
    public Fraction subtract(Fraction other){
    	int num = 0;
    	int denom = 0;
		if (this.getDenominator() == other.getDenominator()) {
			num = this.getNumerator() - other.getNumerator();
			denom = this.getDenominator();
		}
		else {
			while (this.getDenominator() != other.getDenominator()) {
				denom = (this.getDenominator() * other.getDenominator());
				num = (this.getNumerator() * other.getDenominator());
				int num2 = (other.getNumerator() * this.getDenominator());
				num -= num2;
			}
		}
		return new Fraction(num, denom);
    }

    public Fraction divide(Fraction other){
    	int holddenom = other.getDenominator();
    	int holdnum = other.getNumerator();
    	int num = this.getNumerator() * holddenom;
        int denom = this.getDenominator() * holdnum;
        return new Fraction(num, denom);
    }
    
    public Fraction absValue(Fraction other) {

        int num = this.getNumerator();
        int denom = this.getDenominator();
        double abs = (num*1.0) / (denom*1.0);
        return new Fraction(abs);
    }
    
    public Fraction negate(Fraction other) {

        int num = 0 - this.getNumerator();
        int denom = this.getDenominator();
        return new Fraction(num, denom);
    }
    
    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
