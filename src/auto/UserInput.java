package src.auto;

import java.util.Scanner;

public class UserInput {


    String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    Double getDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
