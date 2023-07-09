package prog;
import java.util.Scanner;

public class NoNumeral {
  public static void main(String args[]) {

    NumeralWord numeralWord = new NumeralWord();
    // String word;
    // Creating Scanner object
    Scanner scan = new Scanner(System.in);

    // Input String from user
    System.out.println("Enter a statement containing numerals (0-9)");
    String inputVal = scan.nextLine();

    // String[] word = new String[inputVal.length()];

    // Getting numeral out of the statement
    for (int i = 0; i < inputVal.length(); i++) {
      char c = inputVal.charAt(i);
      if (c >= '0' && c <= '9') {
        inputVal = inputVal.replace(Character.toString(c), numeralWord.getWord(c));
        // word[i] = numeralWord.getWord(c);
      }
    }

    System.out.println(inputVal);

    scan.close();
  }

}
