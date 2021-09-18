package task1;

/* Написать программу, в результате которой выводятся
на экран аргументы командной строки в цикле for. */

public class Main4 {
    public static void main(String[] args) {
        for (String i: args)
            System.out.println(i);
    }
}
