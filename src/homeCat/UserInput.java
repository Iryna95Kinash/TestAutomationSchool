package src.homeCat;

import java.util.Scanner;

public class UserInput {

    String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    Double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
