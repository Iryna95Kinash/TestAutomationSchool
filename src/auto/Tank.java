package src.auto;

public class Tank {
    private Double capacity;

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tank {" +
                "capacity = " + capacity +
                '}';
    }
}
