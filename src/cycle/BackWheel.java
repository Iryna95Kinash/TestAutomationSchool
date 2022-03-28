package src.cycle;

public class BackWheel {
    private int size;
    private String firm;
    private int starSize;

    @Override
    public String toString() {
        return "BackWheel{" +
                "size=" + size +
                ", firm='" + firm + '\'' +
                ", starSize=" + starSize +
                '}';
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

    public int getStarSize() {
        return starSize;
    }

    public void setStarSize(int starSize) {
        this.starSize = starSize;
    }
}
