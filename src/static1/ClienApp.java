package src.static1;

public class ClienApp {
    public static void main(String[] args) {
        System.out.println(Client.amount);
        Client c1 = new Client("Ivan", "Franko");
        Client c2 = new Client("Lesia", "Ukrainka");
        Client c3 = new Client("Bohdan", "Khmelnutskyy");
        AddMoreClients();
        System.out.println(Client.amount);
    }
    public static void AddMoreClients() {
        Client c4 = new Client("Taras", "Shvchenko");
        Client c5 = new Client("Panas", "Myrnyy");
    }
}
//Щоб викликати статичне поле, не потрібно створювати об'єкт класу. Його можна викликати на пряму за допомогою імені класу і оператора "."
//Client c1 = new Client("Taras", "Shevchenko"); --- don't need OBJECT
//c1.kilkist = 1; --- not static access, used OBJECT
//Client.kilkist = 1; --- static access, used CLASS