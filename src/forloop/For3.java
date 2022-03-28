package src.forloop;

public class For3 {
    void none (int number){
        if (number > 0) {
            for (int i = 0; i < 5; i++) {
                System.out.println("more than 0");
            }
        } else if (number < 0) {
            for (int i = 0; i < 2; i++) {
                System.out.println("less than 0");
            }
        } else {
            System.out.println("Other choice");
        }
    }
}
