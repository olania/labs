package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
	public static void countDigits(int number){
		// 123456789
		int[] frq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char[] digits = String.valueOf(number).toCharArray();
		// '1' '2' '3' '4' '5' '6' '7' '8' '9'
		for(int k = 0; k < digits.length; k++) {
			frq[Character.getNumericValue(digits[k])]++;
//		0123456789
//		1111111111
//		
//		5555533
//		0123456789
//		0002050000
		}
		System.out.println(Arrays.toString(frq));
	}
	public static void main(String[] args) {
		Scanner source = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = source.nextInt();
		countDigits(Math.abs(number));
	}
}
