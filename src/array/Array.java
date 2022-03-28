package src.array;

import src.static2.User;

public class Array {
    public static void main(String[] args) {
        //int number = 7;
//        int[] numbers = {7, 9, 15, 22, 29};
//        numbers[1] = 999;
//        //numbers = new int[5];      // виділити об'єм в пам'яті, достатнього розміру, щоб записати 5 значень типу int (int[] numbers = new int[5];)
//        //numbers[0] = 7; numbers[1] = 9; numbers[2] = 15; numbers[3] = 22; numbers[4] = 29;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);

        User user1 = new User();
        User ira = new User("Lilia", 34);
        User ira2 = ira;
        changeName(ira, "Olia");
        System.out.println(ira);
    }

    static void changeName(User usr, String newName) {
        usr.setName(newName);
    }
}
