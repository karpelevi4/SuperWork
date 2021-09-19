package task10;

/* 	Цифры числа слева направо

Дано натуральное число N. Выведите все его цифры по одной, в
обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки,
массивы (ну и циклы, разумеется). Разрешена только рекурсия и
целочисленная арифметика */

public class Main14 {

    public static String recFunc3(int n) {
        if (n < 10) return Integer.toString(n);
        else return recFunc3(n / 10) + " " + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(recFunc3(12786));
    }
}
