package src.firsttasks;

import java.util.Scanner;

public class MaksTask4 {

    public static void main(String[] args) {
        System.out.println("Hello my dear!");
          
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, my dear: ");
        
        String nameInput = scanner.nextLine();
        System.out.println("Hi, " + nameInput);
        
        System.out.println("Could you enter your age, my dear: ");
        //String ageInput = scanner.nextLine();
        //getStrNum("I greet you " + nameInput + " on the Earth. Your age is " + ageInput + " and you are adorable!");

        scanner.close();
    }
    
    static String getString() {

        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine();
        scanner.close();
        return nameInput;

    }

    static int getNum() {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();
        return number;

    }

    static void getStrNum(String name, int age) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I greet you " + name + " on the Earth. Your age is " + age + " and you are adorable!");

        scanner.close();

    }
}
