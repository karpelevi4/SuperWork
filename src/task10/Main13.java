package task10;
import java.util.Scanner;

/* Вывести члены последовательности с нечетными номерами

Дана последовательность натуральных чисел (одно число в строке),
завершающаяся числом 0. Выведите первое, третье, пятое и т.д. из
введенных чисел. Завершающий ноль выводить не надо. В этой задаче
нельзя использовать глобальные переменные и передавать какие-либо параметры
в рекурсивную функцию. Функция получает данные, считывая их с клавиатуры.
Функция не возвращает значение, а сразу же выводит результат на экран.
Основная программа должна состоять только из вызова этой функции. */

public class Main13 {

    public static void recFunc2() {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x > 0) {
            int y = s.nextInt();
            System.out.println(x);
            if (y > 0) {
                recFunc2();
            }
        }
    }

    public static void main(String[] args) {
        recFunc2();
    }
}
