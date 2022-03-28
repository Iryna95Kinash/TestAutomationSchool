package src.objectchanges;

import src.static2.User;

public class StudentApp {
    public static void main(String[] args) {
        Student stud0 = new Student("Dara", "Zdeb", 19, 2);
        Student stud1 = new Student("Vira", "Shum", 22, 3);
        Student stud2 = new Student("Ihor", "Peleh", 23, 4);
        Student stud3 = new Student("Vika", "Bila", 21, 3);
        Student stud4 = new Student("Olena", "Red", 18, 1);
        Student[] students = {stud0, stud1, stud2, stud3, stud4};
        printArr(students);
    }

    static void printArr(Student[] stds) {
        for (int i = 0; i < 5; i++) {
            Student stdt = stds[i];
            System.out.println(stdt);
        }
    }

}
