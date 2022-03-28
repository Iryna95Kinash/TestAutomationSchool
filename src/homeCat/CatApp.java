package src.homeCat;

import src.auto.Automobile;

public class CatApp {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();

        System.out.println("Hi, it's VetMed. Please fill some data about your pet");
        System.out.println("1. Enter name of your pet:");
        String catName = userInput.getString();
        System.out.println("2. Enter weight of your pet in kg:");
        Double catWeight = userInput.getDouble();

        System.out.println("3. Enter height of your pet in cm:");
        Double catHeight = userInput.getDouble();

        System.out.println("4. Is it your pet sterilize? (Yes or No)");
        String catSterilize = userInput.getString();
        boolean isSterilized = getBooleanDecision(catSterilize);

        System.out.println("Here is your pet:");
        Cat myCat = new Cat(catName, catWeight, catHeight, isSterilized);
        System.out.println(myCat);
        System.out.println("\nLet's send your pet for treatment to the clinic...");

        VetMed vetMed = new VetMed();
        vetMed.sterilizeOperation(myCat);
        vetMed.checkCat(myCat);

        System.out.println("\nYour pet after clinic");
        System.out.println(myCat);
    }

    static boolean getBooleanDecision(String str) {
        if (str.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }
}
