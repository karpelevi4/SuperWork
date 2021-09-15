package task1;
import java.util.Scanner;

public class Main3 {
    //задание 1
    //метод для получения суммы чисел массива
    public static int sum(int[] a) {
        int s = 0;
        for (int i: a) s += i;
        return s;
    }

    //задание 5
    //метод, вычисляющий факториал числа с помощью цикла
    public static int factorial(int n) {
        int f = 1;
        for (int i = n; i!=1; i--) {
            f *=i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите массив из целых чисел.");
        String m = s.nextLine();
        String[] numbers = m.split(" ");
        int sum = 0;
        for (String i : numbers) {
            sum += Integer.valueOf(i);
        }
        System.out.println("Сумма элементов с помощью цикла for: " + sum);
        sum = 0;
        int l = numbers.length - 1;
        while (l != -1) {
            sum += Integer.valueOf(numbers[l]);
            l--;
        }
        System.out.println("Сумма элементов с помощью цикла while: " + sum);
        sum = 0;
        l++;
        do {
            sum += Integer.valueOf(numbers[l]);
            l++;
        } while (l < numbers.length);
        System.out.println("Сумма элементов с помощью цикла do while: " + sum);
    }
}

