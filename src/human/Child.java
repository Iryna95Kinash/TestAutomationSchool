package src.human;

public class Child {

    Toy childsToy;
    String name;
    int age;
    String gender;

    public Child(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childsToy=" + childsToy +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Toy getChildsToy() {
        return childsToy;
    }

    public void setChildsToy(Toy childsToy) {
        this.childsToy = childsToy;
    }
}
