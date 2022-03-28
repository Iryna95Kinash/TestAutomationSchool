package src.auto;

public class STO {
    void changeVolume(Automobile automobile, Double engineVolume) {
        automobile.getEngine().setVolume(engineVolume);
    }
    void changeCylinders(Automobile automobile, Double engineCylinders) {
        automobile.getEngine().setCylinders(engineCylinders);
    }
    void changeCapacity(Automobile automobile, Double tankCapacity) {
        automobile.getTank().setCapacity(tankCapacity);
    }
    void changeFrontWheelSize(Automobile automobile, String FrontWheelSize) {
        automobile.getWheels().setSize(FrontWheelSize);
    }
    void changeFrontWheelType(Automobile automobile, String FrontWheelType) {
        automobile.getWheels().setType(FrontWheelType);
    }
}
