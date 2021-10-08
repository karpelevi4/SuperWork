package task12;

import java.util.Arrays;
import java.util.Random;

public class TestInsertion {

    public static void fillArray(Student[] arrayOfStudents) {
        for (int i=0; i < arrayOfStudents.length; i++) {
            arrayOfStudents[i] = new Student();
        }
    }

    public static void main(String[] args) {

        //создание массива
        Student[] arrayOfStudents = new Student[30];

        Random r = new Random();

        //заполнение массива
        fillArray(arrayOfStudents);

        //создание массива из номеров
        int[] iDNumbers = new int[arrayOfStudents.length];
        for (int i=0; i < arrayOfStudents.length; i++) {
            iDNumbers[i] = arrayOfStudents[i].getiDNumber();
        }

        System.out.println(Arrays.toString(iDNumbers));

        for (int left = 0; left < iDNumbers.length; left++) {

            // Вытаскиваем значение элемента
            int value = iDNumbers[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;

            for (; i >= 0; i--) {

                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < iDNumbers[i]) {
                    iDNumbers[i + 1] = iDNumbers[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumbers[i + 1] = value;
        }

        System.out.println(Arrays.toString(iDNumbers));
    }
}
