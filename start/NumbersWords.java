package start;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class NumbersWords {
	public static Vector<Integer> readIntegers(Scanner scIn) {
		Vector<Integer> result = new Vector<Integer>();
		while (scIn.hasNextInt()) {
			Integer number = scIn.nextInt();
			result.add(number);
		}
		return (result);
	}

	public static Vector<String> readWords(Scanner scIn) {
		Vector<String> result = new Vector<String>();
		while (scIn.hasNext()) {
			String word = scIn.next();
			if (word.toLowerCase().equals("exit"))
				break;
			result.add(word);
		}
		return (result);
	}

	public static Vector<String> readLines(Scanner scIn) {
		Vector<String> result = new Vector<String>();
		while (scIn.hasNextLine()) {
			String line = scIn.nextLine();
			if (line.toLowerCase().equals("exit"))
				break;
			result.add(line);
		}
		return (result);
	}

	public static Vector<Integer> readIntegers() {
		Scanner sc = new Scanner(System.in);
		return (readIntegers(sc));
	}

	public static Vector<String> readWords() {
		Scanner sc = new Scanner(System.in);
		return (readWords(sc));
	}

	public static Vector<String> readLines() {
		Scanner sc = new Scanner(System.in);
		return (readLines(sc));
	}

	// public static void showMaxValue(Vector<Integer> v) {
	// int max = Integer.MIN_VALUE;
	// System.out.println(max);
	// }
	public static Integer[] getGreaterThan(int limit, Vector<Integer> numbers) {
		Integer[] result = null;
		ArrayList<Integer> interim_result = new ArrayList<Integer>();

		int size = numbers.size();
		for (int k = 0; k < size; k++) {
			int num = numbers.elementAt(k);
			if (num > limit) {
				interim_result.add(num);
			}
		}
		if (interim_result.size() > 0) {
			Integer[] interim_result_arr = new Integer[interim_result.size()];
			return (interim_result.toArray(interim_result_arr));
		} else {
			return (result);
		}
	}

	public static void printLargers(int howMany, Vector<Integer> numbers) {
		// print the howMany largest values from the vector numbers
		int size = numbers.size();
		if (howMany > size) {
			System.out.println("howMany cannot be greater than Vector size!");
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

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void printPalindromes(Vector<String> words) {
		int size = words.size();
		System.out.println("palindromes are: ");
		for (int k = 0; k < size; k++) {
			String word = words.elementAt(k);
			if (isPalindrome(word)) {
				System.out.print(word + " ");
			}
		}
		System.out.println();
	}

	public static void printAllLinesWith(Vector<String> wordsInNeed, Vector<String> lines) {

		// print all lines from standard input that have all wordsInNeed
		// You can enter the wordsIneed with with readWords method
		// or use argument of the main method
		// enter the code here
		int lines_amount = lines.size();
		int words_amount = wordsInNeed.size();
		for (int l = 0; l < lines_amount; l++) {
			boolean exist = false;
			for (int k = 0; k < words_amount; k++) {
				if (lines.elementAt(l).toLowerCase().contains(wordsInNeed.elementAt(k).toLowerCase())) {
					exist = true;
				} else {
					exist = false;
					break;
				}
			}
			if (exist) {
				System.out.println(lines.elementAt(l));
			}
		}
	}

	public static void printAllLinesWith(String[] wordsInNeed, Vector<String> lines) {
		Vector<String> result = new Vector<String>();
		for (int k = 0; k < wordsInNeed.length; k++) {
			result.add(wordsInNeed[k]);
		}
		printAllLinesWith(result, lines);
	}

	public static void showNumbers(Vector<Integer> v) {
		int size = v.size();
		for (int k = 0; k < size; k++) {
			System.out.println(v.elementAt(k));
		}
		System.out.println();
	}

	private static void showWords(Vector<String> vSt) {
		// System.out.println("vString: " + vSt);
		// System.out.println("size of v vector: " + vSt.size());
		int size = vSt.size();
		for (int k = 0; k < size; k++) {
			System.out.println(vSt.elementAt(k));
		}
		System.out.println();

	}

	public static void showArray(Integer[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Vector<Integer> vInt1 = readIntegers();
		Vector<String> vSt1 = readWords();
		showNumbers(vInt1);
		showWords(vSt1);
		showArray(getGreaterThan(5, vInt1));
		printLargers(5, vInt1);
		printPalindromes(vSt1);
		Vector<String> lines = readLines();
		if (args.length == 0) {
			Vector<String> wordsInNeed = readWords();
			printAllLinesWith(wordsInNeed, lines);
		} else {
			printAllLinesWith(args, lines);
		}
		// Vector<String> wordsInNeed = readWords();
		// printAllLinesWith(wordsInNeed, lines);
		// args[0];
		// args[1];
	}

}
