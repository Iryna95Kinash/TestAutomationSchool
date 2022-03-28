package src.firsttasks;

//import javax.sql.rowset.spi.SyncResolver;

public class AndriyTask1 {
    
    public static void main(String[] args) {
         
        int calculator56 = summ(10, 25);
        System.out.println(calculator56);

        int three = summ3(30, 50, 20);
        System.out.println(three);

        int res = summ3(12, 15, 13);
        System.out.println(res);
    }

    static int summ(int numb1, int numb2) {
        return numb1 + numb2;
    }

    static int summ3(int numb1, int numb2, int numb3) {
        return numb1 + numb2 + numb3;
    }
}
