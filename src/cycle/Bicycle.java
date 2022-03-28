package src.cycle;

public class Bicycle {
    private Wheel frontWheel;
    private BackWheel backWheel;
    private Frame frame;

    @Override
    public String toString() {
        return "Bicycle{" +
                "frontWheel=" + frontWheel +
                ", backWheel=" + backWheel +
                ", frame=" + frame +
                '}';
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public BackWheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(BackWheel backWheel) {
        this.backWheel = backWheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }
}

