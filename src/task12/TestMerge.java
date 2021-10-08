package task12;

import java.util.Random;

public class TestMerge {

    public static void main(String[] args) {

        Student[] arrayOfStudents = new Student[30];

        Random r = new Random();

        for (int i = 0; i < arrayOfStudents.length; i++) {
            int id = r.nextInt(100);
            int gpa = r.nextInt(100);
            arrayOfStudents[i] = new Student();
        }
    }
}
