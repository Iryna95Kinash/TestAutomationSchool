package src.cycle;

public class STO {
    void upgradeFrame(Bicycle bicycle, Frame newFrame) {
        bicycle.setFrame(newFrame);
    }

    void upgradeFrontWheel(Bicycle bicycle, Wheel newFrontWheel) {
        bicycle.setFrontWheel(newFrontWheel);
    }

    void upgradeBackWheel(Bicycle bicycle, BackWheel newBackWheel) {
        bicycle.setBackWheel(newBackWheel);
    }

    void upgradeFlatBarSize(Bicycle bicycle, int newSize) {
        bicycle.getFrame()
                .getFlatBar()
                .setSize(newSize);
    }

    void upgradeFlatBar(Bicycle bicycle, FlatBar newFlatBar) {
        bicycle.getFrame().setFlatBar(newFlatBar);
    }

    void setStops(Bicycle bicycle, boolean newStops) {
        bicycle.getFrame()
                .getFlatBar()
                .setHasStops(newStops);
    }

    void changeColour(Bicycle bicycle, String newColour) {
        bicycle.getFrame().setColour(newColour);
    }

    void addBottle(Bicycle bicycle, boolean newBottle) {
        bicycle.getFrame().setHasBottle(newBottle);
    }

    @Override
    public String toString() {
        return "STO{}";
    }
}
