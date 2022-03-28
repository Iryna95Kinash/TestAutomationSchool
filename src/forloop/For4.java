package src.forloop;

public class For4 {
    public static void main(String[] args) {
        For1 loop = new For1();
        For2 twoTypes = new For2();
        For3 bool = new For3();

        bool.none(-2);
        bool.none(3);
        twoTypes.meth("Some text", 6);
        //loop.infinity();

    }
}
 