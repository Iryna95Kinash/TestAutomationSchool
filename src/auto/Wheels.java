package src.auto;

public class Wheels {
    private String size;
    private String type;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheels {" +
                "size = '" + size + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}
