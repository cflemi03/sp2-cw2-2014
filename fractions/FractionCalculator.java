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
				sum = hold - (input.next());
			}
			else if (input.next() == "*") {
				sum = hold * (input.next());
			}
			else if (input.next() == " / ") {
				sum = hold / (input.next());
			}
			else if (input.next() == "/") {
				fractions.Fraction = new Fraction(hold, (input,next())
			}
			else if (input.next() == "a" || 'A') {
				fractions.Fraction = new Fraction(hold, (input,next())
			}
		}
	
	public Fraction evaluate(Fraction frac, String inputString)	{
		
	}
	
	}
}
