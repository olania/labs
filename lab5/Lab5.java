package lab5;

import java.util.Arrays;
// need only to print the results

public class Lab5 {
	// Task 1
	public static int[][] createRectArray(int rowNo, int colNo) {
		int[][] array = new int[rowNo][colNo];
		for (int i = 0; i < rowNo; i++) {
			array[i] = new int[colNo];
		}
		return array;

	}

	// Task 2
	public static int[][] createTriangleArray(int rowNo) {
		int[][] array = new int[rowNo][];
		for (int i = 0; i < rowNo; i++) {
			array[i] = new int[i + 1];
		}
		return array;
	}

	// Task 3
	public static int calcFibonacci(int n) {
		int fib = 1;
		if (n > 1) {
			fib = calcFibonacci(n - 1) + calcFibonacci(n - 2);
		}
		return fib;
	}

	// Task 4
	public static void fillWithFibonacci(int[][] data) {
		int colNum = data[0].length;
		int lastRow = data.length;
		boolean isTriange = true;
		if (colNum > 1)
			isTriange = false;
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < colNum; j++) {
				if (isTriange) {
					data[i][j] = calcFibonacci((i * i + i) / 2 + j);
				} else {
					data[i][j] = calcFibonacci((i * colNum) + j);
					// System.out.print(" :" + ((i * colNum) + j) + ":" );
				}
				// System.out.print(data[i][j]);
			}
			if (isTriange && (colNum < lastRow))
				colNum++;
			// System.out.println();
		}
	}

	// Task 5
	public static int lookup(int[][] data, int val) {
		int result = 0;
		int colNum = data[0].length;
		int lastRow = data.length;
		boolean isTriange = true;
		if (colNum > 1)
			isTriange = false;
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < colNum; j++) {
				if (data[i][j] == val)
					result++;
			}
			if (isTriange && colNum < lastRow)
				colNum++;
		}
		return (result);
	}

	// Task 6
	public static void showByRows(int[][] data) {
		int colNum = data[0].length;
		int lastRow = data.length;
		boolean isTriange = true;
		if (colNum > 1)
			isTriange = false;
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < colNum; j++) {
				System.out.format("%-8d", data[i][j]);
			}
			if (isTriange && colNum < lastRow)
				colNum++;
			System.out.println(" ");
		}
	}

	public static int getGreatesOdd(int[][] data) {
		int greatest = 1;
		int colNum = data[0].length;
		int lastRow = data.length;
		boolean isTriange = true;
		if (colNum > 1)
			isTriange = false;
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < colNum; j++) {
				int n = data[i][j];
				if (n % 2 == 1 && n > greatest)
					greatest = n;
			}
			if (isTriange && colNum < lastRow)
				colNum++;
		}
		return (greatest);
	}

	public static int getGreatesEven(int[][] data) {
		int greatest = 1;
		int colNum = data[0].length;
		int lastRow = data.length;
		boolean isRectArray = true;
		if (colNum > 1)
			isRectArray = false;
		for (int i = 0; i < lastRow; i++) {
			for (int j = 0; j < colNum; j++) {
				int n = data[i][j];
				if (n % 2 == 0 && n > greatest)
					greatest = n;
			}
			if (isRectArray && colNum < lastRow)
				colNum++;
		}
		return (greatest);
	}

	public static void main(String[] args) {
		System.out.println(calcFibonacci(8));
		int[][] ra = createRectArray(3, 4);
		int[][] rt = createTriangleArray(4);
		fillWithFibonacci(rt);
		fillWithFibonacci(ra);
		showByRows(rt);
		showByRows(ra);
		// System.out.println(lookup(rt, 1));
		System.out.println(getGreatesOdd(rt));
		System.out.println(getGreatesEven(ra));
	}
}
