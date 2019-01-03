package lab8;

import java.util.Scanner;

public class LineCalculator extends BasicCalculator {
	public String calculate(String argument) {
		String result = "";
		String[] x = BasicCalculator.tokenize(argument);
		if (x.length < 3)
			wrongFormatSpaces();

		if (isInteger(x[0]) && isInteger(x[2])) {

			int k1 = Integer.parseInt(x[0]);
			int k2 = Integer.parseInt(x[2]);
			if (x[1].indexOf("+") > -1) {

				result = String.valueOf(sum(k1, k2));

			} else if (x[1].indexOf("*") > -1)
				result = String.valueOf(product(k1, k2));
			else if (x[1].indexOf("-") > -1)
				result = String.valueOf(difference(k1, k2));
			else wrongFormatOperand();

		} else if (isFoatingPoint(x[0]) || isFoatingPoint(x[2])) {
			double k1 = Double.parseDouble(x[0]);
			double k2 = Double.parseDouble(x[2]);
			if (x[1].indexOf("+") > -1)
				result = String.valueOf(sum(k1, k2));
			else if (x[1].indexOf("*") > -1)
				result = String.valueOf(product(k1, k2));
			else if (x[1].indexOf("-") > -1)
				result = String.valueOf(difference(k1, k2));
			else wrongFormatOperand();
		} else {
			int k = -1;
			String k1 = "";
			String k2 = "";
			for (int i = 0; i < x.length; i++) {
				String t = x[i];
				if (t.indexOf("+") > -1 || t.indexOf("-") > -1 || t.indexOf("*") > -1)
					k = i;
				else {
					if (k < 0)
						k1 += t;
					else
						k2 += t;
				}
			}
			if (k < 0) {
				wrongFormatSpaces();
			}
			if (x[k].indexOf("+") > -1)
				result = sum(k1, k2);
			else if (x[k].indexOf("*") > -1)
				result = product(k1, k2);
			else if (x[k].indexOf("-") > -1)
				result = difference(k1, k2);
		}

		return result;
	}

	public static void wrongFormatOperand() {
		System.out.println("Wrong input line format: cannot find + or - or *");
		System.exit(1);
	}

	public static void wrongFormatSpaces() {
		System.out.println("Wrong input line format: cannot find operand operator operand");
		System.exit(2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		// System.out.println(str);
		scanner.close();
		LineCalculator lc = new LineCalculator();
		System.out.println(lc.calculate(str));
	}
}