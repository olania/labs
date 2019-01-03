package start;
import java.util.Scanner;
import java.util.Vector;

public class printPalindromes {

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
	public static Vector<String> readWords() {
		Scanner sc = new Scanner(System.in);
		return (readWords(sc));
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

        public static void main(String[] args) {
          Vector<String> vSt1 = readWords();
          printPalindromes(vSt1);
	}

}
