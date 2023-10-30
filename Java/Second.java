import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Roman numeral:");
    String romanNumeral = scanner.nextLine();

    int integerValue = 0;
    for (int i = 0; i < romanNumeral.length(); i++) {
      char currentChar = romanNumeral.charAt(i);
      int currentValue = 0;

      switch (currentChar) {
        case 'I':
          currentValue = 1;
          break;
        case 'V':
          currentValue = 5;
          break;
        case 'X':
          currentValue = 10;
          break;
        case 'L':
          currentValue = 50;
          break;
        case 'C':
          currentValue = 100;
          break;
        case 'D':
          currentValue = 500;
          break;
        case 'M':
          currentValue = 1000;
          break;
      }

      if (i + 1 < romanNumeral.length()) {
        char nextChar = romanNumeral.charAt(i + 1);
        int nextValue = 0;

        switch (nextChar) {
          case 'V':
            nextValue = 5;
            break;
          case 'X':
            nextValue = 10;
            break;
          case 'L':
            nextValue = 50;
            break;
          case 'C':
            nextValue = 100;
            break;
          case 'D':
            nextValue = 500;
            break;
          case 'M':
            nextValue = 1000;
            break;
        }

        if (currentValue < nextValue) {
          integerValue -= currentValue;
        } else {
          integerValue += currentValue;
        }
      } else {
        integerValue += currentValue;
      }
    }

    System.out.println("The integer value  is: " + integerValue);
  }
}

Approach:-

Initialize an integer variable integerValue to 0.
Iterate through the Roman numeral characters from left to right.
If the current character's value is less than the next character's value, 
subtract the current character's value from integerValue; otherwise, add it.
Return the final integerValue as the integer equivalent of the Roman numeral.