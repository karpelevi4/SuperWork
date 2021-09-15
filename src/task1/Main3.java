package task1;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите массив из целых чисел.");
        String m = s.nextLine();
        String[] numbers = m.split(" ");
        int sum = 0;
        for (String i : numbers) {
            sum += Integer.parseInt(i);
        }
        System.out.println("Сумма элементов с помощью цикла for: " + sum);
        sum = 0;
        int l = numbers.length - 1;
        while (l != -1) {
            sum += Integer.parseInt(numbers[l]);
            l--;
        }
        System.out.println("Сумма элементов с помощью цикла while: " + sum);
        sum = 0;
        l++;
        do {
            sum += Integer.parseInt(numbers[l]);
            l++;
        } while (l < numbers.length);
        System.out.println("Сумма элементов с помощью цикла do while: " + sum);
    }
}

