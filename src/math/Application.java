package src.math;

public class Application {
    public static void main(String[] args) {

         Printer printer = new Printer();
         UserInput getUserInput = new UserInput();
         Arithmetic userNumber = new Arithmetic();

         printer.text("Hello!");
         printer.text("Enter number: ");
         //int a = getUserInput.getNumber();
         int square = userNumber.sqr(getUserInput.getNumber());
         printer.text("Square: " + square);
         printer.text("Enter first number one more time: ");
         int b = getUserInput.getNumber();
         printer.text("Enter second number: ");
         int c = getUserInput.getNumber();
         int two = userNumber.multTwo(b, c);
         printer.text("Two of your added values multiplied by 2: " + two);
         printer.text("Have a nice day!");

         getUserInput.close();
    }
}
