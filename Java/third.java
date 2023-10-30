import java.util.Scanner;

public class PangramChecker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine();

    boolean isPangram = true;
    for (char c = 'a'; c <= 'z'; c++) {
      if (sentence.indexOf(c) == -1 && sentence.indexOf(Character.toUpperCase(c)) == -1) {
        isPangram = false;
        break;
      }
    }

    if (isPangram) {
      System.out.println("The sentence is a pangram.");
    } else {
      System.out.println("The sentence is not a pangram.");
    }
  }
}

Approach:-

Initialize a boolean variable isPangram to true.
Iterate through each letter in the alphabet from 'a' to 'z':
a. Check if either the lowercase or uppercase version of the letter is present in the sentence.
b. If not, set isPangram to false.
If isPangram is still true after checking all letters, it's a pangram; otherwise, it's not.
Print the result accordingly.