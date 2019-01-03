package lab8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractCalc {
	public abstract String calculate(String argument);

	{

		/*
		 * the format of the argument: operand operator operand possible operators are:
		 * + for sum * for product - for difference
		 */

	}

	protected boolean isInteger(String s) {
		Pattern pat = Pattern.compile("^\\d+$");
		Matcher m = pat.matcher(s);
		return (m.find());
	}

	protected boolean isFoatingPoint(String s) {
		Pattern pat = Pattern.compile("^\\d+.\\d+$");
		Matcher m = pat.matcher(s);
		return (m.find());
	}

	public abstract int sum(int k1, int k2);

	// returns k1 + k2

	public abstract double sum(double k1, double k2);

	// returns k1 + k2

	public abstract String sum(String k1, String k2);

	// returns strings with all words in k1 or k2 or in both of them

	public abstract int product(int k1, int k2);

	// returns k1 * k2

	public abstract double product(double k1, double k2);

	// returns k1 * k2

	public abstract String product(String k1, String k2);

	// returns string with all words in k1 AND k2 or in both of them

	public abstract int difference(int k1, int k2);

	// return int abs;

	public abstract double difference(double k1, double k2);

	// return double abs;

	public abstract String difference(String k1, String k2);
	// returns string with all words in k1 but not k2
}

class BasicCalculator extends AbstractCalc {

	public String calculate(String argument) {
		String[] x = tokenize(argument);
		return x[1];
	}

	public static String[] parse(String argument) {
		return argument.split(" ");
	}

	public static String[] tokenize(String argument) {
		String[] result = parse(argument);
		Matcher m;
		if (result.length == 3)
			return result;
		else {
			String[] tokenized = new String[3];
			Pattern pat1 = Pattern.compile("\\s*(\\d+)\\s*([+\\-*])\\s*(\\d+)\\s*");
			Pattern pat2 = Pattern.compile("([\\w+\\s]+)\\s*([+\\-*])\\s*([\\w+\\s]+)");
			Matcher m1 = pat1.matcher(argument);
			Matcher m2 = pat2.matcher(argument);
			if (m1.find()) {
				m = m1;
			} else {
				m2.find();
				m = m2;
			}

			for (int i = 1; i <= 3; i++) {
				tokenized[i - 1] = m.group(i);

			}
			return tokenized;
		}
	}

	public int sum(int k1, int k2) {
		return k1 + k2;
	}

	public double sum(double k1, double k2) {
		return k1 + k2;
	}

	public String sum(String k1, String k2) {
		String[] s1 = parse(k1);
		String[] s2 = parse(k2);
		String result = "";
		for (int i = 0; i < s1.length; i++) {
			if (result.indexOf(s1[i]) < 0)
				result += s1[i] + " ";
		}
		for (int j = 0; j < s2.length; j++) {
			if (result.indexOf(s2[j]) < 0)
				result += s2[j] + " ";
		}
		return (result);
	}

	public int product(int k1, int k2) {
		return k1 * k2;
	}

	public double product(double k1, double k2) {
		return k1 * k2;
	}

	public String product(String k1, String k2) {
		String[] s1 = parse(k1);
		String[] s2 = parse(k2);
		String result = "";
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					result += s1[i] + " ";

				}
			}
		}
		return (result);
	}

	public int difference(int k1, int k2) {
		return (Math.abs(k1 - k2));
	}

	public double difference(double k1, double k2) {
		return (Math.abs(k1 - k2));
	}

	public String difference(String k1, String k2) {
		String[] s1 = parse(k1);
		String[] s2 = parse(k2);
		String result = "";
		boolean redflag;
		for (int i = 0; i < s1.length; i++) {
			redflag = false;
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					redflag = true;
				}
			}
			if (!redflag)
				result += s1[i] + " ";
		}
		return (result);
	}
}
