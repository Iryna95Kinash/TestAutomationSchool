package src.calculator;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    int getInput() {
        return scanner.nextInt();
    }

    String getSymble() {
        return scanner.next();
    }
}
