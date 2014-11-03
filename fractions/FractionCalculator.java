package fractions;

import java.util.Scanner; 
import fractions.Fraction;

public class FractionCalculator {

	public FractionCalculator() {
		new Fraction(0,1);
	}
	
	public String calc(String calc, int hold) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		while (input.notEmpty()) {
			if ((input.next()).isDigit()){
				hold = input.next();
			}
			if (input.next() == "+") {
				add sum1 = new add();
				sum = hold + (input.next());
			}
			else if (input.next() == "-") {
				subtract sum1 = new subtract();
				sum = hold - (input.next());
			}
			else if (input.next() == "*") {
				multiply sum1 = new multiply();
				sum = hold * (input.next());
			}
			else if (input.next() == " / ") {
				divide sum1 = new divide();
				sum = hold / (input.next());
			}
			else if (input.next() == "/") {
				Fraction = new Fraction(hold, (input,next());
			}
			else if (input.next() == "a" || "A") {
				absValue sum1 = new absValue();
			}
			else if (input.next() == "n" || "N") {
				negate sum1 = new negate();
			}
			else if (input.next() == "c" || "N") {
				sum = 0;
				new Fraction(0,1);
			}
			else {
				return "0";
			}
		}
	}
	public Fraction evaluate(Fraction frac, String inputString)	{
		return frac;
	}
}
