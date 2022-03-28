package src.human;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    String getString() {
        return scanner.nextLine();
    }

    int getInt() {
        return scanner.nextInt();
    }
}
