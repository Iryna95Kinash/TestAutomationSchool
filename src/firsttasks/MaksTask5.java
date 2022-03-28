package src.firsttasks;

public class  MaksTask5 {

    public static void main(String[] args) {
        int a = summ2(2, 4);
        int b = summ3(70,80, 50);
        int c = sqr(9);
        int d = mirror(34);
        int e = summ5(1, 2, 4, 5, 6);
        System.out.println("" + a + " " + b + " " + c + " " + d + " " + e);
    }
    static int summ2(int numb1, int numb2) {
        return numb1 + numb2;
    }

    static int summ3(int numb1, int numb2, int numb3) {
        int a = summ2(numb1, numb2);
        return a + numb3;
    }

    static int summ5(int numb1, int numb2, int numb3, int numb4, int numb5) {
        int a = summ2(numb1, numb2);
        int b = summ3(numb3, numb4, numb5);
        return a + b;
    }

    static int sqr(int numb) {
        return numb * numb;
    }

    static int mirror(int numb) {
        return numb * -1;
    }

    
}
