package src.human;

public class Human {
    Child child;

    String name;
    int age;
    int height;
    String city;

    public Human(String name, int age, int height, String city) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Human{" +
                "child=" + child +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", city='" + city + '\'' +
                '}';
    }
}
