package start;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class printLargers{
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

	public static void printLargers(int howMany, Vector<Integer> numbers) {
		// print the howMany largest values from the vector numbers
		int size = numbers.size();
		if (howMany > size) {
			System.out.println("howMany ("+ howMany +") cannot be greater than the Vector size! (" + numbers.size() + ")");
		} else {
			int offset = size - howMany;
			Collections.sort(numbers);
			System.out.println("The " + howMany + " largest elements are:");
			for (int k = offset; k < size; k++) {
				System.out.print(numbers.elementAt(k) + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Vector<Integer> vInt1 = readIntegers();
                printLargers(5, vInt1);
	}
}
