package src.static2;

public class Client {
    private String firstName;
    private String lastName;
    int age;

    static int amount = 0;
    static boolean CouldCreate(String fn, String ln) {
        return ln.length() <= 8;
    }

    public Client(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

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

