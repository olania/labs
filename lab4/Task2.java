package lab4;

import java.util.Scanner;
//import java.util.Vector;
//import java.util.Collections;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Vector;

public class Task2 {
	public static Vector<Integer> readIntegers(Scanner scIn) {
		Vector<Integer> result = new Vector<Integer>();
		while (scIn.hasNextInt()) {
			Integer number = scIn.nextInt();
			result.add(number);
		}
		return (result);
	}

	public static Vector<Integer> readIntegers() {
		Scanner sc = new Scanner(System.in);
		return (readIntegers(sc));
	}

	public static void main(String[] args) {
		Vector<Integer> vectorInt = readIntegers();
		for (int k = 0; k < vectorInt.size(); k++) {
			int number = vectorInt.elementAt(k);
			if (number < 10 && number > -10) {
				continue;
			}
			String myString = String.valueOf(number);
			//if (myString.length() <= 1) {continue;}
			char lastChar = myString.charAt(myString.length() - 1);
			char secondLastChar = myString.charAt(myString.length() - 2);
			if (lastChar == secondLastChar) {
				System.out.println(number);
			}
		}
		// [1122, 55, 21341]
		// ["1122", "55", "21341"]
	}
}
