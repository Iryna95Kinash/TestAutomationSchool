package src.cycle;

public class Wheel {

    private int size;
    private String firm;

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

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", firm='" + firm + '\'' +
                '}';
    }
}







