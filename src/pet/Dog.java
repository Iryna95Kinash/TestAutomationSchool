package src.pet;

public class Dog {
    private String name;
    private int pawCount;
    private boolean isHungry;

    public Dog(int pawCount, String name, boolean isHungry) {
        this.pawCount = pawCount;
        this.name = name;
        this.isHungry = isHungry;
    }

    public void voice(String hav) {
        System.out.println(hav);
    }

    public int getPawCount() {
        return pawCount;
    }

    public void setPawCount(int pawCount) {
        this.pawCount = pawCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", pawCount=" + pawCount +
                ", isHungry=" + isHungry +
                '}';
    }
}
