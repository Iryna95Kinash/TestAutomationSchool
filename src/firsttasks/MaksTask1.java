package src.firsttasks;

import java.util.Scanner;

public class MaksTask1 {
  public static void main(String[] args) {
    System.out.println("Hello!");
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number: ");

    Double firstUserInput = scanner.nextDouble();
    System.out.println("Your number is: " + firstUserInput);

    System.out.print("Enter next number: ");

    Double secondUserInput = scanner.nextDouble();
    System.out.println("Your second number is: " + secondUserInput);

    scanner.close();

    System.out.println("Summ of your values = " + (firstUserInput + secondUserInput));
    System.out.println("Dfference of your values = " + (firstUserInput - secondUserInput));
    System.out.println("Product of your values = " + (firstUserInput * secondUserInput));
    System.out.println("Quotient of your values = " + (firstUserInput / secondUserInput));
  }
}
