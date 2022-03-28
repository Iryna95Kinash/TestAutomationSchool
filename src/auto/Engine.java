package src.auto;

public class Engine {
    private Double volume;
    private Double cylinders;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getCylinders() {
        return cylinders;
    }

    public void setCylinders(Double cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine {" +
                "volume = " + volume +
                ", cylinders = " + cylinders +
                '}';
    }
}
