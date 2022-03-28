package src.cycle;

public class Frame {
    private int size;
    private String firm;
    private boolean hasAmort;
    private FlatBar flatBar;
    private String colour;
    private boolean hasBackLight;
    private boolean hasBottle;

    public boolean isHasBackLight() {
        return hasBackLight;
    }

    public void setHasBackLight(boolean hasBackLight) {
        this.hasBackLight = hasBackLight;
    }

    public boolean isHasBottle() {
        return hasBottle;
    }

    public void setHasBottle(boolean hasBottle) {
        this.hasBottle = hasBottle;
    }

    public FlatBar getFlatBar() {
        return flatBar;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFlatBar(FlatBar flatBar) {
        this.flatBar = flatBar;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public boolean isHasAmort() {
        return hasAmort;
    }

    public void setHasAmort(boolean hasAmort) {
        this.hasAmort = hasAmort;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "size=" + size +
                ", firm='" + firm + '\'' +
                ", hasAmort=" + hasAmort +
                ", flatBar=" + flatBar +
                ", colour='" + colour + '\'' +
                ", hasBackLight=" + hasBackLight +
                ", hasBottle=" + hasBottle +
                '}';
    }
}
