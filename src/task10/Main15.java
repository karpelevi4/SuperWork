package task10;

/* 	Цифры числа справа налево

Дано натуральное число N. Выведите все его цифры по одной, в
обратном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки,
массивы (ну и циклы, разумеется). Разрешена только рекурсия
и целочисленная арифметика. */

public class Main15 {

    public static int recFunc4(int n) {
        if (n < 10) return n;
        else {
            System.out.print(n % 10 + " ");
            return recFunc4(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(recFunc4(94836));
    }
}
