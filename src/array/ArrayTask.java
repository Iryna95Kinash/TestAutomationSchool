package src.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        printNum(numbers);

        String[] lines = {"First", "Second", "Third", "Forth", "Fifth"};
        printLine(lines);

        int[] emptyArr = new int[10];
        printArr(emptyArr);

        String[] randArr = {"1F", "2S", "3T", "4F", "5F"};
        printRand(randArr);

        System.out.println("\nEnter some data");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int stringLength = userInput.length();
        if (stringLength > 5) {
            System.out.println("String more than 5 symbols");
        }

        if (stringLength < 5) {
            System.out.println("String less than 5 symbols");
        }

        if (stringLength == 5) {
            System.out.println("String = 5 symbols");
        }

    }
    static void printNum(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int numb = num[i];
            System.out.println(numb);
        }
    }

    static void printLine(String[] text) {
        for (int i = 0; i < text.length; i++) {
            String line = text[i];
            System.out.println(line);
        }
    }

    static void printArr(int[] empty) {
        for (int i = 0; i < empty.length; i++) {
            empty[i] = i + 6;
            System.out.println(empty[i]);
        }
    }

    static void printRand(String[] randomizer) {
        Random random =new Random();
        int randomNumb = random.nextInt(randomizer.length);
        System.out.println(randomizer[randomNumb]);
    }
}
