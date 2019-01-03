package lab4;

import java.util.Scanner;
import java.util.Vector;

public class Task1 {

	public static int getNextInteger(Scanner scIn) {
		int max_value = Integer.MIN_VALUE;
		Vector<String> result = new Vector<String>();
		while (scIn.hasNext()) {
			String word = scIn.next();
			if (word.toLowerCase().equals("close"))
				break;
			result.add(word);
		}
		for (int k = 0; k < result.size(); k++) {
			if (result.elementAt(k).charAt(0) == '-' || Character.isDigit(result.elementAt(k).charAt(0))) {
				if (max_value < Integer.parseInt(result.elementAt(k))) {
					max_value = Integer.parseInt(result.elementAt(k));
				}
				;
			}

		}
		// 123 -45 f15 15 asasdf close
		return (max_value);
	}

	public static int readNumbers() {
		Scanner sc = new Scanner(System.in);
		return (getNextInteger(sc));
	}

	public static void main(String[] args) {
		System.out.println(readNumbers());
	}
}
