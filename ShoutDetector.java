import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ShoutDetector {
  public static void main(String[] args) throws IOException {
    // Your code here
    Scanner scanner = new Scanner(System.in);

    boolean askQuestion = true;
    while (askQuestion) {
      System.out.println("Hello! Please, say something");
      String userInput = scanner.next();

      System.out.println("You said: " + userInput);

      int counterSingle = 0;
      for (int i = 0; i < userInput.length(); i++) {
        if (userInput.charAt(i) == '!') {
          counterSingle++;
      }
      int counterDouble = 0;
        for (int i = 0; i < userInput.length() - 1; i++) {
        if (userInput.charAt(i) == '!' && userInput.charAt(i + 1) == '?') {
          counterDouble++;
        }
      }
      if (userInput == userInput.toUpperCase() || (counterSingle > 1 && counterDouble == 0)) {
        System.out.println("Please stop yelling at me.");
      } else if (counterDouble > 1) {
        System.out.println("I don't respond to inflammatory questions");
      } else {
        System.out.println("Ok, thanks.");
         askQuestion = false;
      }
    }

  }
}