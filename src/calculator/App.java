package src.calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Printer printer = new Printer();

        printer.text("Hi...");
        for (;;) {
        printer.text("Enter your first number: ");
        UserInput input = new UserInput();
        int numf = input.getInput();
        printer.text("Your first number is: " + numf);
        printer.text("\nEnter your second number: ");
        int nums = input.getInput();
        printer.text("Your second number is: " + nums);
        printer.text("Select one of option:\n 1 - multiply\n 2 - divide\n 3 - subtract\n 4 - add\n press 0 to exit");
        printer.text("Enter your option: ");
        String option = input.getSymble();

            if (option.equals("1")) {
                printer.text("Multiply result is " + calculator.mult(numf, nums));
            } else if (option.equals("2")) {
                printer.text("Divide result is " + calculator.div(numf, nums));
            } else if (option.equals("3")) {
                printer.text("Subtract result is " + calculator.sub(numf, nums));
            } else if (option.equals("4")) {
                printer.text("Add result is " + calculator.add(numf, nums));
            }  else {
                printer.text("Incorrect data... \nThis option is not present in the list \nProgram is finished");
                break;
            }
        }
    }
}
