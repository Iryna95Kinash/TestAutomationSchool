package src.pet;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4, "Bongo", true);

        User user = new User();
        user.setName("John");
        user.setAge(30);
        user.setDog(dog);

        System.out.println(user);

        dog.voice("hav, hav");
    }
}