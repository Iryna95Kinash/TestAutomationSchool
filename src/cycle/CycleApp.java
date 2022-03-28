package src.cycle;

public class CycleApp {
    public static void main(String[] args) {
        Wheel frontWheel = new Wheel();
        frontWheel.setSize(5);
        frontWheel.setFirm("kh-v-z");

        BackWheel backWheel = new BackWheel();
        backWheel.setSize(4);
        backWheel.setFirm("Scott");
        backWheel.setStarSize(34);

        Frame frame = new Frame();
        frame.setFirm("rty");
        frame.setSize(52);
        frame.setHasAmort(true);
        frame.setColour("pink");

        Bicycle myBike = new Bicycle();
        myBike.setBackWheel(backWheel);
        myBike.setFrontWheel(frontWheel);
        myBike.setFrame(frame);

        System.out.println("Before upgrade: ");
        System.out.println(myBike);

        FlatBar flatBar = new FlatBar();
        flatBar.setSize(40);
        flatBar.setHasStops(false);
        flatBar.setHasFrontLight(false);

        Frame bestFrame = new Frame();
        bestFrame.setHasAmort(true);
        bestFrame.setFirm("Cannondale");
        bestFrame.setSize(50);
        bestFrame.setFlatBar(flatBar);
        bestFrame.setHasBackLight(true);

        Wheel newFrontWheel = new Wheel();
        newFrontWheel.setFirm("Cannondale");
        newFrontWheel.setSize(29);

        BackWheel newBackWheel = new BackWheel();
        newBackWheel.setFirm("CannondaleBack");
        newBackWheel.setSize(29);
        newBackWheel.setStarSize(28);

        STO sto = new STO();
        sto.upgradeFrame(myBike, bestFrame);
        sto.upgradeFlatBar(myBike, flatBar);
        sto.upgradeFrontWheel(myBike, newFrontWheel);
        sto.upgradeBackWheel(myBike, newBackWheel);

        System.out.println("After upgrade");
        System.out.println(myBike);

        sto.changeColour(myBike, "black");

        sto.addBottle(myBike, true);
        System.out.println("\nafter chanigng colour");

        System.out.println(myBike);

    }
}
