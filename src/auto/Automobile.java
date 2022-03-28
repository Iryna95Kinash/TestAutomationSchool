package src.auto;

public class Automobile {
    private String brand;
    private Engine engine;
    private Tank tank;
    private Wheels wheels;

    public Automobile(String brand, Engine engine, Tank tank, Wheels wheels) {
        this.brand = brand;
        this.engine = engine;
        this.tank = tank;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Automobile {" +
                "brand = '" + brand + '\'' +
                ", engine = " + engine +
                ", tank = " + tank +
                ", Wheels = " + wheels +
                '}';
    }
}


// 5+