package start;

import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;

public class GreaterThan{
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
	public static void showArray(Integer[] array) {
		System.out.println(Arrays.toString(array));
	}
        public static void main(String[] args) {
		Vector<Integer> vInt1 = readIntegers();
		showArray(getGreaterThan(5, vInt1));
	}
}
