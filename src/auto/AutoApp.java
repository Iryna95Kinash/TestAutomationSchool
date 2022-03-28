package src.auto;

public class AutoApp {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Tank tank = new Tank();
        Wheels wheels = new Wheels();
        UserInput userInput = new UserInput();

        System.out.println("Hi, today we will create a car and go somewhere.");
        System.out.println("Enter the car brand of your dreams: ");
        String getBrand1 = userInput.getString();
        System.out.println("Cool, you have chosen: " + getBrand1);

        String userVariants = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("\n\nSelect next option:");
            if (!userVariants.contains("1")) {
                System.out.println("1. Create an engine for a car");
            }

            if (!userVariants.contains("2")) {
                System.out.println("2. Choose car wheels");
            }

            if (!userVariants.contains("3")) {
                System.out.println("3. Fill the tank");
            }
            String option = userInput.getString();

            if (option.equals("1")) {
                System.out.println("Enter engine volume (from 0.6 to 6.0)");
                Double getVolume1 = userInput.getDouble();
                for (;;) {
                    if (getVolume1 < 0.6) {
                        System.out.println("give me more");
                    }

                    if (getVolume1 > 6.0) {
                        System.out.println("it's too much");
                    }

                    if (getVolume1 >= 0.6 && getVolume1 <= 6.0) {
                        System.out.println("NICE");
                        engine.setVolume(getVolume1);
                        break;
                    }
                }
                System.out.println("You have chosen a " + getVolume1 + " volume engine");
                System.out.println("How many cylinders will the engine have (from 3 to 8)");
                Double getCylinders1 = userInput.getDouble();
                engine.setCylinders(getCylinders1);

                System.out.println("You chose " + getCylinders1 + " cylinders");
                userVariants = userVariants + "1";
            }

            if (option.equals("2")) {
                System.out.println("Choose wheels:\n 1. press 1 to select R16 size wheels\n 2. press 2 to select R17 size wheels");
                String getSize1 = userInput.getString();
                if (getSize1.equals("1")) {
                    wheels.setSize("R16");
                }
                if (getSize1.equals("2")) {
                    wheels.setSize("R17");
                }
                System.out.println("Choose type of wheels:\n 1. summer\n 2. winter\n 3. all-seasons");
                String getType1 = userInput.getString();
                if (getType1.equals("1")) {
                    wheels.setType("summer");
                }
                if (getType1.equals("2")) {
                    wheels.setType("winter");
                }
                if (getType1.equals("3")) {
                    wheels.setType("all-seasons");
                }
                userVariants = userVariants + "2";
            }

            if (option.equals("3")) {
                System.out.println("Fill the tank");
                for (;;) {
                    System.out.println("How many liters to pour into the tank? ");
                    Double capacity = userInput.getDouble();
                    if (capacity < 5) {
                        System.out.println("give me more");
                    }

                    if (capacity > 80) {
                        System.out.println("it's too much");
                    }

                    if (capacity > 4 && capacity < 81) {
                        System.out.println("nice");
                        tank.setCapacity(capacity);
                        break;
                    }
                }
                userVariants = userVariants + "3";
            }

        }

        Automobile myCar = new Automobile(getBrand1, engine, tank, wheels);


        System.out.println("\nCar of your dreams");
        System.out.println(myCar);
    }
}
