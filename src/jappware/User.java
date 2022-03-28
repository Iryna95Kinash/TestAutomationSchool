package src.jappware;

public class User {
    private String name;
    private Computer computer;
    private Payment payment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", computer=" + computer +
                ", payment=" + payment +
                '}';
    }
}
