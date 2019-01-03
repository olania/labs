package start;

import java.util.Scanner;
import java.util.Vector;
public class printAllLinesWith{
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
  public static Vector<String> readWords() {
    Scanner sc = new Scanner(System.in);
    return (readWords(sc));
  }

  public static Vector<String> readLines() {
    Scanner sc = new Scanner(System.in);
    return (readLines(sc));
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

  public static void main(String[] args) {
    Vector<String> lines = readLines();
    if (args.length == 0){
      Vector<String> wordsInNeed = readWords();
      printAllLinesWith(wordsInNeed, lines);
    }
    else {
      printAllLinesWith(args, lines);
    }
  }

}
