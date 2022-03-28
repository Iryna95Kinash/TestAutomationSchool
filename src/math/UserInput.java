package src.math;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    int getNumber(){
        int numberInput = scanner.nextInt();
        return numberInput;
    }

    String getText(){
        System.out.println("Enter text: ");
        String textInput = scanner.nextLine();
        return textInput;
    }

    public void close(){
        this.scanner.close();
    }
}
