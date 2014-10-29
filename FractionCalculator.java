package fractions;

import java.util.Scanner; 

public class FractionCalculator {

	public FractionCalculator() {
		new Fraction(0,1);
	}
	
	public String calc(String calc, String hold) {
		Scanner input = new Scanner(System.in);
		hold = input.next();
		if (hold.isDigit())
		if (input.next() == "+") {
			int sum = hold + input.next();
		}
		int num1 = input.nextInt();
	}
}
