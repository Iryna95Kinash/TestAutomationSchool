package src.homeCat;

public class VetMed {
    void sterilizeOperation(Cat cat) {
        if (cat.isSterilized()){
            System.out.println("We vaccinated your pet");
        }
        if (!cat.isSterilized()) {
            cat.setSterilized(true);
            System.out.println("We sterilize your pet");
        }
    }

    void checkCat(Cat cat) {
        System.out.println("Also checked your pet");
        Double catWeight = cat.getWeight();
        catWeight = catWeight - 0.5;
        cat.setWeight(catWeight);
    }

}
