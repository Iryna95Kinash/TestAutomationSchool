package src.homeCat;

public class Cat {
    private String name;
    private Double weight;
    private Double height;
    private boolean sterilized;

    public Cat(String name, Double weight, Double height, boolean sterelized) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.sterilized = sterelized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", height = " + height +
                ", sterelized = " + sterilized +
                '}';
    }
}
