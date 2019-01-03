package lab4;

import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;

public class Task4 {
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
 	public static void countDigits(Vector<Integer> number) {
		// 123456789
                for (int i = 0; i < number.size(); i++) {
                      int[] frq = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
                      char[] digits = String.valueOf(number.elementAt(i)).toCharArray();
                      // '1' '2' '3' '4' '5' '6' '7' '8' '9'
                        for (int k = 0; k < digits.length; k++) {
                        frq[Character.getNumericValue(digits[k])]++;
                        //			0123456789
                        //			0111111111
                        //
                        //			5555533
                        //			0123456789
                          //			0002050000
                      }
                      findMax(frq);
                    //System.out.println(Arrays.toString(frq));
                }
	}

	public static void findMax(int[] array) {
		int max_index = 0;
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < array.length; k++) {
			if(array[k] > max) {
				max = array[k];
				max_index = k;
			}
		}

                //System.out.println(max_index);
                for (int k = 0; k < array.length; k++) {
			if(array[k] == max) {
                          System.out.println(k);
			}
		}
        }

	public static void main(String[] args) {
		Scanner source = new Scanner(System.in);
		System.out.print("Enter numbers: ");
                Vector<Integer> numbers = readIntegers();
		//int number = source.nextInt();
		countDigits(numbers);
	}
}