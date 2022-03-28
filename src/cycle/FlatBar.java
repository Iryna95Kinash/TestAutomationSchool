package src.cycle;

public class FlatBar {
    private int size;
    private boolean hasStops;
    private boolean hasFrontLight;

    public boolean isHasFrontLight() {
        return hasFrontLight;
    }

    public void setHasFrontLight(boolean hasFrontLight) {
        this.hasFrontLight = hasFrontLight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasStops() {
        return hasStops;
    }

    public void setHasStops(boolean hasStops) {
        this.hasStops = hasStops;
    }

    @Override
    public String toString() {
        return "FlatBar{" +
                "size=" + size +
                ", hasStops=" + hasStops +
                ", hasFrontLight=" + hasFrontLight +
                '}';
    }
}
