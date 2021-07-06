import java.io.IOException;
import java.util.Scanner;

public class ShoutDetector {
  public static void main(String[] args) throws IOException{
    // Your code here
    Scanner scanner = new Scanner(System.in);

    System.out.println("Hello! Please, say something");
    String userInput = scanner.next();

    if(userInput.equals(userInput.isUpperCase()) {
      System.out.println("You said: " + userInput + "\nPlease stop yelling at me.");
    } else {
      System.out.println("You said: " + userInput + " Ok, thanks.");
    }
  }
}