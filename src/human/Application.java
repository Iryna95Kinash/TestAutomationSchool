package src.human;

public class Application {
    public static void main(String[] args) {
        UserInput input = new UserInput();
        Printer printer = new Printer();
        Data data = new Data();

        Toy toy = new Toy();
        toy.setName("tiger");
        toy.setType("soft toy");

        Child child = new Child("SomeName", 6, "SomeGender");
        child.setChildsToy(toy);

        Human human = new Human("SomeName", 0, 200, "SomeCity");
        human.setChild(child);

        printer.text("Hi, today we will build a man with you. He can have:\n- age\n- height\n- name\n- home city");
        printer.text("Enter the name of human: ");
        String getName = input.getString();
        printer.text("Your human's name is - " + getName);
        printer.text("Enter the age of the human: ");
        int getAge = input.getInt();
        printer.text("Your human is " + getAge + " years old");
        printer.text("Enter the height of the human in cm: ");
        int getHeight = input.getInt();
        printer.text("Your human's height is " + getHeight + " cm");
        printer.text("Enter the city where your person lives: ");
        String getCity = input.getString();
        printer.text("Your human lives in " + getCity + " city");
        input.getString();
        data.nameChange(human, getName);
        data.ageChange(human, getAge);
        data.heightChange(human, getHeight);
        data.cityChange(human, getCity);
        System.out.println("You built this:\n" + human);
    }
}
