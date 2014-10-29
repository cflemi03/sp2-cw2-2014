package fractions;

import java.util.Scanner; 
import class.fractions.Fraction();

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
		}
			
	}
}
