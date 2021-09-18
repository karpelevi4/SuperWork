package task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите массив из целых чисел. (Завершение - Ctrl+D)");

        //Заполнение списка числами, вводимыми пользователем.
        List<Integer> nList = new ArrayList<Integer>();
        while (s.hasNextInt()) {
            nList.add(s.nextInt());
        }

        //Создание массива из списка
        int[] nArray = new int[nList.size()];
        for(int i = 0; i < nList.size(); i++) nArray[i] = nList.get(i);

        //Цикл for
        int sum = 0;
        for (int i : nArray) {
            sum += i;
        }
        System.out.println("Сумма элементов с помощью цикла for: " + sum);

        //Цикл while
        sum = 0;
        int l = nArray.length - 1;
        while (l != -1) {
            sum += nArray[l];
            l--;
        }
        System.out.println("Сумма элементов с помощью цикла while: " + sum);

        //Цикл do while
        sum = 0;
        l++;
        do {
            sum += nArray[l];
            l++;
        } while (l < nArray.length);
        System.out.println("Сумма элементов с помощью цикла do while: " + sum);
    }
}

