package src;
public class Methods {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloTo("Charlie");

        sayHelloTo("Sally");
        
        int x = returnFive();
        System.out.println(x);

        // f(x) = x * x
        int result = square(5);
        System.out.println(result);
//--------------------------------------------------
        callCountry("Ukraine");
        callCountry("France");

        summ(50);

//-------------------------------------------------------

    }
    static int square (int x) {
        return x * x;
    }

    // this method returns an int type with the value 5 
    static int returnFive() {
         return 5; 
    }
    // this methos will say hello to whatever name is passed when called
    static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }
    // this method simply says "Hello, world" 
    static void sayHelloWorld() {
        System.out.println("Hello, world!");
    }
//-------------------------------------------------------
    static void callCountry(String country) {
        System.out.println("Your country is " + country);
    }

    static void summ(int i) {
        System.out.println(i + i);
    }


//-------------------------------------------------------

}
