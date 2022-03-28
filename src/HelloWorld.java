package src;

import java.util.Scanner;

public class HelloWorld {
    // This is commentar
    
    // main is the poin of entry for the programm
    // shortcut: type 'main' and press ctrl + space bar
    public static void main(String[] args) {
        printText("Hello bitch!");
        printText("Enter first side: ");
        int a = getUserInput();
        printText("You entered: " + a);
        printText("Enter second side, please: ");
        int b = getUserInput();
        printText("You entered: " + b);
        int perimetr = getPerimetr(a, b);
        int square = getSquare(a, b);
        printText("Perimetr = " + perimetr);
        printText("Square = " + square);
        printText("You have a result, so fuck off!!!");
    }

        static int getSquare(int a, int b) {
        return a * b;
    }

        static int getPerimetr(int a, int b) {
        return a + a + b + b;
    }

        static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
    }

    static void printText(String text) {
        System.out.println(text);
    }


}