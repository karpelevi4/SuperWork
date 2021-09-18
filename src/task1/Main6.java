package task1;
import java.util.Random;

/*
Написать программу, в результате которой генерируется массив
целых чисел случайным образом, вывести его на экран, отсортировать его,
и снова вывести на экран (использовать два подхода к генерации случайных
чисел – метод random() класса Math и класс Random)
*/

public class Main6 {
    public static void main(String[] args) {

        //генерация массива целых чисел случайным образом с помощью класса Random
        Random r = new Random();
        int size1 = r.nextInt(20);
        int[] m = new int[size1];
        for (int i=0; i<m.length; i++) m[i] = r.nextInt(100);

        //вывод массива на экран
        System.out.println("Массив, сгенерированный с помощью класса Random:");
        for (int i: m) System.out.print(i + " ");

        //сортировка массива (bubble sort)
        for (int i = 0; i < m.length-1; i++)
            for (int j = 0; j < m.length-i-1; j++)
                if (m[j] > m[j+1]) {
                    int t = m[j];
                    m[j] = m[j+1];
                    m[j+1] = t;
                }

        //вывод отсортированного массива
        System.out.println("\nОтсортированный массив:");
        for (int i: m) System.out.print(i + " ");

        //генерация массива целых чисел случайным образом с помощью метода random() класса Math
        int size2 = (int)(Math.random()*20);
        int[] n = new int[size2];
        for (int i=0; i<n.length; i++) n[i] = (int)(Math.random()*100);

        //вывод массива на экран
        System.out.println("\n\nМассив, сгенерированный с помощью метода random() класса Math:");
        for (int i: n) System.out.print(i + " ");

        //сортировка массива (bubble sort)
        for (int i = 0; i < n.length-1; i++)
            for (int j = 0; j < n.length-i-1; j++)
                if (n[j] > n[j+1]) {
                    int t = n[j];
                    n[j] = n[j+1];
                    n[j+1] = t;
                }

        //вывод отсортированного массива
        System.out.println("\nОтсортированный массив:");
        for (int i: n) System.out.print(i + " ");
    }
}
