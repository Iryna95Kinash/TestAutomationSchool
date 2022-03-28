package src.firsttasks;

import java.util.Scanner;

public class MaksTask3 {
  public static void main(String[] args) {
    print("Hello!");
    
    Scanner scanner = new Scanner(System.in);

    print("Enter the number: ");

    Double firstUserInput = scanner.nextDouble();
    print("Your number is: " + firstUserInput);

    print("Enter next number: ");

    Double secondUserInput = scanner.nextDouble();
    print("Your second number is: " + secondUserInput);

    print("Select a symbol (+, -, *, /): ");

    String thirdUserInput = scanner.next();

    scanner.close();

    if (thirdUserInput.contains("+")) {
        print("Your result = " + (summ(firstUserInput, secondUserInput)));
    }
    else if (thirdUserInput.contains("-")) {
        print("Your result = " + (diff(firstUserInput, secondUserInput)));
    }
    else if (thirdUserInput.contains("*")) {
        print("Your result = " + (prod(firstUserInput, secondUserInput)));
    }
    else if (thirdUserInput.contains("/")) {
        print("Your result = " + (quot(firstUserInput, secondUserInput)));
    } else {
        print("This symbol is not present in the list");
    }

  }

  static void print(String someText) {
    System.out.println(someText);
  }

  static Double summ(Double number1, Double number2) {
    return number1 + number2;
  }

  static Double diff(Double number1, Double number2) {
    return number1 - number2;
  }

  static Double prod(Double number1, Double number2) {
    return number1 * number2;
  }

  static Double quot(Double number1, Double number2) {
    return number1 / number2;
  }

}
