package lab4;

import java.util.Scanner;
import java.util.Vector;

public class Task5 {
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
      findMoreThanAverage(frq);
      //		System.out.println(Arrays.toString(the_most_frq));
    }
  }

  public static void findMoreThanAverage(int[] array) {
    float sum = 0;
    int length = 0;
    for (int k = 0; k < array.length; k++) {
      sum += array[k];
      if(array[k] != 0) {
        length++;
      }
    }
    float avrg = sum / length;
    //		float avrg = sum / array.length;
    //		System.out.println("Average is " + avrg + "(ommiting zero elements)");
    for (int k = 0; k < array.length; k++) {
      if (array[k] > avrg) {

        System.out.println(k);
      }
    }
  }

  public static void main(String[] args) {
    Scanner source = new Scanner(System.in);
    System.out.print("Enter a number: ");
    Vector<Integer> numbers = readIntegers();
    System.out.println(numbers);
    //int[] numbers = source.nextInt();
    countDigits(numbers);
  }
}

