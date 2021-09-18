package task1;
/* Написать программу, которая с помощью метода вычисляет
 факториал числа (использовать управляющую конструкцию цикла),
 проверить работу метода. */

public class Main7 {

    //метод, вычисляющий факториал числа с помощью цикла
    public static int factorial(int n) {
        int f = 1;
        for (int i = n; i!=1; i--) {
            f *=i;
        }
        return f;
    }

    public static void main(String[] args) {

        //проверка метода, вычисляющего факториал
        System.out.println(factorial(5) == 2*3*4*5);
        System.out.println(factorial(10) == 2*3*4*5*6*7*8*9*10);
    }
}
