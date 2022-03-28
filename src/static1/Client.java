package src.static1;

public class Client {
    private String firstName;
    private String lastName;

    static int amount = 0;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        amount++; // інкремент який збільшує значення змінної на 1 кожного разу коли створюється новий об'єкт класу Client
        System.out.println("object " + lastName + " created");
    }

    String getFirstName() {
        return firstName;
    }
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    String getLastName() {
        return lastName;
    }
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
