package src.static2;

import src.static2.Client;

public class ClientApp {
    public static void main(String[] args) {
        System.out.println(src.static2.Client.amount);

        User u1 = new User();

        String firstName = "Ivan", lastName = "Franko";
        if (src.static2.Client.CouldCreate(firstName, lastName)) {
            Client c1 = new Client(firstName, lastName);
        } else {
            System.out.println("Can't create the client with current data (where amount more than 8 characters)");
        }
        System.out.println(src.static2.Client.amount);
    }

}
//Щоб викликати статичне поле, не потрібно створювати об'єкт класу. Його можна викликати на пряму за допомогою імені класу і оператора "."
//Client c1 = new Client("Taras", "Shevchenko"); --- don't need OBJECT
//c1.kilkist = 1; --- not static access, used OBJECT
//Client.kilkist = 1; --- static access, used CLASS

