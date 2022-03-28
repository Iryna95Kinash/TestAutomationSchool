package src.jappware;

import src.jappware.enums.Firm;

public class Computer {
    private boolean officeProperty;
    private int releaseYear;
    private Firm firm;
    private int memory;

    public boolean isOfficeProperty() {
        return officeProperty;
    }

    public void setOfficeProperty(boolean officeProperty) {
        this.officeProperty = officeProperty;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "officeProperty=" + officeProperty +
                ", releaseYear=" + releaseYear +
                ", firm=" + firm +
                ", memory=" + memory +
                '}';
    }
}
